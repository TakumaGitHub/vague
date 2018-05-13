package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.AddressDAO;
import com.internousdev.vague.dao.BuyItemCompleteDAO;
import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dto.AddressDTO;
import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.dto.LoginUserDTO;
/*
 * 決済確認画面に行くためのアクション
 * ログイン状態の確認
 * 宛先情報の取得
 */
import com.opensymphony.xwork2.ActionSupport;


public class BuyItemConfirmAction extends ActionSupport implements SessionAware {


	public Map<String,Object> session;
	private ArrayList<AddressDTO> addressList = new ArrayList<AddressDTO>();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	private int addressId;
	private int totalPrice;//小計金額
	private int finallyPrice;//請求金額
	private int productCount;
//	エラーメッセージ
	private List<String> errorMsg = new ArrayList<String>();

	public String execute() throws SQLException {

		String result = SUCCESS;
		String userId = ((LoginUserDTO)session.get("LoginUserDTO")).getUserId();

//		ログイン判定
		if(!session.containsKey("LoginUserDTO")) {
			result = ERROR;
			return result;
		}

		CartDAO cartDAO = new CartDAO();
		cartList = cartDAO.getCartInfo(userId);

//		カート内判定
		if(cartList.isEmpty()) {
			result = "other";
			return result;
		}

		errorMsg = buyItemCompleteDAO.compareCount(userId);

//		在庫オーバー判定
		if(!errorMsg.isEmpty()) {
			result = "other";
			return result;
		}


		AddressDAO addressDAO = new AddressDAO();
		AddressDTO addressDTO = addressDAO.getAddressInfo(addressId);

//		宛先判定
		if(addressDTO == null) {
			result = "noaddress";
			return result;
		}

//		 小計金額計算
		for(CartDTO cartDTO:cartList) {
			totalPrice += cartDTO.getPrice();
		}

//		請求金額計算
		for(int i = 0; i < cartList.size(); i++) {
			finallyPrice += cartList.get(i).getProductTotalPrice();
		}

		session.put("addressId",addressId);
		session.put("ChooseAddressDTO", addressDTO);

		return result;


	}


	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public ArrayList<AddressDTO> getAddressList() {
		return addressList;
	}

	public void setAddressList(ArrayList<AddressDTO> addressList) {
		this.addressList = addressList;
	}

	public ArrayList<CartDTO> getCartList(){
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getFinallyPrice() {
		return finallyPrice;
	}

	public void setFinallyPrice(int finallyPrice) {
		this.finallyPrice = finallyPrice;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public List<String> getErrorMsg(){
		return errorMsg;
	}

	public void setErrorMsg(List<String> errorMsg) {
		this.errorMsg = errorMsg;
	}


	public Map<String, Object> getSession() {
		return session;
	}



}
