package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.AddressDAO;
import com.internousdev.vague.dto.AddressDTO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	private String userId;
	AddressDAO addressDAO = new AddressDAO();
	AddressDTO addressDTO = new AddressDTO();

	private ArrayList<AddressDTO> addressInfoListDTO = new ArrayList<AddressDTO>();

	public Map<String, Object> session;

	String result;
		private LoginUserDTO loginUserDTO = new LoginUserDTO();

	public String execute() throws SQLException{
		result = SUCCESS;

		loginUserDTO = (LoginUserDTO)session.get("LoginUserDTO");
		userId = loginUserDTO.getUserId();

		addressInfoListDTO.addAll(addressDAO.getAddressInfo(userId));

		if(addressInfoListDTO.get(0) == null) {

			result = ERROR;
		}

		return result;

	}

	public ArrayList<AddressDTO> getAddressInfoListDTO(){

		return addressInfoListDTO;
	}

	public void setAddressInfoListDTO(ArrayList<AddressDTO> addressInfoListDTO) {

		this.addressInfoListDTO = addressInfoListDTO;
	}

	@Override
	public void setSession(Map<String, Object> session) {

		this.session = session;
	}
}
