package com.internousdev.vague.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartDeleteAction extends ActionSupport implements SessionAware {

	private String userId;
	private List<Integer> productId ;
	private Map<String,Object>session;
	private String result = SUCCESS;
	private int i = 0;

	public String execute(){
		LoginUserDTO loginUserDTO = new LoginUserDTO();
		CartDAO cartDAO = new CartDAO();

		try{
			if(session.containsKey("LoginUserDTO")){
				loginUserDTO = (LoginUserDTO)session.get("LoginUserDTO");
				userId = loginUserDTO.getUserId();
			}
			else{
				userId = session.get("tempUserId").toString();
			}

			i = cartDAO.cartDeleteInfo(userId,productId);

			if(i <= 0){
				result = ERROR;
			}
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
	public List<Integer> getProductId(){
	return productId;
	}
	public void setProductId(List<Integer> productId){
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
