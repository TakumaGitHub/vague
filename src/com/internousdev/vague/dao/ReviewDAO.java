package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.dto.ReviewDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

public class ReviewDAO {


	/**
	 * レビューする商品の情報を取ってくるメソッド
	 * @param product_id
	 * @return
	 */
	public ProductDTO search(int product_id){


		ProductDTO productDTO = new ProductDTO();

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		String sql = "SELECT * FROM  product_info WHERE product_id = ?";


		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, product_id);

			ResultSet rs = ps.executeQuery();


				if(rs.next()){

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

		return productDTO;


	}


	/**
	 *
	 * レビューテーブルに挿入するメソッド
	 */

	public int insert(ReviewDTO reviewDTO){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		DateUtil dateUtil = new DateUtil();

		String sql = "INSERT INTO review (user_id, product_id, review_title, review_body, review_score, insert_date) VAULES (?,?,?,?,?,?)";

		int ret = 0;


		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, reviewDTO.getUserId());
			ps.setInt(2, reviewDTO.getProductId());
			ps.setString(3, reviewDTO.getReviewTitle());
			ps.setString(4, reviewDTO.getReviewBody());
			ps.setInt(5, reviewDTO.getReviewScore());
			ps.setString(6, dateUtil.getDate());

			ret = ps.executeUpdate();



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





}
