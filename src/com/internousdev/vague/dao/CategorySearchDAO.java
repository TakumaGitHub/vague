package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.vague.dto.CategoryDTO;
import com.internousdev.vague.util.DBConnector;


/**
 * カテゴリーを検索するメソッド
 * @author miyazaki
 *
 */
public class CategorySearchDAO {


	/**
	 * カテゴリーをすべて検索するメソッド
	 * @return
	 * @throws SQLException
	 */
	public List<CategoryDTO> searchAll() throws SQLException {

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		String sql = "SELECT * FROM  m_category ";

		List<CategoryDTO> categorytSearchDTOList = new ArrayList<CategoryDTO>();


		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();


				while(rs.next()){

					CategoryDTO categoryDTO = new CategoryDTO();


					categoryDTO.setId(rs.getInt("id"));
					categoryDTO.setCategoryId(rs.getInt("category_id"));
					categoryDTO.setCategoryName(rs.getString("category_name"));
					categoryDTO.setCategoryDescription(rs.getString("category_description"));
					categoryDTO.setInsertDate(rs.getString("insert_date"));
					categoryDTO.setUpdateDate(rs.getString("update_date"));

					categorytSearchDTOList.add(categoryDTO);


				}


		}catch(SQLException e){

			e.printStackTrace();

		}finally{

			con.close();

		}

		return categorytSearchDTOList;



	}

}
