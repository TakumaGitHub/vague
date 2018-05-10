package com.internousdev.vague.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.ReviewDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.ReviewMyListDTO;
import com.internousdev.vague.util.DivideDTOList;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewMyListAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	private int deleteFlg = 0;

	private List<Integer> review_id;

	private int  ListNumber = 0;



	private String user_id;

	private List<ReviewMyListDTO> searchMyListDTOList = new ArrayList<ReviewMyListDTO>();

	private List<List<ReviewMyListDTO>> reviewMyListDTOList = new ArrayList<List<ReviewMyListDTO>>();

	private ReviewDAO reviewDAO = new ReviewDAO();



	public String execute(){

		String result = SUCCESS;

		//セッションからログインユーザーのuser_idを取得

		if(!(session.containsKey("LoginUserDTO"))){

			return "login";

		}

		user_id = ((LoginUserDTO)session.get("LoginUserDTO")).getUserId();


		if(deleteFlg == 1){

			//選択したレビューを削除
			reviewDAO.deleteChoose(review_id);

		}else if(deleteFlg == 2){

			//全レビューを一括削除
			reviewDAO.deleteAll(user_id);

		}



		//ログインユーザーのレビューを取得する
		searchMyListDTOList = reviewDAO.searchMyList(user_id);

		if(searchMyListDTOList.isEmpty()){

			session.put("ReviewMyListDTOList", reviewMyListDTOList);

		}else{

			//レビューの検索リストを5個ずつに分けて、リストに格納する。
			reviewMyListDTOList = new DivideDTOList<ReviewMyListDTO>().divide(searchMyListDTOList, 5);
			session.put("ReviewMyListDTOList", reviewMyListDTOList.get(ListNumber));

		}

		session.put("reviewMyListLength",reviewMyListDTOList.size());

		return result;


	}



	//フィールドのgetterとsetter
	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(int deleteFlg) {
		this.deleteFlg = deleteFlg;
	}




	public List<Integer> getReview_id() {
		return review_id;
	}



	public void setReview_id(List<Integer> review_id) {
		this.review_id = review_id;
	}



	public int getListNumber() {
		return ListNumber;
	}



	public void setListNumber(int listNumber) {
		ListNumber = listNumber;
	}

}
