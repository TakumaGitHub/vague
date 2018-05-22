package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.AddressRegiCompleteDAO;
import com.internousdev.vague.dto.AddressDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressRegiCompleteAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	private String errorMsg;

	public String execute() throws SQLException{

		String result = ERROR;

		AddressDTO addressDTO = new AddressDTO();

		addressDTO = (AddressDTO)session.get("AddressDTO");

		AddressRegiCompleteDAO addressRegiCompleteDAO = new AddressRegiCompleteDAO();

////		全く同じ内容のものが既にDBに格納されていないか判定。
		errorMsg = addressRegiCompleteDAO.doubleCheck(addressDTO);
		if(errorMsg != null) {
			return result;
		}

		int count = addressRegiCompleteDAO.registerAddress(addressDTO);
//		countで登録されたかの判定。
		if(count > 0) {
			session.remove("AddressDTO");
			result = SUCCESS;
		}

		return result;
	}


	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}


	public String getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


}
