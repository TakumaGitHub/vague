package com.internousdev.vague.action;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeActon extends ActionSupport implements SessionAware{

	//フィールド
	private Map<String, Object> session;

	private int mFlg;

	public String execute() throws NoSuchAlgorithmException{

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

		session.put("LoginUserDTO", loginUserDTO);



		 if (!(session.containsKey("LoginUserDTO")) && !(session.containsKey("tempUserId"))) {

			 byte[] randomByte = new byte[64];

			SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");

			sr.nextBytes(randomByte);

			StringBuffer sb = new StringBuffer();

			//128桁のランダムな文字列を発行
			for(byte RB : randomByte){

				sb.append(String.format("%02x", RB));

			}


			String tempUserId = sb.toString();
			session.put("tempUserId", tempUserId);

		}




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
