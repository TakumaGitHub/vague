package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.ProductDetailsDAO;
import com.internousdev.vague.dao.ReviewDAO;
import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.dto.ProductReviewDTO;
import com.internousdev.vague.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;



public class ProductDetailsAction extends ActionSupport implements SessionAware {

	//セッション情報取得
	public Map<String, Object> session;

	private String id;
	private String productId;
	private String categoryName;
	private String stock;
	private String error;
	private int insertFlg;
	private int price;
	private int categoryId;

	//購入個数リスト
	private List<Integer> stockList = new ArrayList<Integer>();
	//商品詳細リスト
	public ProductDTO detail = new ProductDTO();
	public List<ProductDTO> detailsList = new ArrayList<ProductDTO>();

	//お勧めリスト
	public List<ProductDTO> suggestList = new ArrayList<ProductDTO>();
	private ProductDetailsDAO productDetailsDAO = new ProductDetailsDAO();

	//レビューリスト
	public List<ProductReviewDTO> reviewList = new ArrayList<ProductReviewDTO>();
	private ReviewDTO review = new ReviewDTO();
	private ReviewDAO reviewDAO = new ReviewDAO();

	public String execute() throws SQLException {
		//商品詳細取得
		try {
			detail = productDetailsDAO.getProductDetailsInfo(productId);
			if(detail != null){
				session.put("DetailProductDTO", detail);
			}else{
				return ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
		}



		//お勧めリスト情報取得
		try {
			suggestList = productDetailsDAO.getSuggestProductInfo(categoryId,productId);
			if(suggestList != null) {
				session.put("SuggestList", suggestList);

			}else{
				return ERROR;
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		//レビュー情報取得
		try {
			reviewList = reviewDAO.searchProductDetails(Integer.parseInt(productId)) ;
			if(reviewList != null){
				session.put("ReviewList", reviewList);

			}else{
				return ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		//在庫の選択表示用リスト
		for(int i = 1; i <= detail.getProductStock(); i++) {
			stockList.add(i);
		}
		if (session.get("category_id") != null) {
			return ERROR;
		}
		String result = SUCCESS;
		return result;

	}

	@Override
    public void setSession(Map<String, Object> session) {
       this.session = session;
    }

    public Map<String, Object> getSession() {
       return this.session;
    }
    		public String getProductId(){
    			return productId;
    		}
    		public void setProductId(String productId){
    			this.productId = productId;
    		}
    		public String getCategoryName(){
    			return categoryName;
    		}
    		public void setCategoryName(String categoryName){
    			this.categoryName = categoryName;
    		}

    		public int getCategoryId(){
    			return categoryId;
    		}
    		public void setCategoryId(int categoryId){
    			this.categoryId = categoryId;
    		}

			public String getStock() {
				return stock;
			}

			public void setStock(String stock) {
				this.stock = stock;
			}


			public int getPrice() {
				return price;
			}

			public void setPrice(int price) {
				this.price = price;
			}

			public int getInsertFlg() {
				return insertFlg;
			}

			public void setInsertFlg(int insertFlg) {
				this.insertFlg = insertFlg;
			}

			public List<Integer> getStockList() {
				return stockList;
			}

			public void setStockList(List<Integer> stockList) {
				this.stockList = stockList;
			}

			public List<ProductDTO> getDetailsList() {
				return detailsList;
			}

			public void setDetailsList(List<ProductDTO> detailsList) {
				this.detailsList = detailsList;
			}

			public ProductDetailsDAO getProductDetailsDAO() {
				return productDetailsDAO;
			}

			public void setProductDetailsDAO(ProductDetailsDAO productDetailsDAO) {
				this.productDetailsDAO = productDetailsDAO;
			}

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}




			public String getError() {
				return error;
			}

			public void setError(String error) {
				this.error = error;
			}

			public ProductDTO getDetail() {
				return detail;
			}


			public List<ProductDTO> getSuggestList() {
				return suggestList;
			}

			public void setDetail(ProductDTO detail) {
				this.detail = detail;
			}



			public void setSuggestList(List<ProductDTO> suggestList) {
				this.suggestList = suggestList;
			}

}
