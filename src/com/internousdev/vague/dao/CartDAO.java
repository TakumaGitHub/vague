package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

public class CartDAO {
	public Map<String,Object>session;

	public ArrayList<CartDTO> getCartInfo(String userId)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

		String sql = "select * from cart_info left outer join product_info ON cart_info.product_id = product_info.product_id where user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartDTO cartDTO = new CartDTO();
				cartDTO.setProductId(rs.getInt("product_id"));
				cartDTO.setProductName(rs.getString("product_name"));
				cartDTO.setProductNameKana(rs.getString("product_name_kana"));
				cartDTO.setPrice(rs.getInt("product_info.price"));
				cartDTO.setProductCount(rs.getInt("product_count"));
				cartDTO.setProductTotalPrice(rs.getInt("cart_info.price"));
				cartDTO.setImageFilePath(rs.getString("image_file_path"));
				cartDTO.setReleaseCompany(rs.getString("release_company"));
				cartDTO.setReleaseDate(rs.getString("release_date"));
				cartDTO.setProductStock(rs.getInt("product_stock"));
				cartDTOList.add(cartDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return cartDTOList;
	}

		public void getCartInsertInfo(String userId, int productId,int productCount ,int productTotalPrice) throws SQLException{
			DBConnector dbConnector = new DBConnector();
			Connection con = dbConnector.getConnection();
			DateUtil dateUtil = new DateUtil();
			String sql = "INSERT INTO cart_info(user_id,product_id,product_count,price,insert_date) VALUES(?,?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			ps.setInt(3, productCount);
			ps.setInt(4, productTotalPrice);
			ps.setString(5, dateUtil.getDate());

			ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

		public int getProductCount(String userId,int productId)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		int productCount = 0;

		String sql = "select product_count from cart_info where user_id = ? and product_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				productCount += rs.getInt("product_count");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return productCount;
	}


	public void cartDeleteInfo(String userId, int productId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql = "DELETE from cart_info where user_id = ? and product_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
	//ログイン時に変更するやつ
	public void changeTempUserId(String userId,String tempUserId) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		String sql = "UPDATE cart_info SET user_id = ? where temp_user_id = ? ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, tempUserId);
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

	public boolean duplicates(String userId, int productId) throws SQLException{
		boolean result = false;
		String duplicate = null;
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		String sql = "select user_id from cart_info where user_id = ? AND product_id = ? ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				duplicate = rs.getString("user_id");
			}
			if(duplicate != null){
				result = true;
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;

	}
}
