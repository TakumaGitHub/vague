package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.UserPasswordUpdateDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserPasswordUpdateCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	private LoginUserDTO loginUserDTO = new LoginUserDTO();

	private UserPasswordUpdateDAO userPasswordUpdateDAO = new UserPasswordUpdateDAO();

	public String execute(){

		String result = ERROR;

		int ret = 0;

		//不正なアクセスはhome.jspへ送り返す
		if(session.containsKey("LoginUserDTO") || !session.containsKey("UserPasswordUpdateDTO")){

			return "home";

		}


		loginUserDTO = (LoginUserDTO)session.get("UserPasswordUpdateDTO");

		//新しいパスワードに更新する
		ret = userPasswordUpdateDAO.updatePassword(loginUserDTO);

		if(ret > 0){

			result = SUCCESS;

		}

		//セッションの掃除
		session.remove("UserPasswordUpdateDTO");
		session.remove("hidePassword");


		return result;


	}


	//フィールドのgetterとsetter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
