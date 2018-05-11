package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.UserPasswordUpdateDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserPasswordUpdateAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	private String userId = "";

	private String newPassword = "";

	private String hidePassword;


	private String userIdErrorMsg;

	private String passwordErrorMsg;

	private String errorMsg;

	private LoginUserDTO loginUserDTO = new LoginUserDTO();

	private UserPasswordUpdateDAO userPasswordUpdateDAO = new UserPasswordUpdateDAO();


	public String execute() throws SQLException{

		String result = SUCCESS;


		//ログインしているのにパスワード変更しようとしているときは、homeへ
		if(session.containsKey("LoginUserDTO")){

			return "home";

		}

		//エラーメッセージチェック
		userIdErrorMsg = InputChecker.userIdChk(userId);
		passwordErrorMsg = InputChecker.passwordChk(newPassword);

		if(userIdErrorMsg != null || passwordErrorMsg != null){

			return ERROR;

		}

		errorMsg = userPasswordUpdateDAO.isTrue(userId, newPassword);

		if(errorMsg != null){

			return ERROR;

		}


		//入力情報をLoginUserDTOに格納する
		loginUserDTO.setUserId(userId);
		loginUserDTO.setPassword(newPassword);

		//パスワードの一部を隠す

		if(newPassword.length() == 1){

			hidePassword = "*";

		}else if(newPassword.length() == 2){

			hidePassword = "**";

		}else{

			StringBuffer sb = new StringBuffer(newPassword.substring(0, 2));

			for(int i = 2; i < newPassword.length() ; i++){

				sb.append("*");

			}

			hidePassword = sb.toString();


		}

		session.put("UserPasswordUpdateDTO", loginUserDTO);
		session.put("hidePassword", hidePassword);


		return result;



	}


	//フィールドのgetterとsetter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getUserIdErrorMsg() {
		return userIdErrorMsg;
	}

	public void setUserIdErrorMsg(String userIdErrorMsg) {
		this.userIdErrorMsg = userIdErrorMsg;
	}

	public String getPasswordErrorMsg() {
		return passwordErrorMsg;
	}

	public void setPasswordErrorMsg(String passwordErrorMsg) {
		this.passwordErrorMsg = passwordErrorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}








}
