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
	private int cartTotalPrice;
	private String errorMessage;




	public String execute() throws SQLException{
		String result = ERROR;
		String userId;

	//ログイン判定
		if(session.containsKey("LoginUserDTO")){
		userId=((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
	}
	else{
		userId=session.get("tempUserId").toString();
	}
	//ログインユーザーのカート情報取得
	CartDAO cartDAO=new CartDAO();
	cartList=cartDAO.getCartInfo(userId);

	if(session.containsKey("LoginUserDTO")){
		userId=((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
		AddressDAO addressInfoDAO=new AddressDAO();
		addressDTOList.addAll(addressInfoDAO.getAddressInfo(userId));
	}
	else{
		return ERROR; //login.jspへ
	}

	if(cartList.size() == 0){
		return "other"; //cart.jspへ
	}


    CartDTO dto=new CartDTO();
	BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	CartDAO dao=new CartDAO();

	int PI = buyItemCompleteDAO.getCount(userId , dto.getProductId());
	int CI=dao.getProductCount(userId,dto.getProductId());

	if((PI-CI)>=0){
		result = SUCCESS;
	}
	else{
		return "other";
	}


	//カート内の合計
	for(CartDTO listDTO : cartList){
		totalPrice += listDTO.getPrice();
	}
	for(int i=0; i<cartList.size(); i++){
		finallyTotalPrice += cartList.get(i).getPrice();
	}

	if(addressDTOList.size()>0){
		result = SUCCESS; //決済完了画面へ
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

public List<CartDTO> GetcartInfoList() {
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
