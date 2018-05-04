package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeActon extends ActionSupport implements SessionAware{

	//フィールド
	private Map<String, Object> session;


	public String execute(){


		//テストユーザー
		LoginUserDTO loginUserDTO = new LoginUserDTO();

		loginUserDTO.setId(3);
		loginUserDTO.setUserId("miyazaki");
		loginUserDTO.setFamilyName("宮崎");
		loginUserDTO.setFirstName("瞬");

		session.put("LoginUserDTO", loginUserDTO);

		return SUCCESS;

	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
