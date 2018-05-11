package com.internousdev.vague.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.vague.dto.AddressDTO;
import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.util.DBConnector;

/*
 * 決済ボタンを押した後のアクション
 */

public class BuyItemCompleteDAO {

	//カートの中から購入履歴のテーブルに情報を移す

	DBConnector dbConnector = new DBConnector();

	Connection con = (Connection)dbConnector.getConnection();

	List<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
	
	
	
	




}