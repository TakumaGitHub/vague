package com.internousdev.vague.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartInsertAction extends ActionSupport implements SessionAware {
	private Map<String,Object>session;
	private String userId ;
	private String tempUserId;
	private int productId;
	private int productCount;
	private int productTotalPrice;

	public String execute() throws SQLException{
		String result = SUCCESS;

		CartDAO cartDAO = new CartDAO();
		LoginUserDTO loginUserDTO = new LoginUserDTO();
		ProductDTO detail = new ProductDTO();

		try{
			tempUserId = session.get("tempUserId").toString();

			if(session.containsKey("LoginUserDTO")){
				loginUserDTO = (LoginUserDTO)session.get("LoginUserDTO");
				userId = loginUserDTO.getUserId();
				cartDAO.getCartInsertInfo(userId,tempUserId,productId,productCount,productTotalPrice);
				if(cartDAO.duplicates(userId,productId)){
					productCount = productCount + cartDAO.getProductCount(userId,productId);
					session.put("ProductCount", productCount);
					cartDAO.cartDeleteInfo(userId,productId);
				}else{
					session.put("ProductCount", productCount);
				}
			}else{
				cartDAO.getTempCartInsertInfo(tempUserId,productId,productCount,productTotalPrice);
				if(cartDAO.duplicates(tempUserId,productId)){
					productCount = productCount + cartDAO.getProductCount(userId,productId);
					session.put("ProductCount", productCount);
					cartDAO.cartDeleteInfo(tempUserId,productId);
				}else{
					session.put("ProductCount", productCount);
				}
			}
			//合計金額を出すために以下を使用
			detail = (ProductDTO)session.get("DetailProductDTO");
			productId = detail.getProductId();

			//かぶりの処理
			int intCount = Integer.parseInt(session.get("ProductCount").toString());
			int Price = detail.getPrice();
			session.put("productTotalPrice", intCount * Price);

			productTotalPrice = (int)session.get("productTotalPrice");

		}
		catch(Exception e){
			e.printStackTrace();
		}
	return result;
	}

	public String getUserId(){
	return userId;
	}
	public void setUserId(String userId){
	this.userId = userId;
	}
	public String getTempUserId(){
	return tempUserId;
	}
	public void setTempUserId(String tempUserId){
	this.tempUserId = tempUserId;
	}
	public int getProductId(){
	return productId;
	}
	public void setProductId(int productId){
	this.productId = productId;
	}
	public int getProductCount(){
	return productCount;
	}
	public void setProductCount(int productCount){
	this.productCount = productCount;
	}
	public int getProductTotalPrice(){
	return productTotalPrice;
	}
	public void setProductTotalPrice(int productTotalPrice){
	this.productTotalPrice = productTotalPrice;
	}
	@Override
	public void setSession(Map<String, Object>session){
		this.session =session;
	}

}