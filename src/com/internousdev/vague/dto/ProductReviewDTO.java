package com.internousdev.vague.dto;


/**
 * 商品のレビューを格納するDTOクラス
 * @author user
 *
 */
public class ProductReviewDTO {

	private ReviewDTO reviewDTO = new ReviewDTO();

	private String familyName;

	private String firstName;

	private int sex;


	//フィールドのgetterとsetter
	public ReviewDTO getReviewDTO() {
		return reviewDTO;
	}

	public void setReviewDTO(ReviewDTO reviewDTO) {
		this.reviewDTO = reviewDTO;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}




}
