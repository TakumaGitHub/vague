package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.vague.dto.BuyItemDTO;
import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.util.DBConnector;

/*
 * 決済ボタンを押した後のアクション
 */

public class BuyItemCompleteDAO {

	//カートの中から購入履歴のテーブルに情報を移す


	public int moveTable(String userId, int address_id){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		DateUtil dateUtil = new DateUtil();

		List<CartDTO> cartDTOList = new ArrayList<CartDTO>();

		List<BuyItemDTO> addressDTOList = new ArrayList<BuyItemDTO>();

		String sqlSELECT = " SELECT * FROM  cart_info WHERE user_id = ?";

		String sqlInsert = " INSERT INTO purchase_history_info (user_id, product_id, product_count, price, address_id, insert_date) values (?,?,?,?,?,?)";

		String sqlDELETE = " DELETE FROM  cart_info WHERE user_id = ? ";

		try{

			//カートから情報を引き出す
			PreparedStatement psSELECT = con.prepareStatement(sqlSELECT);

			psSELECT.setString(1, userId);

			ResultSet rsSELECT = psSELECT.executeQuery();

			while(rsSELECT.next()){

				CartDTO cartDTO = new CartDTO();

				cartDTO.setProductId(rsSELECT.getInt("product_id"));
				cartDTO.setProductName(rsSELECT.getString("product_name"));
				cartDTO.setProductNameKana(rsSELECT.getString("product_name_kana"));
				cartDTO.setPrice(rsSELECT.getInt("product_info.price"));
				cartDTO.setProductCount(rsSELECT.getInt("product_count"));
				cartDTO.setProductTotalPrice(rsSELECT.getInt("cart_info.price"));
				cartDTO.setImageFilePath(rsSELECT.getString("image_file_path"));
				cartDTO.setReleaseCompany(rsSELECT.getString("release_company"));
				cartDTO.setReleaseDate(rsSELECT.getString("release_date"));
				cartDTO.setProductStock(rsSELECT.getInt("product_stock"));


				cartDTOList.add(cartDTO);

			}


			//取り出してきたカートの情報を、購入履歴に入れる
			PreparedStatement psInsert = con.prepareStatement(sqlInsert);


			for(CartDTO cartDTO : cartDTOList){

				psInsert.setString(1, userId);
				psInsert.setInt(2, cartDTO.getProductId());
				psInsert.setInt(3, cartDTO.getProductCount());
				psInsert.setInt(4, cartDTO.getPrice());
				psInsert.setInt(5, address_id);
				psInsert.setString(6,);


				ResultSet rsInsert = psInsert.executeQuery();




			}






		}catch(SQLException e){

			e.printStackTrace();

		}finally{

			try{

				con.close();

			}catch(SQLException e){

				e.printStackTrace();

			}

		}




	}








}