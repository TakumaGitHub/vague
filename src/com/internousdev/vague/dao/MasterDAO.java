package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.internousdev.vague.dto.MasterDTO;
import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

/**
 * 管理者画面で使用するDAOクラス
 * @author miyazaki
 *
 */
public class MasterDAO {



	/**
	 * 商品を追加するメソッド
	 * @param masterDTO
	 * @return
	 */
	public int insert(MasterDTO masterDTO){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		DateUtil dateUtil = new DateUtil();

		//追加する商品情報を取得
		ProductDTO productDTO = masterDTO.getProductDTO();


		String sql = " INSERT INTO product_info(product_id, product_name, product_name_kana, product_description, category_id, product_stock, price, image_file_path, image_file_name, release_date, release_company, status, regist_date) "
					+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		int ret = 0;//結果を入れる整数

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, productDTO.getProductId());
			ps.setString(2,productDTO.getProductName());
			ps.setString(3,productDTO.getProductNameKana());
			ps.setString(4,productDTO.getProductDescription());
			ps.setInt(5,productDTO.getCategoryId());
			ps.setInt(6,productDTO.getProductStock());
			ps.setInt(7,productDTO.getPrice());
			ps.setString(8,productDTO.getImageFilePath());
			ps.setString(9,productDTO.getImageFileName());
			ps.setString(10,productDTO.getReleaseDate());
			ps.setString(11,productDTO.getReleaseCompany());
			ps.setInt(12,1);//status
			ps.setString(13,dateUtil.getDate());//regist_date

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



	/**
	 * 商品情報を変更するメソッド
	 */

	public int update(MasterDTO masterDTO){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		DateUtil dateUtil = new DateUtil();

		//変更する商品情報を取得
		ProductDTO productDTO = masterDTO.getProductDTO();

		String sql = " Update product_info SET product_id = ?, product_name = ?, product_name_kana = ?, product_description = ?, category_id = ?, product_stock = ?, price = ?, image_file_path = ?, image_file_name = ?, release_date = ?, release_company = ?, status= ? ,update_date = ? WHERE id = ? ";



		int ret = 0;//結果を入れる整数

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, productDTO.getProductId());
			ps.setString(2,productDTO.getProductName());
			ps.setString(3,productDTO.getProductNameKana());
			ps.setString(4,productDTO.getProductDescription());
			ps.setInt(5,productDTO.getCategoryId());
			ps.setInt(6,productDTO.getProductStock());
			ps.setInt(7,productDTO.getPrice());
			ps.setString(8,productDTO.getImageFilePath());
			ps.setString(9,productDTO.getImageFileName());
			ps.setString(10,productDTO.getReleaseDate());
			ps.setString(11,productDTO.getReleaseCompany());
			ps.setInt(12,1);//status
			ps.setString(13,dateUtil.getDate());//update_date
			ps.setInt(14, productDTO.getId());//WHERE id = ?

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



	/**
	 *
	 * 選択した商品をすべて削除するメソッド
	 */

	public int deleteChoose(List<Integer> product_id){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		String sql = " UPDATE product_info SET status = 0 WHERE product_id = ? ";

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



	/**
	 *
	 * 商品をすべて削除するメソッド
	 */

	public int deleteAll(){

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		String sql = " UPDATE product_info SET status = 0";

		int ret = 0;

		try{

			PreparedStatement ps = con.prepareStatement(sql);

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
