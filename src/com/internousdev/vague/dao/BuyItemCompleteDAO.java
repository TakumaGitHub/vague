package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

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


		String sqlSELECT = " SELECT * FROM  cart_info WHERE user_id = ?";

		String sqlInsert = " INSERT INTO purchase_history_info (user_id, product_id, product_count, price, address_id, insert_date) values (?,?,?,?,?,?)";

		String sqlDELETE = " DELETE FROM  cart_info WHERE user_id = ? ";

		int ret = 0;


		try{

			//カートから情報を引き出す
			PreparedStatement psSELECT = con.prepareStatement(sqlSELECT);

			psSELECT.setString(1, userId);

			ResultSet rsSELECT = psSELECT.executeQuery();

			while(rsSELECT.next()){

				CartDTO cartDTO = new CartDTO();

				cartDTO.setProductId(rsSELECT.getInt("product_id"));
				cartDTO.setPrice(rsSELECT.getInt("price"));
				cartDTO.setProductCount(rsSELECT.getInt("product_count"));;


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
				psInsert.setString(6, dateUtil.getDate());


				psInsert.executeUpdate();

			}

			//カートのテーブルから、履歴を消す。
			PreparedStatement psDELETE = con.prepareStatement(sqlDELETE);

			psDELETE.setString(1, userId);

			ret = psDELETE.executeUpdate();


		}catch(SQLException e){

			e.printStackTrace();

		}finally{

			try{

				con.close();

			}catch(SQLException e){

				e.printStackTrace();

			}

		}

		return ret;


	}


	//在庫の数と購入数を比べるメソッド

	public Map<String, String> compareCount(String userId){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();


		String sql = " SELECT ci.product_count, pi.product_stock, pi.product_name  FROM  cart_info ci LEFT JOIN product_info pi ON ci.product_id =  pi.product_id WHERE user_id = ?  ";

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();
			
			




		}catch(SQLException e){

			e.printStackTrace();

		}


		finally{

			try{

				con.close();

			}catch(SQLException e){

				e.printStackTrace();

			}


		}


	}








}