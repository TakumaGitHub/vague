package com.internousdev.vague.action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CategorySearchDAO;
import com.internousdev.vague.dao.ProductSearchDAO;
import com.internousdev.vague.dto.CategoryDTO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.MasterDTO;
import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAddConfirmAction extends ActionSupport implements SessionAware {

	//フィールド
	private Map<String, Object> session;

	private Map<String, String> errorMsg = new  HashMap<String, String>();

	//ユーザーがアップロードするファイル
	private File userImage;

	//ユーザーがアップロードするファイルの名前
	private String userImageFileName;

	//ProductDTOのフィールド
	private String productId;

	private String productName;

	private String productNameKana;

	private String productDescription;

	private String categoryId;

	private String productStock;

	private String price;

	private String imageFilePath;

	private String imageFileName;

	private Date releaseDate;

	private String releaseDateValueStack;

	private String releaseCompany;

	private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

	private int status = 1;

	//コピー先のファイルパス
	private String toImageFilePath;
	//コピー元のファイルパス
	private File fromImageFilePath;


	//全ての商品情報を入れるリスト
	private List<ProductDTO> productSearchDTOList;

	private ProductSearchDAO productSearchDAO = new ProductSearchDAO();

	private ProductDTO productDTO = new ProductDTO();

	private MasterDTO masterDTO = new MasterDTO();

	private CategorySearchDAO categorySearchDAO = new CategorySearchDAO();


	/**
	 * 入力情報をMasterDTOに格納する
	 */
	public String execute() throws SQLException{

		String result = ERROR;

		String filePath = "";

		releaseDateValueStack =  new SimpleDateFormat("yyyy-MM-dd").format(releaseDate);


		//ログインしていないとき
		if(!(session.containsKey("LoginUserDTO"))){

			return "login";

		}else if(((LoginUserDTO)session.get("LoginUserDTO")).getmFlg() != 1){

			return "home";

		}



		//全ての商品情報を引き出す
		productSearchDTOList = productSearchDAO.searchAll();


		//コピー元のファイルパスを作成
		fromImageFilePath = userImage;

		//コピー先のファイルパスを作成
		imageFileName = userImageFileName;

		for(CategoryDTO CD : categorySearchDAO.searchAll()){

			if(Integer.parseInt(categoryId) == CD.getCategoryId()){

				imageFilePath = "images" + "/" +  CD.getCategoryId() + CD.getCategoryName() + "/" + userImageFileName;
				filePath = "./images/" + CD.getCategoryId() + CD.getCategoryName() + "/" + userImageFileName;

			}

		}

		toImageFilePath = ServletActionContext.getServletContext().getRealPath(filePath);


			//入力内容をMasterDTOに格納する

		try{

			productDTO.setProductId(Integer.parseInt(productId));
			productDTO.setProductName(productName);
			productDTO.setProductNameKana(productNameKana);
			productDTO.setProductDescription(productDescription);
			productDTO.setCategoryId(Integer.parseInt(categoryId));
			productDTO.setProductStock(Integer.parseInt(productStock));
			productDTO.setPrice(Integer.parseInt(price));
			productDTO.setImageFilePath(imageFilePath);
			productDTO.setImageFileName(imageFileName);

		}catch(NumberFormatException e){

			errorMsg.put("NumberFormatException", "商品ID、在庫、価格は9桁以下の半角数字で入力してください");
			return ERROR;

		}


			productDTO.setReleaseDate(simpleDateFormat.format(releaseDate));
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

			//画像ファイルをコピーする
			if(fromImageFilePath != null && toImageFilePath != null){

				 try {
						FileUtils.copyFile(fromImageFilePath, new File(toImageFilePath));
					} catch (IOException e) {
						e.printStackTrace();
					}

			}

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


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
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


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}


	public String getReleaseDateValueStack() {
		return releaseDateValueStack;
	}


	public void setReleaseDateValueStack(String releaseDateValueStack) {
		this.releaseDateValueStack = releaseDateValueStack;
	}


	public String getProductStock() {
		return productStock;
	}


	public void setProductStock(String productStock) {
		this.productStock = productStock;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
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


	public File getFromImageFilePath() {
		return fromImageFilePath;
	}


	public void setFromImageFilePath(File fromImageFilePath) {
		this.fromImageFilePath = fromImageFilePath;
	}


	public Date getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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
