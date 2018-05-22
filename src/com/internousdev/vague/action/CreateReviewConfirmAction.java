package com.internousdev.vague.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.dto.ReviewDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewConfirmAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	private ReviewDTO createReviewCompleteDTO = new ReviewDTO();


	private String userId;

	private int  productId;



	private String reviewTitle = "";//100文字以内

	private String reviewBody = "";//255文字以内

	private String reviewScore;//5以下

	private Map<String, String> errorMsg = new HashMap<String, String>();

	private String accessKey = "true";


	public String execute(){

		String result = SUCCESS;


		//ログインしていないときはhome画面へ送り返す
		if(!(session.containsKey("LoginUserDTO"))){

			return "home";

		}

		//セッションからuserIdとproductIdを取得
		userId = ((LoginUserDTO)session.get("LoginUserDTO")).getUserId();

		productId = ((ProductDTO)session.get("CreateReviewProductDTO")).getProductId();

		//入力内容の審査

		try{

			errorMsg = InputChecker.reviewChk(reviewTitle, reviewBody, Integer.parseInt(reviewScore));

		}catch(NumberFormatException e){

			errorMsg.put("reviewScore", "【評価は5桁以下の整数で入力してください】");
			return ERROR;

		}


		if(!(errorMsg.isEmpty())){

			result = ERROR;
			session.remove("CreateReviewCompleteDTO",createReviewCompleteDTO);

		}else{

			//入力内容をReviewDTOに格納

			createReviewCompleteDTO.setUserId(userId);
			createReviewCompleteDTO.setProductId(productId);
			createReviewCompleteDTO.setReviewTitle(reviewTitle);
			createReviewCompleteDTO.setReviewBody(reviewBody);

			try{

				createReviewCompleteDTO.setReviewScore(Integer.parseInt(reviewScore));

			}catch(NumberFormatException e){

				errorMsg.put("reviewScore", "【評価は5桁以下の整数で入力してください】");
				return ERROR;

			}



			//入力内容をセッションに格納
			session.put("CreateReviewCompleteDTO",createReviewCompleteDTO);

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


	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public String getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(String reviewScore) {
		this.reviewScore = reviewScore;
	}


	public Map<String, String> getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(Map<String, String> errorMsg) {
		this.errorMsg = errorMsg;
	}


	public String getAccessKey() {
		return accessKey;
	}


	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}








}
