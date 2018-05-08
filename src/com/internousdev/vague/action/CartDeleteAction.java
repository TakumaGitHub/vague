package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartDeleteAction extends ActionSupport implements SessionAware {

	private String userId;
	private String productId ;
	private Map<String,Object>session;
	private String result = SUCCESS;
	LoginUserDTO loginUserDTO = new LoginUserDTO();
	CartDAO cartDAO = new CartDAO();

	public String execute(){
		boolean loginFlg = (boolean) session.get("loginFlg");
		try{
			if(loginFlg){
				loginUserDTO = (LoginUserDTO)session.get("LoginUserDTO");
				userId = loginUserDTO.getLoginId();
			}
			else{
				userId = session.get("TempUserId").toString();
			}

			cartDAO.cartDeleteInfo(userId,productId);
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
	public String getProductId(){
	return productId;
	}
	public void setProductId(String productId){
	this.productId = productId;
	}
	public Map<String, Object> getSession() {
	return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
	this.session = session;
	}
}
