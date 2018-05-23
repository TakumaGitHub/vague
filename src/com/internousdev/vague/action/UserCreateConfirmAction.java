package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.UserCreateDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;

	private UserCreateDAO userCreateDAO = new UserCreateDAO();

	private Map<String, String> errorMsg;

	private String userIdErrorMsg;

	private String userId;

	private String password;

	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;

	private int sex;

	private String email;


	public String execute() throws SQLException{

		if(session.containsKey("LoginUserDTO")){

			return ERROR;

		}


		LoginUserDTO loginUserDTO = new LoginUserDTO();

		//セッションに格納（createUserDTO)
		loginUserDTO.setUserId(userId);
		loginUserDTO.setPassword(password);
		loginUserDTO.setFamilyName(familyName);
		loginUserDTO.setFirstName(firstName);
		loginUserDTO.setFamilyNameKana(familyNameKana);
		loginUserDTO.setFirstNameKana(firstNameKana);
		loginUserDTO.setSex(sex);
		loginUserDTO.setEmail(email);



		//インプットチェッカーで重複を確認
		errorMsg = InputChecker.createNewUserChk(loginUserDTO);
		userIdErrorMsg = userCreateDAO.getOverlapping(userId);

		if(!errorMsg.isEmpty() || userIdErrorMsg != null){

			session.remove("CreateUserDTO");
			return ERROR;

		}

		session.put("CreateUserDTO", loginUserDTO);
		session.put("sex", this.sex);



		return SUCCESS;



	}

@Override
public void setSession(Map<String, Object> session){
	this.session = session;
}
public Map<String, String> getErrorMsg() {
	return errorMsg;
}
public void setErrorMsg(Map<String, String> errorMsg) {
	this.errorMsg = errorMsg;
}
public String getUserIdErrorMsg() {
	return userIdErrorMsg;
}
public void setUserIdErrorMsg(String userIdErrorMsg) {
	this.userIdErrorMsg = userIdErrorMsg;
}
public Map<String, Object> getSession() {
	return session;
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
public String getFamilyName() {
	return familyName;
}
public void setFamilyName(String familyName) {
	this.familyName = familyName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getFamilyNameKana() {
	return familyNameKana;
}
public void setFamilyNameKana(String familyNameKana) {
	this.familyNameKana = familyNameKana;
}
public String getFirstNameKana() {
	return firstNameKana;
}
public void setFirstNameKana(String firstNameKana) {
	this.firstNameKana = firstNameKana;
}
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
