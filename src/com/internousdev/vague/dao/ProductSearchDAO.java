package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.StringHandle;

/**
 * 商品情報を検索するクラス
 * @author miyazaki
 *
 */
public class ProductSearchDAO {

	//フィールド
	private List<ProductDTO> productSearchDTOList = new ArrayList<ProductDTO>();

	//メソッド

	/**
	 *商品を検索するメソッド
	 * @param retrivalValue
	 * @param category_id
	 * @param rule
	 * @return List<ArrayList<ProductDTO>>
	 */
	public List<ProductDTO> search(String retrievalValue, int category_id,int rule) throws SQLException{

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();


		//======検索キーワードを空白で分割しListに格納======
		List<String> rValue = StringHandle.retrievalValue(retrievalValue);

		if(rValue.isEmpty()){

			rValue.add(" ");

		}

		//======sql文を用意する。======
		String sql = "SELECT * FROM product_info WHERE ";

			for(int i = 0; i < rValue.size(); i++){

				if(i == rValue.size() - 1){

					sql += " (product_name LIKE ? OR product_name_kana LIKE ? OR product_description LIKE ? OR release_company LIKE ? ) ";

				}else{

					sql += " (product_name LIKE ? OR product_name_kana LIKE ? OR product_description LIKE ? OR release_company LIKE ? ) AND ";


				}

			}


			if(category_id != 0){

				sql += " AND category_id = " + category_id;

			}

			if(rule != 0){

				switch(rule){

					case 1:

						sql += " ORDER BY price DESC ";//価格の高い順

						break;

					case 2:

						sql += " ORDER BY price ASC ";//価格の安い順

						break;

					case 3:

						sql += " ORDER BY product_stock DESC ";//在庫の多い順

						break;

					case 4:

						sql += " ORDER BY product_stock ASC ";//在庫の少ない順

						break;


				}


			}


			//======データベースから商品情報を取得する======

			try{

				PreparedStatement ps = con.prepareStatement(sql);

				for(int i = 0; i < rValue.size(); i++){

					for(int t = 1; t <= 4; t++){

						ps.setString(i * 4 + t, "%" + rValue.get(i) + "%");

					}

				}

				ResultSet rs = ps.executeQuery();


					while(rs.next()){

						ProductDTO productDTO = new ProductDTO();


						productDTO.setId(rs.getInt("id"));
						productDTO.setProductId(rs.getInt("product_id"));
						productDTO.setProductName(rs.getString("product_name"));
						productDTO.setProductNameKana(rs.getString("product_name_kana"));
						productDTO.setProductDescription(rs.getString("product_description"));
						productDTO.setCategoryId(rs.getInt("category_id"));
						productDTO.setProductStock(rs.getInt("product_stock"));
						productDTO.setPrice(rs.getInt("price"));
						productDTO.setImageFilePath(rs.getString("image_file_path"));
						productDTO.setImageFileName(rs.getString("image_file_name"));
						productDTO.setReleaseDate(rs.getString("release_date"));
						productDTO.setReleaseCompany(rs.getString("release_company"));
						productDTO.setStatus(rs.getInt("status"));
						productDTO.setInsertDate(rs.getString("insert_date"));
						productDTO.setUpdatedDate(rs.getString("update_date"));

						productSearchDTOList.add(productDTO);


					}


			}catch(SQLException e){

				e.printStackTrace();

			}finally{

				con.close();

			}

			return productSearchDTOList;


	}

}
