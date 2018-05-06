package com.internousdev.vague.action;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CategorySearchDAO;
import com.internousdev.vague.dao.ProductSearchDAO;
import com.internousdev.vague.dto.CategoryDTO;
import com.internousdev.vague.dto.MasterDTO;
import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAddConfirmAction extends ActionSupport implements SessionAware {

	//フィールド
	private Map<String, Object> session;

	private Map<String, String> errorMsg;

	//ユーザーがアップロードするファイル
	private File userImage;

	//ユーザーがアップロードするファイルの名前
	private String userImageFileName;

	//ProductDTOのフィールド
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

		private String year;

		private String month;

		private String day;

	private String releaseCompany;

	private int status = 1;

	//コピー先のファイルパス
	private String toImageFilePath;
	//コピー元のファイルパス
	private String fromImageFilePath;


	//全ての商品情報を入れるリスト
	private List<ProductDTO> productSearchDTOList;

	private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

	private ProductDTO productDTO = new ProductDTO();

	private MasterDTO masterDTO = new MasterDTO();

	private CategorySearchDAO categorySearchDAO;


	/**
	 * 入力情報をMasterDTOに格納する
	 */
	public String execute() throws SQLException{

		String result = ERROR;

		String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images");

		//全ての商品情報を引き出す
		productSearchDTOList = productSearchDAO.searchAll();


		//コピー元のファイルパスを作成
		fromImageFilePath = userImage.getPath();

		//コピー先のファイルパスを作成
		imageFileName = userImageFileName;

		for(CategoryDTO CD : categorySearchDAO.searchAll()){

			if(categoryId == CD.getCategoryId()){

				imageFilePath = "images" + "/" +  CD.getCategoryId() + CD.getCategoryName() + "/" + userImageFileName;
				toImageFilePath = filePath + "\\" + CD.getCategoryId() + CD.getCategoryName() + "\\" + userImageFileName;

			}

		}



			//入力内容をMasterDTOに格納する

			productDTO.setProductId(productId);
			productDTO.setProductName(productName);
			productDTO.setProductNameKana(productNameKana);
			productDTO.setProductDescription(productDescription);
			productDTO.setCategoryId(categoryId);
			productDTO.setProductStock(productStock);
			productDTO.setPrice(price);
			productDTO.setImageFilePath(imageFilePath);
			productDTO.setImageFileName(imageFileName);

				//発売日を整形
				year = String.format("%4d", year);
				month = String.format("%02d", month);
				day = String.format("%02d", day);
				releaseDate = year + day + month;

			productDTO.setReleaseDate(releaseDate);
			productDTO.setReleaseCompany(releaseCompany);
			productDTO.setStatus(status);

			masterDTO.setProductDTO(productDTO);
			masterDTO.setToImageFilePath(toImageFilePath);
			masterDTO.setFromImageFilePath(fromImageFilePath);

			//エラーメッセージチェック
			errorMsg = InputChecker.masterProductChk(masterDTO, productSearchDTOList);

		//エラーメッセージがなければ
		if(errorMsg.isEmpty()){

			result = SUCCESS;
			session.put("MasterAddCompleteDTO" , masterDTO);

		}



		return result;

	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public Map<String, String> getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(Map<String, String> errorMsg) {
		this.errorMsg = errorMsg;
	}


	public File getUserImage() {
		return userImage;
	}


	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}


	public String getUserImageFileName() {
		return userImageFileName;
	}


	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
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


	public String getFromImageFilePath() {
		return fromImageFilePath;
	}


	public void setFromImageFilePath(String fromImageFilePath) {
		this.fromImageFilePath = fromImageFilePath;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getReleaseCompany() {
		return releaseCompany;
	}


	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}




}
