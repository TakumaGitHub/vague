package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CategorySearchDAO;
import com.internousdev.vague.dao.ProductSearchDAO;
import com.internousdev.vague.dto.CategoryDTO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAddAction extends ActionSupport implements SessionAware{

	//フィールド
	private Map<String, Object> session;

	private int maxProductId;

	private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

	private CategorySearchDAO categorySearchDAO = new CategorySearchDAO();

	private List<ProductDTO> productSearchDTOList;

	private List<CategoryDTO> categorytSearchDTOList;


	public String execute() throws SQLException{

		String result = SUCCESS;

		//ログインしていないとき
		if(!(session.containsKey("LoginUserDTO"))){

			return "login";

		}else if(((LoginUserDTO)session.get("LoginUserDTO")).getmFlg() != 1){

			return ERROR;

		}

		//商品テーブルからすべての商品を情報を取得

		productSearchDTOList = productSearchDAO.searchAll();

		//カテゴリーテーブルから情報を取得

		categorytSearchDTOList = categorySearchDAO.searchAll();

		//最も大きいproduct_idを取得
		for(ProductDTO PD : productSearchDTOList){

			if(PD.getProductId() >= maxProductId){

				maxProductId = PD.getProductId();

			}

		}

		session.put("maxProductId", maxProductId);
		session.put("CategorytSearchDTOList", categorytSearchDTOList);

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
