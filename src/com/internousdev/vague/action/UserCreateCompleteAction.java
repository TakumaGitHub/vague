package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dao.UserCreateDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	private UserCreateDAO dao = new UserCreateDAO();

	private CartDAO cartDAO = new CartDAO();

	private LoginUserDTO loginUserDTO;

	public String execute() throws SQLException {

		int ret = 0;

		if(!session.containsKey("CreateUserDTO")){

			return ERROR;

		}

		loginUserDTO = (LoginUserDTO)session.get("CreateUserDTO");

		ret = dao.createUserInfo(loginUserDTO);

		if(ret <= 0){

			return ERROR;

		}


		//新規登録したユーザーでログインするs
		session.put("LoginUserDTO",loginUserDTO);
		String tempUserId = session.get("tempUserId").toString();
		cartDAO.changeTempUserId(loginUserDTO.getUserId(),tempUserId);


		session.remove("CreateUserDTO");
		String result = SUCCESS;

		return result;

	}
@Override
	public void setSession(Map<String, Object> session){
	this.session = session;
}


}
