package com.internousdev.vague.dto;

public class CartDTO {
	private int productId ;
	private String productName ;
	private String productNameKana ;
	private String imageFilePath ;
	private int price ;
	private String releaseConpany ;
	private String releaseDate ;
	private int productTotalPrice ;
	private int productCount ;
	private int productStock ;

	public int getProductId(){
	return productId;
	}
	public void setProductId(int productId){
	this.productId = productId;
	}
	public String getProductName(){
	return productName;
	}
	public void setProductName(String productName){
	this.productName = productName;
	}
	public String getProductNameKana(){
	return productNameKana;
	}
	public void setProductNameKana(String productNameKana){
	this.productNameKana = productNameKana;
	}
	public String getImageFilePath(){
	return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath){
	this.imageFilePath = imageFilePath;
	}
		public String getReleaseConpany(){
	return releaseConpany;
	}
	public void setReleaseConpany(String releaseConpany){
	this.releaseConpany = releaseConpany;
	}
	public String getReleaseDate(){
	return releaseDate;
	}
	public void setReleaseDate(String releaseDate){
	this.releaseDate = releaseDate;
	}
	public int getProductTotalPrice(){
	return productTotalPrice;
	}
	public void setProductTotalPrice(int productTotalPrice){
	this.productTotalPrice = productTotalPrice;
	}
	public int getProductCount(){
	return productCount;
	}
	public void setProductCount(int productCount){
	this.productCount = productCount;
	}
	public int getPrice(){
	return price;
	}
	public void setPrice(int price){
	this.price = price;
	}
	public int getProductStock(){
	return productStock;
	}
	public void setProductStock(int productStock){
	this.productStock = productStock;
	}
}
