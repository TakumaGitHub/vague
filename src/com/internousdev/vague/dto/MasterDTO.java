package com.internousdev.vague.dto;

import java.io.File;

public class MasterDTO {

	private ProductDTO productDTO;

	private String toImageFilePath;

	private File fromImageFilePath;


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

	public File getFromImageFilePath() {
		return fromImageFilePath;
	}

	public void setFromImageFilePath(File fromImageFilePath) {
		this.fromImageFilePath = fromImageFilePath;
	}






}
