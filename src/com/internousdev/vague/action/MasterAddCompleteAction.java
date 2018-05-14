package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.MasterDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.MasterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAddCompleteAction extends ActionSupport implements SessionAware {

	//フィールド
	private Map<String, Object> session;

	private MasterDTO masterDTO;

	private MasterDAO masterDAO = new MasterDAO();

	//actionメソッド
	public String execute(){

		String result = SUCCESS;

		int ret = 0;

		//ログインしていないとき
		if(!(session.containsKey("LoginUserDTO"))){

			return "login";

		}else if(((LoginUserDTO)session.get("LoginUserDTO")).getmFlg() != 1){

			return "home";

		}

		if(!(session.containsKey("MasterAddCompleteDTO"))){

			return ERROR;

		}

		masterDTO = (MasterDTO)session.get("MasterAddCompleteDTO");

		ret = masterDAO.insert(masterDTO);

		if(ret <= 0){

			return ERROR;

		}

		session.remove("MasterAddCompleteDTO");
		session.remove("maxProductId");
		session.remove("CategorytSearchDTOList");

		return result;


	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}






}
