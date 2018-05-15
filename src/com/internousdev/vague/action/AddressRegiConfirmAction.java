package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dto.AddressDTO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AddressRegiConfirmAction extends ActionSupport implements SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String postalCode;
	private String addr11;
	private String telNumber;
	private String email;

	public Map<String, Object> session;

	private String errorFamilyNameMsg;
	private String errorFirstNameMsg;
	private String errorFamilyNameKanaMsg;
	private String errorFirstNameKanaMsg;
	private String errorPostalCodeMsg;
	private String errorAddr11Msg;
	private String errorTelNumberMsg;
	private String errorEmailMsg;

	public String execute() {

		String result = SUCCESS;

		AddressDTO addressDTO = new AddressDTO();

		//		ログインしているか確認。[true = ログインしていない。]
		if (!session.containsKey("LoginUserDTO")) {
			result = "login";
			return result;
		}

		//		項目毎に条件をつける。if文[true = エラーメッセージが表示される。]という仕組みにする。

		if (!InputChecker.familyNameChk(familyName).equals("TRUE")) {
			result = ERROR;
			errorFamilyNameMsg = InputChecker.familyNameChk(familyName);
		}

		if (!InputChecker.firstNameChk(firstName).equals("TRUE")) {
			result = ERROR;
			errorFirstNameMsg = InputChecker.firstNameChk(firstName);
		}

		if (!InputChecker.familyNameKanaChk(familyNameKana).equals("TRUE")) {
			result = ERROR;
			errorFamilyNameKanaMsg = InputChecker.familyNameKanaChk(familyNameKana);
		}

		if (!InputChecker.firstNameKanaChk(firstNameKana).equals("TRUE")) {
			result = ERROR;
			errorFirstNameKanaMsg = InputChecker.firstNameKanaChk(firstNameKana);
		}

		if (!InputChecker.postalCodeChk(postalCode).equals("TRUE")) {
			result = ERROR;
			errorPostalCodeMsg = InputChecker.postalCodeChk(postalCode);
		}

		if (!InputChecker.addr11Chk(addr11).equals("TRUE")) {
			result = ERROR;
			errorAddr11Msg = InputChecker.addr11Chk(addr11);
		}

		if (!InputChecker.telNumberChk(telNumber).equals("TRUE")) {
			result = ERROR;
			errorTelNumberMsg = InputChecker.telNumberChk(telNumber);
		}

		if (!InputChecker.emailChk(email).equals("TRUE")) {
			result = ERROR;
			errorEmailMsg = InputChecker.emailChk(email);
		}

		//		未入力項目がないか確認。[true = sessionに格納。]
		if (!(familyName.equals("")) && !(firstName.equals("")) && !(familyNameKana.equals(""))
				&& !(firstNameKana.equals("")) &&
				!(postalCode.equals("")) && !(addr11.equals("")) && !(telNumber.equals("")) && !(email.equals(""))) {

			//			sessionで
			String userId = ((LoginUserDTO) session.get("LoginUserDTO")).getUserId();
			//			AddressDTOのsetterで各項目の入力値をセット。
			//			⇨セットした値をsessionに格納。
			addressDTO.setUserId(userId);
			addressDTO.setFamilyName(familyName);
			addressDTO.setFirstName(firstName);
			addressDTO.setFamilyNameKana(familyNameKana);
			addressDTO.setFirstNameKana(firstNameKana);
			addressDTO.setPostalCode(postalCode);
			addressDTO.setAddr11(addr11);
			addressDTO.setTelNumber(telNumber);
			addressDTO.setEmail(email);
			session.put("AddressDTO", addressDTO);
		}

		return result;

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

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddr11() {
		return addr11;
	}

	public void setAddr11(String addr11) {
		this.addr11 = addr11;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorFamilyNameMsg() {
		return errorFamilyNameMsg;
	}

	public void setErrorFamilyNameMsg(String errorFamilyNameMsg) {
		this.errorFamilyNameMsg = errorFamilyNameMsg;
	}

	public String getErrorFirstNameMsg() {
		return errorFirstNameMsg;
	}

	public void setErrorFirstNameMag(String errorFirstNameMsg) {
		this.errorFirstNameMsg = errorFirstNameMsg;
	}

	public String getErrorFamilyNameKanaMsg() {
		return errorFamilyNameKanaMsg;
	}

	public void setErrorFamilyNameKanaMsg(String errorFamilyNameKanaMsg) {
		this.errorFamilyNameKanaMsg = errorFamilyNameKanaMsg;
	}

	public String getErrorFirstNameKanaMsg() {
		return errorFirstNameKanaMsg;
	}

	public void setErrorFirstNameKanaMsg(String errorFirstNameKanaMsg) {
		this.errorFirstNameKanaMsg = errorFirstNameKanaMsg;
	}

	public String getErrorPostalCodeMsg() {
		return errorPostalCodeMsg;
	}

	public void setErrorPostalCodeMsg(String errorPostalCodeMsg) {
		this.errorPostalCodeMsg = errorPostalCodeMsg;
	}

	public String getErrorAddr11Msg() {
		return errorAddr11Msg;
	}

	public void setErrorAddr11Msg(String errorAddr11Msg) {
		this.errorAddr11Msg = errorAddr11Msg;
	}

	public String getErrorTelNumberMsg() {
		return errorTelNumberMsg;
	}

	public void setErrorTelNumberMsg(String errorTelNumberMsg) {
		this.errorTelNumberMsg = errorTelNumberMsg;
	}

	public String getErrorEmailMsg() {
		return errorEmailMsg;
	}

	public void setErrorEmailMsg(String errorEmailMsg) {
		this.errorEmailMsg = errorEmailMsg;
	}

}
