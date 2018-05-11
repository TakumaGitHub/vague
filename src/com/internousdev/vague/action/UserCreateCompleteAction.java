package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.UserCreateDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private UserCreateDAO dao = new UserCreateDAO();

	public String execute() throws SQLException {
		dao.createUserInfo((LoginUserDTO)session.get("CreateUserDTO"));




		String result = SUCCESS;

		return result;

	}
@Override
	public void setSession(Map<String, Object> session){
	this.session = session;
}


}
