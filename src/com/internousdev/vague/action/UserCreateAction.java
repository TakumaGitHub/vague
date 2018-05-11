package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateAction extends ActionSupport  implements SessionAware{

	private Map<String, Object> session;

	//userCreate.jspからの送信
	private String familyName;
	private String firstName;
	private String familyName_kana;
	private String firstName_kana;
	private int sex;
	private String email;
	private String loginId;
	private String password;
	//private int question;
	//private String answer;
	//セッションを利用するためにフィールド作成


	public String execute() throws SQLException{


	//inputCheckerにかけるためにLoginUserDTOに情報を格納
	LoginUserDTO dto = new LoginUserDTO();

	dto.setFamilyName("familyName");
	dto.setFirstName(firstName);
	dto.setFamilyNameKana(familyName_kana);
	dto.setFirstNameKana(firstName_kana);
	dto.setSex(sex);
	dto.setEmail(email);
	dto.setUserId(loginId);
	dto.setPassword(password);
	//dto.setQuestion(question);
	//dto.setAnswer(answer);

	session.put("CreateUserDTO", dto);

	icResult = InputChecker.createNewUserChk(dto);

	session.put("InputChecked",icResult);


	return SUCCESS;
	}



	//フィールドのgetter/setter
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
	public String getFamilyName_kana() {
		return familyName_kana;
	}
	public void setFamilyName_kana(String familyName_kana) {
		this.familyName_kana = familyName_kana;
	}
	public String getFirstName_kana() {
		return firstName_kana;
	}
	public void setFirstName_kana(String firstName_kana) {
		this.firstName_kana = firstName_kana;
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
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	public int getQuestion() {
		return question;
	}
	public void setQuestion(int question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	*/
	private Map<String,String> icResult;

	public Map<String, String> getIcResult() {
		return icResult;
	}

	public void setIcResult(Map<String, String> icResult) {
		this.icResult = icResult;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}





}
