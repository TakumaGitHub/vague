package com.internousdev.vague.action;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CategorySearchDAO;
import com.internousdev.vague.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport implements SessionAware{

	//フィールド
	private Map<String, Object> session;

	private CategorySearchDAO categorySearchDAO = new CategorySearchDAO();

	private List<CategoryDTO> categorytList = new ArrayList<CategoryDTO>();

	private int mFlg;

	public String execute() throws NoSuchAlgorithmException, SQLException{

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


		//カテゴリーテーブルから情報を取得

		 categorytList = categorySearchDAO.searchAll();

		 session.put("CategoryList", categorytList);


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
