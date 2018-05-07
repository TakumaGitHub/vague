package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.MasterDAO;
import com.internousdev.vague.dto.MasterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterChangeCompleteAction extends ActionSupport implements SessionAware {

	//フィールド
	private Map<String, Object> session;

	private MasterDTO masterDTO;

	private MasterDAO masterDAO = new MasterDAO();


	//actionメソッドs

	public String execute(){

		String result = SUCCESS;

		if(!(session.containsKey("MasterChangeCompleteDTO"))){

			return ERROR;

		}

		masterDTO = (MasterDTO)session.get("MasterChangeCompleteDTO");

		//商品情報を変更する
		masterDAO.update(masterDTO);


		//セッションの掃除
		session.remove("maxProductId");
		session.remove("CategorytSearchDTOList");
		session.remove("masterChangeProductId");
		session.remove("MasterChangeCompleteDTO");
		session.remove("MasterBeforeChangeDTO");


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
