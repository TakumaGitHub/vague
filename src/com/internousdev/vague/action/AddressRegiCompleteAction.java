package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.AddressRegiCompleteDAO;
import com.internousdev.vague.dto.AddressDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressRegiCompleteAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public String execute() throws SQLException{

		String result = ERROR;

		AddressDTO addressDTO = new AddressDTO();

//		ConfirmActionでsessionに格納した値を、AddressDTOをインスタンス化した変数名[adderssDTO]に入れる。
		addressDTO = (AddressDTO)session.get("AddressDTO");

		AddressRegiCompleteDAO addressRegiCompleteDAO = new AddressRegiCompleteDAO();

//		CompleteDAOのregisterAddressメソッドにaddressDTOを入れDBに格納されたかどうかを確認。
//		⇨[DBに格納したら => trueを返す]

		int count = addressRegiCompleteDAO.registerAddress(addressDTO);

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

}
