package com.internousdev.vague.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.DBConnector;

public class ProductDetailsDAO {

	//商品詳細情報取得
	public ProductDTO getProductDetailsInfo(String productId) throws SQLException {
		ProductDTO dto = new ProductDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="SELECT * FROM product_info WHERE product_id=? AND status = 1";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, productId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setProductStock(rs.getInt("product_stock"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setPrice(rs.getInt("price"));

			}else {
				dto = null;
			}

		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally{
			con.close();
		}
		return dto;

	}
	//商品詳細情報の格納
	public ArrayList<ProductDTO> getProductDetailsInfoList(String[] productIdList) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ProductDTO> detailsList = new ArrayList<>();

		for(int i = 0; i < productIdList.length; i++){
			String sql ="SELECT * FROM product_info WHERE product_id = ? AND status = 1 ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(productIdList[i]));
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
			dto.setReleaseDate(rs.getString("release_date"));
			dto.setInsertDate(rs.getString("insert_date"));
			dto.setUpdateDate(rs.getString("update_date"));

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		}
		return detailsList;
	}

	//同カテゴリ商品の陳列
	public ArrayList<ProductDTO> getSuggestProductInfo(int categoryId, String productId) throws SQLException {
		ArrayList<ProductDTO> suggestList = new ArrayList<>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		//同カテ商品取得
		String sql = "SELECT * FROM  product_info WHERE status = 1 AND category_id = ? AND product_id <> ? ORDER BY RAND() LIMIT 3 ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ps.setString(2, productId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ProductDTO dto = new ProductDTO();

				dto.setId(rs.getInt("id"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setPrice(rs.getInt("price"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdateDate(rs.getString("update_date"));
				dto.setProductStock(rs.getInt("product_stock"));

				suggestList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return suggestList;
	}
}
