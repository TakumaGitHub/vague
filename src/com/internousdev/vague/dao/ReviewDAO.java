package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.dto.ProductReviewDTO;
import com.internousdev.vague.dto.ReviewDTO;
import com.internousdev.vague.dto.ReviewMyListDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

public class ReviewDAO {






	/**
	 * 選択した商品のレビューを検索するメソッド
	 */

	public List<ProductReviewDTO> searchProductDetails(int product_id){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		List<ProductReviewDTO> productReviewDTOList = new ArrayList<ProductReviewDTO>();


		String sql = " SELECT * FROM review r LEFT JOIN user_info uf ON r.user_id = uf.user_id WHERE r.product_id = ?";


		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, product_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				ReviewDTO reviewDTO = new ReviewDTO();

				reviewDTO.setId(rs.getInt("r.id"));
				reviewDTO.setUserId(rs.getString("r.user_id"));
				reviewDTO.setProductId(rs.getInt("r.product_id"));
				reviewDTO.setReviewTitle(rs.getString("r.review_title"));
				reviewDTO.setReviewBody(rs.getString("r.review_body"));
				reviewDTO.setReviewScore(rs.getInt("r.review_score"));
				reviewDTO.setInsertDate(rs.getString("r.insert_date"));
				reviewDTO.setUpdateDate(rs.getString("r.update_date"));

				ProductReviewDTO productReviewDTO = new ProductReviewDTO();

				productReviewDTO.setReviewDTO(reviewDTO);

				productReviewDTO.setFamilyName(rs.getString("uf.family_name"));
				productReviewDTO.setFirstName(rs.getString("uf.first_name"));
				productReviewDTO.setSex(rs.getInt("uf.sex"));

				productReviewDTOList.add(productReviewDTO);

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


		return productReviewDTOList;


	}

	/**
	 * ログインしているユーザーのレビューを検索するメソッド
	 *
	 */

	public List<ReviewMyListDTO> searchMyList(String user_id){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		List<ReviewMyListDTO> reviewMyListDTOList = new ArrayList<ReviewMyListDTO>();

		String sql = " SELECT * FROM review r LEFT JOIN product_info pi ON r.product_id =  pi.product_id WHERE r.user_id= ? ";


		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				ReviewDTO reviewDTO = new ReviewDTO();

				reviewDTO.setId(rs.getInt("r.id"));
				reviewDTO.setUserId(rs.getString("r.user_id"));
				reviewDTO.setProductId(rs.getInt("r.product_id"));
				reviewDTO.setReviewTitle(rs.getString("r.review_title"));
				reviewDTO.setReviewBody(rs.getString("r.review_body"));
				reviewDTO.setReviewScore(rs.getInt("r.review_score"));
				reviewDTO.setInsertDate(rs.getString("r.insert_date"));
				reviewDTO.setUpdateDate(rs.getString("r.update_date"));

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
				productDTO.setUpdateDate(rs.getString("update_date"));

				ReviewMyListDTO reviewMyListDTO = new ReviewMyListDTO();

				reviewMyListDTO.setReviewDTO(reviewDTO);
				reviewMyListDTO.setProductDTO(productDTO);


				reviewMyListDTOList.add(reviewMyListDTO);

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


		return reviewMyListDTOList;

	}


	/**
	 *
	 * レビューテーブルに挿入するメソッド
	 */

	public int insert(ReviewDTO reviewDTO){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		DateUtil dateUtil = new DateUtil();

		String sql = "INSERT INTO review (user_id, product_id, review_title, review_body, review_score, insert_date) values (?,?,?,?,?,?)";

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


	//選択したレビューを削除するメソッド

	public int deleteChoose(List<Integer> product_id){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		String sql = " DELETE FROM review WHERE product_id = ? ";

		int ret = 0;

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			for(int pi : product_id){

				ps.setInt(1, pi);
				ret += ps.executeUpdate();

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

		return ret;

	}


	//ログインユーザーのレビューをすべて削除するメソッド

	public int deleteAll(String user_id){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		String sql = " DELETE FROM review WHERE user_id = ? ";

		int ret = 0;

		try{

			PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, user_id);
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
