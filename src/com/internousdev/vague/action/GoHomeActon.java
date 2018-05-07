package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeActon extends ActionSupport implements SessionAware{

	//フィールド
	private Map<String, Object> session;

	private int mFlg;

	public String execute(){

		LoginUserDTO loginUserDTO = new LoginUserDTO();

		if(mFlg == 1){

			//管理ユーザー
			loginUserDTO = new LoginUserDTO();

			loginUserDTO.setId(2);
			loginUserDTO.setmFlg(1);
			loginUserDTO.setUserId("admin");

		}else{

			//テストユーザー
			loginUserDTO = new LoginUserDTO();

			loginUserDTO.setId(3);
			loginUserDTO.setUserId("miyazaki");
			loginUserDTO.setFamilyName("宮崎");
			loginUserDTO.setFirstName("瞬");


		}

		/**
		 * 仮ユーザーID
		 * if (!(session.containsKey("loginFlg")) && !(session.containsKey("tempUserId"))) {
			int tempUserId = Integer.valueOf((int) (Math.random() * 1000000000));
			boolean loginFlg = false;
			session.put("tempUserId", tempUserId);
			session.put("loginFlg", loginFlg);
		}
		 */


		session.put("LoginUserDTO", loginUserDTO);

		return SUCCESS;

	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public int getmFlg() {
		return mFlg;
	}


	public void setmFlg(int mFlg) {
		this.mFlg = mFlg;
	}


}
