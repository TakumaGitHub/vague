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

	private String newPasswordConfirm = "";

	private String hidePassword;


	private String userIdErrorMsg;

	private String passwordErrorMsg;

	private String errorMsg;

	private LoginUserDTO loginUserDTO = new LoginUserDTO();

	private UserPasswordUpdateDAO userPasswordUpdateDAO = new UserPasswordUpdateDAO();


	public String execute() throws SQLException{

		String result = SUCCESS;



		//エラーメッセージチェック
		userIdErrorMsg = InputChecker.userIdChk(userId);
		passwordErrorMsg = InputChecker.passwordChk(newPassword);

		if(userIdErrorMsg != null || passwordErrorMsg != null){

			return ERROR;

		}

		if(!newPassword.equals(newPasswordConfirm)){

			passwordErrorMsg = "【新しいパスワードと確認用パスワードの値が一致していません】";
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
		//（字数を周囲に知られないためにパスワードの長さに関わらずパスワードの始めの1文字＋15文字分のアスタリスクを表示する）

		StringBuffer sb = new StringBuffer(newPassword.substring(0, 1));

		sb.append("***************");

		hidePassword = sb.toString();

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

	public String getNewPasswordConfirm() {
		return newPasswordConfirm;
	}


	public void setNewPasswordConfirm(String newPasswordConfirm) {
		this.newPasswordConfirm = newPasswordConfirm;
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
