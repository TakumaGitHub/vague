package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.BuyItemCompleteDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 1,カート情報取得
 * 2,在庫更新
 * 3,購入履歴に登録
 * 4,カートテーブルの情報を削除する
 */

public class BuyItemCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	private int addressId;

	private List<String> errorMsg;//購買個数が在庫より多いか

	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	public String execute() throws SQLException{

		String result = SUCCESS;

		if(!session.containsKey("LoginUserDTO")){

			return "login";

		}

		LoginUserDTO loginUserDTO = (LoginUserDTO)session.get("LoginUserDTO");

		String userId = loginUserDTO.getUserId();


		//購買個数が在庫より多いか

		errorMsg = buyItemCompleteDAO.compareCount(userId);

		if(!errorMsg.isEmpty()){

			return "cart";

		}

		//カートのテーブルから購入履歴のテーブルに情報を移す

		int addressId = Integer.parseInt(session.get("addressId").toString());

		int ret = buyItemCompleteDAO.moveTable(userId, addressId);

		if(ret <= 0){

			return ERROR;

		}

		//セッションの掃除
		session.remove("addressId");
		session.remove("ChooseAddressDTO");


		return result;


	}




	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




	public int getAddressId() {
		return addressId;
	}




	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}




	public List<String> getErrorMsg() {
		return errorMsg;
	}




	public void setErrorMsg(List<String> errorMsg) {
		this.errorMsg = errorMsg;
	}





}
