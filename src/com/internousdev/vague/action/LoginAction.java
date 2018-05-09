package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.vague.dao.UserCreateDAO;
import com.internousdev.vague.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String userId;
	private String password;
	private String result;
	private Map<String,Object> session;

	public String execute() throws SQLException {
		UserCreateDAO dao = new UserCreateDAO();
		LoginDTO dto = new LoginDTO();

		try{
			result = ERROR;
			dto = dao.getUserInfo(userId,password);
			//dtoをセッションに格納
			session.put("LoginUserDTO",dto);

			if(dto.getUserId() != null){
				result = SUCCESS;
			}
			return result;
		}catch (SQLException e){
			e.printStackTrace();
		}
		return result;
}




	}

