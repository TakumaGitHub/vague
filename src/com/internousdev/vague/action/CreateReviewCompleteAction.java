package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.ReviewDAO;
import com.internousdev.vague.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewCompleteAction  extends ActionSupport implements SessionAware{


	private Map<String, Object> session;

	private ReviewDAO reviewDAO = new ReviewDAO();

	public String execute() throws SQLException{

		String result = SUCCESS;

		//何件更新したか
		int ret = 0;


		//セッションにレビューの投稿内容がセットされていないとき
		if(!(session.containsKey("CreateReviewCompleteDTO"))){

			result = ERROR;

		}else{

			//レビューテーブルに挿入
			ret = reviewDAO.insert((ReviewDTO)session.get("CreateReviewCompleteDTO"));

			if(ret <= 0){

				result = ERROR;

			}


		}


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
