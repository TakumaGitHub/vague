package com.internousdev.vague.dto;

/**
 * マイページのレビュー一覧で、表示するDTOクラス
 * @author miyazaki
 *
 */

public class ReviewMyListDTO {

	private ReviewDTO reviewDTO = new ReviewDTO();

	private ProductDTO productDTO = new ProductDTO();


	//フィールドのgetterとsetter
	public ReviewDTO getReviewDTO() {
		return reviewDTO;
	}

	public void setReviewDTO(ReviewDTO reviewDTO) {
		this.reviewDTO = reviewDTO;
	}

	public ProductDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}




}
