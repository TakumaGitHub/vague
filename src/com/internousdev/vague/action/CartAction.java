package com.internousdev.vague.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {
	private Map<String,Object>session;
	private ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();
	private String ERROR;
	private int totalPrice;
	private String userId;

	public String execute(){
		String result = ERROR;
		int sqlBranch;

		CartDAO cartDAO = new CartDAO();
		LoginUserDTO loginUserDTO = new LoginUserDTO();

		try{
			if(session.containsKey("LoginUserDTO")){
				loginUserDTO = (LoginUserDTO)session.get("LoginUserDTO");
				userId = loginUserDTO.getUserId();
				sqlBranch = 0;
			}else{
				userId = session.get("tempUserId").toString();
				sqlBranch = 1;
			}
			cartDTOList = cartDAO.getCartInfo(userId, sqlBranch);

			session.put("CartDTOList", cartDTOList);

			totalPrice = totalPrice(cartDTOList);

			session.put("CartTotalPrice", totalPrice);

			result = SUCCESS;
		}
		catch(Exception e){
			e.printStackTrace();
		}
			return result;
	}

	public int totalPrice(ArrayList<CartDTO> cartList){
		int totalPrice = 0;
		for(CartDTO cartDTO : cartList){
			totalPrice += cartDTO.getProductTotalPrice();
		}
		return totalPrice;
	}
	public String getUserId(){
	return userId;
	}
	public void setUserId(String userId){
	this.userId = userId;
	}
	public ArrayList<CartDTO> getCartDTOList(){
	return cartDTOList;
	}
	public void setCartDTOList(ArrayList<CartDTO> cartDTOList){
	this.cartDTOList = cartDTOList;
	}
	public int getTotalPrice(){
	return totalPrice;
	}
	public void setTotalPrice(int totalPrice){
	this.totalPrice = totalPrice;
	}
	public Map<String, Object> getSession() {
	return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
	this.session = session;
	}
}
