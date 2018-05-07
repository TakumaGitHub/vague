package com.internousdev.vague.dto;

public class MasterDTO {

	private ProductDTO productDTO;

	private String toImageFilePath;

	private String fromImageFilePath;


	//フィールドのgetterとsetter
	public ProductDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}

	public String getToImageFilePath() {
		return toImageFilePath;
	}

	public void setToImageFilePath(String toImageFilePath) {
		this.toImageFilePath = toImageFilePath;
	}

	public String getFromImageFilePath() {
		return fromImageFilePath;
	}

	public void setFromImageFilePath(String fromImageFilePath) {
		this.fromImageFilePath = fromImageFilePath;
	}






}
