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

public class CartDAO {
	public Map<String,Object>session;
	private String sql;


	public ArrayList<CartDTO> getCartInfo(String userId, int sqlBranch)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

		if(sqlBranch == 0){
			sql = "select * from cart_info left outer join product_info ON cart_info.product_id = product_info.product_id where user_id = ?";
		}else{
			sql = "select * from cart_info left outer join product_info ON cart_info.product_id = product_info.product_id where temp_user_id = ?";
		}
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

		public int getCartInsertInfo(String userId, int productId,int productCount ,int productTotalPrice, int sqlBranch) throws SQLException{
			DBConnector dbConnector = new DBConnector();
			Connection con = dbConnector.getConnection();
			DateUtil dateUtil = new DateUtil();
			int i=0;

			if(sqlBranch == 0){
				sql = "INSERT INTO cart_info(user_id,product_id,product_count,price,regist_date) VALUES(?,?,?,?,?)";
			}else{
				sql = "INSERT INTO cart_info(temp_user_id ,product_id,product_count,price,regist_date) VALUES(?,?,?,?,?)";
			}
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			ps.setInt(3, productCount);
			ps.setInt(4, productTotalPrice);
			ps.setString(5, dateUtil.getDate());

			i = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}return i;
	}

		public int getProductCount(String userId,int productId, int sqlBranch)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		int productCount = 0;
		if(sqlBranch == 0){
			sql = "select product_count from cart_info where user_id = ? and product_id = ?";
		}else{
			sql = "select product_count from cart_info where temp_user_id = ? and product_id = ?";
		}
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


	public int cartDeleteInfo(String userId, List<Integer> productId, int sqlBranch) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		int i=0;

		if(sqlBranch == 0){
			sql = "DELETE from cart_info where user_id = ? and product_id = ?";
		}else{
			sql = "DELETE from cart_info where temp_user_id = ? and product_id = ?";
		}
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			for(int PI : productId){
				ps.setString(1, userId);
				ps.setInt(2, PI);
				i += ps.executeUpdate();
			}


		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}return i;
	}
	//ログイン時に変更する際、カートの中身を移行するため使用。
	public int changeTempUserId(String userId,String tempUserId) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		int i=0;
		String sql = "UPDATE cart_info SET user_id = ? where temp_user_id = ? ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, tempUserId);
			i = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}return i;
	}

	public boolean duplicates(String userId, int productId, int sqlBranch) throws SQLException{
		boolean result = false;
		String duplicate = null;
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		if(sqlBranch == 0){
			sql = "select user_id from cart_info where user_id = ? AND product_id = ? ";
		}else{
			sql = "select user_id from cart_info where temp_user_id = ? AND product_id = ? ";
		}
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
