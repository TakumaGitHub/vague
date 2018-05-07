package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.DBConnector;

public class ProductListDAO {
	//商品情報取得
	//ユーザーに見せるリスト
	public ArrayList<ProductDTO> getProductInfo() throws SQLException {

		ArrayList<ProductDTO> productList = new ArrayList<>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM product_info WHERE status = 1 ORDER BY product_id ASC";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ProductDTO dto = new ProductDTO();

				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				productList.add(dto);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			con.close();
		}

		return productList;
	}

	//商品情報一括取得
	//ユーザーには非公開
	public ArrayList<ProductDTO> getProductHideInfo() throws SQLException {
		ArrayList<ProductDTO> productList = new ArrayList<>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="SELECT * FROM product_info WHERE status = 1 ORDER BY product_id ASC";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ProductDTO dto = new ProductDTO();

				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setProductStock(rs.getInt("product_stock"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setInsertDate(rs.getDate("insert_date"));
				dto.setUpdateDate(rs.getDate("update_date"));
				productList.add(dto);

			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			con.close();
		}
		return productList;
	}

	//IDが存在するかのチェック
	public boolean existsProductId(String productId) throws SQLException {
		boolean result = false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="SELECT * FROM product_info WHERE product_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, productId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				result = true;
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			con.close();
		}
		return result;
	}


}
