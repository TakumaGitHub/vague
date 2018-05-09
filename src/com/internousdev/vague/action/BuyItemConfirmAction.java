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

	private Map<String,Object> session;
	private int totalPrice=0;//合計金額
	private int productCount;//個数
	private List<CartDTO> cartList=new ArrayList<CartDTO>();//カート情報一覧
	private ArrayList<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();//宛先情報一覧

	public ArrayList<AddressDTO> addressList= new ArrayList<AddressDTO>();
	private int finallyTotalPrice;
	private ArrayList<CartDTO> cartListInfo= new ArrayList<CartDTO>();
	private int cartTotalPrice;
	private String errorMessage;

/*
 * カートの決済ボタンを押下後のアクション
 * ①ログイン判定
 * ②カート情報の取得
 * ③別アカからの同時購入などの在庫オーバー時の処理
 * ④カート内の合計金額計算
 * ⑤宛先情報の有無による処理
 *
 */


	public String execute() throws SQLException{
		String result =ERROR;
		String userId;
	//ログイン判定
	if((boolean)session.get("loginFlg")){
		userId=((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
	}
	else{
		userId=session.get("tempUserId").toString();
	}
	//ログインユーザーのカート情報取得
	CartDAO cartDAO=new CartDAO();
	cartList=cartDAO.getCartInfo(userId);

	if((boolean)session.get("loginFlg")){
		AddressDAO addressInfoDAO=new AddressDAO();
		addressDTOList.addAll(addressInfoDAO.getAddressInfo(((LoginUserDTO)session.get("LoginUserDTO")).getUserId()));
	}
	else{
		return ERROR; //login.jspへ
	}

	if(cartList.size() == 0){
		return "other"; //cart.jspへ
	}

	//在庫オーバー時の処理
	BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	cartList=buyItemCompleteDAO.getCart(userId);
	CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();
	int stockOverDelete;

	if(cartList.size()>0){
		for(CartDTO cartDTO:cartList){
			//trueのとき在庫オーバー
			if(cartDTO.getStockFlg()){
				//オーバーした商品を削除
				stockOverDelete=cartDeleteDAO.deleteUserCart(userId,cartDTO.getProductId());
				//があるとき
				if(stockOverDelete > 0){

				//残りのカート情報を取得する
				cartList=cartDAO.getUserCartList(userId);

				//カートの合計金額を計算する
				for(CartDTO dto: cartList){
					cartTotalPrice += dto.getTotalPrice();
				}
				errorMessage = "申し訳ありません。在庫が不足しています。不足した商品をカートから削除しました。";
				return "other"; //cart.jspへ
			}return ERROR;
		}
			//在庫オーバーでないときはカート内の商品合計へ

	}
	}
	//カート内の合計
	for(CartDTO dto:cartList){
		totalPrice += dto.getPrice();
	}
	for(int i=0; i<cartList.size(); i++){
		finallyTotalPrice += cartList.get(i).getPrice();
	}

	if(addressDTOList.size()>0){
		result = SUCCESS; //決済完了画面へ
	}
	else{
		result="NoAddress";//宛先新規画面へ
	}
	return result;

}


public List<CartDTO> getCartList(){
	return cartList;
}
public void setCartList(List<CartDTO> cartList){
	this.cartList=cartList;
}

public int getTotalPrice(){
	return totalPrice;
}
public void setTotalPrice(int totalPrice){
	this.totalPrice=totalPrice;
}


public int getFinallyTotalPrice(){
	return finallyTotalPrice;
	}
public void setFinalyTotalPrice(int finallyTotalPrice){
	this.finallyTotalPrice=finallyTotalPrice;
}

public ArrayList<AddressDTO> getAddressDTOList(){
	return addressDTOList;
}
public void setAddressDTOList(ArrayList<AddressDTO> addressDTOList){
	this.addressDTOList=addressDTOList;
}

public int getProductCount(){
	return productCount;
}
public void setProductCount(int productCount){
	this.productCount=productCount;
}



//session
public Map<String ,Object>getSession(){
	return session;
}

public void setSession(Map<String,Object>session){
	this.session=session;
}



public String getErrorMessage(){
	return errorMessage;
}
public void setErrorMessage(String errorMessage){
	this.errorMessage=errorMessage;
}

public ArrayList<CartDTO> GetcartInfoList() {
	return cartList;
}

public void setCartInfoDTOList(ArrayList<CartDTO> cartInfoList) {
	this.cartList = cartInfoList;
}


public int getCartTotalPrice() {
	return cartTotalPrice;
}

public void setCartTotalPrice(int cartTotalPrice) {
	this.cartTotalPrice = cartTotalPrice;
}



}
