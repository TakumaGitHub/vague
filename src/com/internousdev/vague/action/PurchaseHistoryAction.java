package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.PurchaseHistoryDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

// 注文履歴ページ 担当：縄田
// マイページからとんでくる

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();
	public ArrayList<PurchaseHistoryDTO> purchaseHistoryList = new ArrayList<PurchaseHistoryDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {
		// ログインしてなければログインページに移動
		if (!session.containsKey("LoginUserDTO")) {
			return ERROR; //login.jspへ
		}

		// 履歴の削除がされているか否か、チェックしている
		if(deleteFlg == null) {
			String userId = ((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
			purchaseHistoryList = purchaseHistoryDAO.getPurchaseHistory(userId);
		}else if(deleteFlg.equals("1")) {
			delete();
		}

		String result = SUCCESS;
		session.put("PurchaseHistoryList", purchaseHistoryList);
		return result;
	}

	// 全件削除メソッド----------------------------------------------------------
	public void delete() throws SQLException {
		String userId = ((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
		purchaseHistoryDAO.deleteHistory(userId);
	}


	// getter,setter----------------------------------------------------------

	// deleteFlg
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public ArrayList<PurchaseHistoryDTO> getMyPageList(){
		return this.getMyPageList();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}