package com.internousdev.vague.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CategoryDAO {

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
					dto.setInsertDate(rs.getString("regist_date"));
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
