package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dao.UserCreateDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String userId;
	private String password;
	private String result;
	private Map<String,Object> session;

	public String execute() throws SQLException {
		UserCreateDAO dao = new UserCreateDAO();
		LoginUserDTO dto = new LoginUserDTO();
		try{
			result = ERROR;
			dto = dao.getUserInfo(userId,password);

			if(dto.getUserId() != null){
				result = SUCCESS;
				//ログイン成功時に以下を使用
				CartDAO cartDAO = new CartDAO();
				String tempUserId = session.get("tempUserId").toString();
				cartDAO.changeTempUserId(userId,tempUserId);
				//dtoをセッションに格納
				session.put("LoginUserDTO",dto);
			}
			return result;
		}catch (SQLException e){
			e.printStackTrace();
		}
		return result;
}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}






	}

