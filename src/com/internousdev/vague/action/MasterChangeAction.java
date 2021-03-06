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

public class MasterChangeAction extends ActionSupport implements SessionAware  {

	//フィールド
	private Map<String, Object> session;

	private int productId;

	private String productName;

	private String productNameKana;

	private String productDescription;

	private int categoryId;

	private int productStock;

	private int price;

	private String imageFilePath;

	private String imageFileName;

	private String releaseDate;

	private String releaseCompany;


	private int maxProductId;

	private ProductDTO productDTO = new ProductDTO();

	private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

	private List<ProductDTO> productSearchDTOList;

	private CategorySearchDAO categorySearchDAO = new CategorySearchDAO();

	private List<CategoryDTO> categorySearchDTOList;

	//actionメソッド

	public String execute() throws SQLException{

		String result = SUCCESS;

		//ログインしていないとき
		if(!(session.containsKey("LoginUserDTO"))){

			return "login";

		}else if(((LoginUserDTO)session.get("LoginUserDTO")).getmFlg() != 1){

			return ERROR;

		}

		//商品テーブルから商品を取得
		ProductDTO masterBeforeChangeDTO = productSearchDAO.search(productId);

		//商品テーブルからすべての商品を情報を取得

		productSearchDTOList = productSearchDAO.searchAll();

		//カテゴリーテーブルから情報を取得

		categorySearchDTOList = categorySearchDAO.searchAll();

		//最も大きいproduct_idを取得
		for(ProductDTO PD : productSearchDTOList){

			if(PD.getProductId() >= maxProductId){

				maxProductId = PD.getProductId();

			}

		}

		//選択されたproduct_idの商品をテーブルから取得

		productDTO = productSearchDAO.search(productId);

			//フィールドにセットする

			productName = productDTO.getProductName();

			productNameKana = productDTO.getProductNameKana();

			productDescription = productDTO.getProductDescription();

			categoryId = productDTO.getCategoryId();

			productStock = productDTO.getProductStock();

			price = productDTO.getPrice();

			imageFilePath = productDTO.getImageFilePath();

			imageFileName = productDTO.getImageFileName();

			releaseDate = (productDTO.getReleaseDate().split("\\s"))[0];//1995-08-09 00:00:00

			releaseCompany = productDTO.getReleaseCompany();



		session.put("maxProductId", maxProductId);
		session.put("CategorySearchDTOList", categorySearchDTOList);
		session.put("masterChangeProductId", productId);
		session.put("MasterBeforeChangeDTO", masterBeforeChangeDTO);


		return result;

	}


	//フィールドのgetterとsetter

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductNameKana() {
		return productNameKana;
	}


	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getProductStock() {
		return productStock;
	}


	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getImageFilePath() {
		return imageFilePath;
	}


	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}


	public String getImageFileName() {
		return imageFileName;
	}


	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}



	public String getReleaseCompany() {
		return releaseCompany;
	}


	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

}
