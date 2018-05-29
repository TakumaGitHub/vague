package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.ProductSearchDAO;
import com.internousdev.vague.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 選択した商品を表示するためのアクションクラス
 * @author miyazaki
 *
 */
public class CreateReviewAction extends ActionSupport implements SessionAware{

	//フィールド

	private int id;

	private int product_id;

	private Map<String, Object> session;

	private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

	public String execute(){

		String result = SUCCESS;

		ProductDTO createReviewProductDTO = productSearchDAO.search(product_id);


		//ログインしていないとき
		if(!(session.containsKey("LoginUserDTO"))){

			return "login";

		}


		if(createReviewProductDTO != null && createReviewProductDTO.getId() != 0){

			session.put("CreateReviewProductDTO", createReviewProductDTO);


		}else{

			result = ERROR;

		}


		return result;


	}


	//フィールドのgetterとsetter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
