package com.internousdev.vague.dto;

/**
 * 投稿するレビューの内容を入れるDTOクラス
 * @author miyazaki
 *
 */
public class ReviewDTO {

	private int id;

	private String userId;

	private int  productId;

	private String reviewTitle;

	private String reviewBody;

	private int reviewScore;


	//フィールドのgetterとsetter


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}






}
