package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateAction extends ActionSupport  implements SessionAware{

	private Map<String, Object> session;



	public String execute() throws SQLException{

		if(session.containsKey("LoginUserDTO")){

			return ERROR;

		}


		return SUCCESS;
	}



	//フィールドのgetter/setter


	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}





}
