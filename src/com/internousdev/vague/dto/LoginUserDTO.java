package com.internousdev.vague.dto;

public class LoginUserDTO {

	private int Id;

	private String userId;

	private String familyName;

	private String firstName;

	private int sex;

	private int mFlg;


	//フィールドのgetterとsetter
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public int getmFlg() {
		return mFlg;
	}

	public void setmFlg(int mFlg) {
		this.mFlg = mFlg;
	}




}
