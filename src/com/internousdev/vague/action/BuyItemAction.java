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
	private String result;
	private LoginUserDTO loginUserDTO = new LoginUserDTO();
	private ArrayList<AddressDTO> addressInfoListDTO = new ArrayList<AddressDTO>();
	private Map<String, Object> session;


	public String execute() throws SQLException{

		if(session.containsKey("LoginUserDTO")){
			loginUserDTO = (LoginUserDTO)session.get("LoginUserDTO");
			userId = loginUserDTO.getUserId();

			AddressDAO addressDAO = new AddressDAO();
			addressInfoListDTO = addressDAO.getAddressInfo(userId);

			if(!addressInfoListDTO.isEmpty()){
				result = SUCCESS;
				session.put("AddressInfoListDTO", addressInfoListDTO);

			}else {
				result = ERROR;
			}

		}else {
			result = LOGIN;
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
