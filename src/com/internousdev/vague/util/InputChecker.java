package com.internousdev.vague.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.internousdev.vague.dto.MasterDTO;
import com.internousdev.vague.dto.ProductDTO;

public class InputChecker {

	//姓エラーメッセージ管理
	public static String familyNameChk(String familyName) {
		String result = "TRUE";

		if(familyName.equals("")) {
			result = "【姓を入力してください】";
		}else if(familyName.length() < 1 || familyName.length() > 16) {
			result = "【姓は1文字以上16文字以下で入力してください】";
		}else if(!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々]+$")) {
			//"^[]+$"で囲われた文字以外が使われた時
			result = "【姓は半角英語、漢字、ひらがなで入力してください】";
		}
		return result;
	}

	//名前エラーメッセージ管理
	public static String firstNameChk(String firstName) {
		String result = "TRUE";

		if(firstName.equals("")) {
			result = "【名前を入力してください】";
		}else if(firstName.length() < 1 || firstName.length() > 16) {
			result = "【名前は1文字以上16文字以下で入力してください】";
		}else if(!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々]+$")){
			result = "【名前は半角英語、漢字、ひらがなで入力してください】";
		}
		return result;
	}

	//姓仮名エラーメッセージ管理
	public static String familyNameKanaChk(String familyNameKana) {
		String result = "TRUE";

		if(familyNameKana.equals("")) {
			result = "【姓のふりがなを入力してください】";
		}else if(familyNameKana.length() < 1 || familyNameKana.length() > 16) {
			result = "【姓のふりがなは1文字以上16文字以下で入力してください】";
		}else if(!familyNameKana.matches("^[ぁ-ゞ]+$")){
			result = "【姓のふりがなはひらがなで入力してください】";
		}
		return result;
	}

	//名前仮名エラーメッセージ管理
	public static String firstNameKanaChk(String firstNameKana) {
		String result = "TRUE";

		if(firstNameKana.equals("")) {
			result = "【名前のふりがなを入力してください】";
		}else if(firstNameKana.length() < 1 || firstNameKana.length() > 16) {
			result = "【名前のふりがなは1文字以上16文字以下で入力してください】";
		}else if(!firstNameKana.matches("^[ぁ-ゞ]+$")){
			result = "【名前のふりがなはひらがなで入力してください】";
		}
		return result;
	}

	//ユーザーIDエラーメッセージ管理
	public static String userIdChk(String userId) {
		String result = "TRUE";

		if(userId.equals("")) {
			result = "【ユーザーIDを入力してください】";
		}else if(userId.length() < 1 || userId.length() > 8) {
			result = "【ユーザーIDは1文字以上8文字以下で入力してください】";
		}else if(!userId.matches("^[a-zA-Z0-9]+$")) {
			result = "【ユーザーIDは半角英数字で入力してください】";
		}
		return result;
	}

	//パスワードエラーメッセージ管理
	public static String passwordChk(String password) {
		String result = "TRUE";

		if(password.equals("")) {
			result = "【パスワードを入力してください】";
		}else if(password.length() < 1 || password.length() > 16) {
			result = "【パスワードは1文字以上16文字以下で入力してください】";
		}else if(!password.matches("^[a-zA-Z0-9]+$")) {
			result ="【パスワードは半角英数字で入力してください】";
		}
		return result;
	}

	//新しいパスワードエラーメッセージ管理
	public static String newPasswordChk(String newPassword) {
		String result = "TRUE";

		if(newPassword.equals("")) {
			result = "【パスワードを入力してください】";
		}else if(newPassword.length()<1 || newPassword.length()>16){
			result = "【パスワードは1文字以上16文字以下で入力してください】";
		}else if(!(newPassword.matches("^[a-zA-Z0-9]+$"))){
			result = "【パスワードは半角英数字で入力してください】";
		}
		return result;
	}

	//再確認パスワードエラーメッセージ管理
	public static String rePasswordChk(String rePassword, String password) {
		String result = "TRUE";

		if(rePassword.equals("")) {
			result = "【再確認パスワードを入力してください】";
		}else if(rePassword.length() < 1 || rePassword.length() > 16) {
			result = "【再確認パスワードは1文字以上16文字以下で入力してください】";
		}else if(!rePassword.matches("^[a-zA-Z0-9]+$")) {
			result = "【再確認パスワードは半角英数字で入力してください】";
		}else if(!(rePassword.equals(password))) {
			result = "【入力されたパスワードが一致しません】";
		}
		return result;
	}

	//再確認新しいパスワードエラーメッセージ管理
		public static String reNewPasswordChk(String rePassword, String newPassword) {
			String result = "TRUE";

			if(rePassword.equals("")) {
				result = "【再確認パスワードを入力してください】";
			}else if(rePassword.length() < 1 || rePassword.length() > 16) {
				result = "【再確認パスワードは1文字以上16文字以下で入力してください】";
			}else if(!rePassword.matches("^[a-zA-Z0-9]+$")) {
				result = "【再確認パスワードは半角英数字で入力してください】";
			}else if(!(rePassword.equals(newPassword))) {
				result = "【入力された新しいパスワードが一致しません】";
			}
			return result;
		}

	//郵便番号エラーメッセージ管理
	public static String zip11Chk(String zip11) {
		String result = "TRUE";

		if(zip11.equals("")) {
			result = "【郵便番号を入力してください】";
		}else if(zip11.length() < 7 || zip11.length() > 8) {
			result = "【郵便番号は7桁で入力してください】";
		}else if(!zip11.matches("^[0-9-]+$")) {
			result = "【郵便番号は半角数字で入力してください】";
		}
		return result;
	}

	//住所エラーメッセージ管理
	public static String addr11Chk(String addr11) {
		String result = "TRUE";

		if(addr11.equals("")) {
			result = "【住所を入力してください】";
		}else if(addr11.length() < 15 || addr11.length() > 50) {
			result = "【住所は15文字以上50文字以下で入力してください】";
		}else if(!addr11.matches("^[a-zA-Z0-9ぁ-ゞァ-ヾ一-龠々!-~]+$")) {
			result = "【住所は半角英数字、漢字、ひらがな、カタカナおよび半角記号で入力してください】";
		}
		return result;
	}

	//電話エラーメッセージ管理
	public static String telNumberChk(String telNumber) {
		String result = "TRUE";

		if(telNumber.equals("")) {
			result = "【電話番号を入力してください】";
		}else if(telNumber.length() < 10 || telNumber.length() > 13) {
			result = "【電話番号は10文字以上13文字以下で入力してください】";
		}else if(!telNumber.matches("^[0-9\\-]+$")) {
			result = "【電話番号は半角数字で、正しいものを入力してください】";
		}
		return result;
	}

	//メールアドレスエラーメッセージ管理
	public static String emailChk(String email) {
		String result = "TRUE";

		if(email.equals("")) {
			result = "【メールアドレスを入力してください】";
		}else if(email.length() < 14 || email.length() > 32) {
			result = "【メールアドレスは14文字以上32文字以下で入力してください】";
		}else if(!email.matches("^[a-zA-Z0-9@.,;:!#$%&'*+-/=?^_`{|}~]+@+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+.+[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			result = "【メールアドレスは半角英数字記号で、正しいものを入力してください】";
		}
		return result;
	}

	//新しいメールアドレスエラーメッセージ管理
	public static String newEmailChk(String newEmail) {
		String result = "TRUE";

		if(newEmail.equals("")) {
			result = "【新しいメールアドレスを入力してください】";
		}else if(newEmail.length()<14 || newEmail.length()>32){
			result = "【新しいメールアドレスは14文字以上32文字以下で入力してください】";
		}else if((!newEmail.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"))){
			result = "【新しいメールアドレスは半角英数字で、正しいものを入力してください】";
		}
		return result;
	}


	//検索ワードエラーメッセージ管理
	public static String keywordChk(String keywords) {
		String result = "";

		if(keywords.equals("")) {
			result = "【検索キーワードを入力してください】";
		}else if(keywords.length() > 16) {
			result = "【検索は、1文字以上16文字以下で入力してください】";
		}else if(!keywords.matches("^[a-zA-Z0-9ぁ-ゞ一-龠々ァ-ヾ　\\s]*$") && keywords != "") {
			result = "【検索は半角英数字、漢字、ひらがな、カタカナで入力してください】";
		}
		return result;
	}

	//レビューエラーメッセージ管理
	public static Map<String, String> reviewChk(String reviewTitle, String reviewBody, int reviewScore){

		Map<String, String> result = new HashMap<String, String>();

		if(reviewTitle.length() > 100){
			result.put("reviewTitle", "【タイトルは、1文字以上100文字以下で入力してください】");
		}

		if(reviewBody.length() > 255){
			result.put("reviewBody", "【本文は、1文字以上255文字以下で入力してください】");
		}

		if(reviewScore > 5){
			result.put("reviewScore", "【評価は５以下で入力してください】");
		}

		return result;

	}


	//商品追加、変更エラーメッセージ管理
	public static Map<String, String> masterProductChk(MasterDTO masterDTO, List<ProductDTO> productSearchDTOList){

		Map<String, String> result = new HashMap<String, String>();

		ProductDTO productDTO = masterDTO.getProductDTO();


		//商品ID
		if(!(Integer.valueOf(productDTO.getProductId()).toString().matches("^[0-9]+$"))){
			result.put("productId", "【商品IDは半角数字で入力してください】");
		}
		//商品名
		if(productDTO.getProductName().equals("")) {
			result.put("productName", "【商品名を入力してください】");
		}else if(productDTO.getProductName().length() < 1 || productDTO.getProductName().length() > 100) {
			result.put("productName", "【商品名は1文字以上100文字以下で入力してください】");
		}else if(!productDTO.getProductName().matches("^[a-zA-Z0-9ぁ-ゞァ-ヾ一-龠々!-~]+$")) {
			result.put("productName", "【商品名は半角英数字、漢字、ひらがな、カタカナおよび半角記号で入力してください】");
		}
		//商品名かな
		if(productDTO.getProductNameKana().equals("")) {
			result.put("productNameKana", "【商品名のふりがなを入力してください】");
		}else if(productDTO.getProductNameKana().length() < 1 || productDTO.getProductNameKana().length() > 100) {
			result.put("productNameKana", "【商品名のふりがなは1文字以上100文字以下で入力してください】");
		}else if(!productDTO.getProductNameKana().matches("^[ぁ-ゞ]+$")) {
			result.put("productNameKana", "【商品名のふりがなはひらがなで入力してください】");
		}
		//商品の説明文
		if(productDTO.getProductDescription().equals("")) {
			result.put("productDescription", "【商品の説明文を入力してください】");
		}else if(productDTO.getProductDescription().length() < 1 || productDTO.getProductDescription().length() > 255) {
			result.put("productDescription", "【商品の説明文は1文字以上255文字以下で入力してください】");
		}
		//カテゴリーID
		if(!(Integer.valueOf(productDTO.getCategoryId()).toString().matches("^[1-9]$"))){
			result.put("categoryId", "【カテゴリーIDは一桁の半角数字で入力してください】");
		}
		//在庫
		if(!(Integer.valueOf(productDTO.getProductStock()).toString().matches("^[0-9]+$"))){
			result.put("productStock", "【商品の在庫数は半角数字で入力してください】");
		}
		//価格
		if(!(Integer.valueOf(productDTO.getPrice()).toString().matches("^[0-9]+$"))){
			result.put("price", "【商品の価格は半角数字で入力してください】");
		}
		//商品画像
		if(productDTO.getImageFilePath().equals("")) {
			result.put("imageFilePath", "【商品画像を選択してください】");
		}
		//発売日
		if(productDTO.getReleaseDate().equals("")) {
			result.put("releaseDate", "【商品の発売日を入力してください】");
		}else if(productDTO.getProductNameKana().length() != 8) {
			result.put("releaseDate", "【商品の発売日は8桁で入力してください】");
		}else if(!productDTO.getReleaseDate().matches("^[0-2][0-9]{3}[01][0-9][0-3][0-9]+$")) {
			result.put("releaseDate", "【商品の発売日は形式にそって入力してください】");
		}
		//発売会社
		if(productDTO.getReleaseCompany().equals("")) {
			result.put("releaseCompany", "【商品の販売会社名を入力してください】");
		}else if(productDTO.getProductNameKana().length() < 1 || productDTO.getProductNameKana().length() > 50) {
			result.put("releaseCompany", "【商品の販売会社名は1文字以上50文字以下で入力してください】");
		}else if(!productDTO.getReleaseCompany().matches("^[0-2][0-9]{3}[01][0-9][0-3][0-9]+$")) {
			result.put("releaseCompany", "【商品の販売会社名は形式にそって入力してください】");
		}


		//商品テーブルと入力内容との重複チェック

		for(ProductDTO PDL : productSearchDTOList){

			//商品ID
			if(PDL.getProductId() == productDTO.getProductId()){
				result.put("productId", "【その商品IDはすでに使われています】");
			}
			//商品名
			if(PDL.getProductName().equals(productDTO.getProductName())) {
				result.put("productName", "【その商品名はすでに使われています】");
			}
			//商品名かな
			if(PDL.getProductNameKana().equals(productDTO.getProductNameKana())) {
				result.put("productNameKana", "【その商品名のふりがなはすでに使われています】");
			}

			//商品画像パス
			if(PDL.getImageFilePath().equals(productDTO.getImageFilePath())){

				result.put("imageFilePath", "【その商品画像パスはすでに使われています】");
			}



		}

		return result;



	}


}