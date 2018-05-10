package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.BuyItemCompleteDAO;
import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 1,カート情報取得
 * 2,在庫更新
 * 3,購入履歴に登録
 * 4,カートテーブルの情報を削除する
 */

public class BuyItemCompleteAction extends ActionSupport implements SessionAware {

	// userId格納
	private String userId;
	// cartInfoDAO格納List
	private Map<String, Object> session;

	private int cartTotalPrice;
	private ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();
	private ArrayList<CartDTO> cartInfoList=new ArrayList<CartDTO>();
	private String errorMessage;



	public String execute() throws SQLException {
		String result = SUCCESS;
		userId=((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
		BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
		CartDAO dao = new CartDAO();


		// カート情報取得（getUserCartInfo)
		cartList=buyItemCompleteDAO.getCart(userId);


		//在庫情報を取得

		//在庫を更新
		int productResult=0;
		productResult = buyItemCompleteDAO.updateProductCount(cartList);

		if (productResult<0){
				return ERROR;


		}

		//履歴にいれる
		int count = 0;
		count = buyItemCompleteDAO.setPurchaseHistory(cartList);

		if (count <= 0) {
			return ERROR;
		}

		cartList = dao.getUserCartList(((LoginUserDTO)session.get("LoginUserDTO")).getUserId());



		/*	//カートの中身を削除
		   int deleteCount=0;
		   deleteCount=dao.cartDeleteInfo(userId,session.get("productId"));
		   
		   if(deleteCount<=0){
			   return ERROR;
		   }*/
		

			cartTotalPrice =cartTotalPrice(getcartList());


		return result;
		}



	// 合計金額計算メソッド
	public int cartTotalPrice(ArrayList<CartDTO> cartList) {
		int totalPrice = 0;
		for (CartDTO dto : cartList) {
			totalPrice += dto.getPrice() * dto.getProductCount();
		}

		return totalPrice;
	}




	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public ArrayList<CartDTO> getcartList() {
		return cartList;
	}

	public void setCartInfoDTOList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public int getCartTotalPrice() {
		return cartTotalPrice;
	}

	public void setCartTotalPrice(int cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}

	public ArrayList<CartDTO> getCartInfoList() {
		return cartInfoList;
	}

	public void setCartInfoList(ArrayList<CartDTO> cartInfoList) {
		this.cartInfoList = cartInfoList;
	}


}
