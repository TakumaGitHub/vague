package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.ProductSearchDAO;
import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.DivideDTOList;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 商品を検索するActionクラス
 * @author user
 *
 */
public class ProductSearchAction extends ActionSupport implements SessionAware{

	//フィールド
	private Map<String, Object> session;

	private String retrievalValue = "";

	private int category_id = 0;

	private int rule = 0;

	private int  ListNumber = 0;

	private String errorMsg;

	private String inputErrorMsg;

	private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

	private List<ProductDTO> productSearchDTOList;

	private List<List<ProductDTO>> searchList = new ArrayList<List<ProductDTO>>();



	public String execute() throws SQLException{

		String result = SUCCESS;

		inputErrorMsg = InputChecker.keywordChk(retrievalValue);

		productSearchDTOList = productSearchDAO.search(retrievalValue, category_id, rule);

		//該当する商品がなかった場合は、「検索結果がありません」と表示
		if(!(inputErrorMsg.isEmpty())){

			session.remove("SearchList");


		}else if(productSearchDTOList.isEmpty()){

			errorMsg = "検索結果がありません";
			session.put("SearchList", searchList);

		}else{

			//商品の検索リストを9個ずつに分けて、リストに格納する。
			searchList = new DivideDTOList<ProductDTO>().divide(productSearchDTOList, 9);
			session.put("SearchList", searchList.get(ListNumber));

		}

		//商品一覧のページ数
		session.put("SearchListLength", searchList.size());


		//検索キーワード、検索カテゴリー、検索条件をセッションに格納する
		session.put("retrievalValue", retrievalValue);
		session.put("retrievalCategory_id", category_id);
		session.put("retrievalRule", rule);


		return result;

	}


	//フィールドのgetterとsetter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getRetrievalValue() {
		return retrievalValue;
	}


	public void setRetrievalValue(String retrievalValue) {
		this.retrievalValue = retrievalValue;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public int getRule() {
		return rule;
	}


	public void setRule(int rule) {
		this.rule = rule;
	}


	public int getListNumber() {
		return ListNumber;
	}


	public void setListNumber(int listNumber) {
		ListNumber = listNumber;
	}


	public String getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	public String getInputErrorMsg() {
		return inputErrorMsg;
	}


	public void setInputErrorMsg(String inputErrorMsg) {
		this.inputErrorMsg = inputErrorMsg;
	}




}
