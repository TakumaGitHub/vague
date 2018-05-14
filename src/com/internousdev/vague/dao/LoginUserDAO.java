package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

public class LoginUserDAO {

	public LoginUserDTO getUserInfo(String userId,String password) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();

		LoginUserDTO dto = new LoginUserDTO();
		String sql = "SELECT * from user_info WHERE user_id = ? AND password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				dto.setUserId(rs.getString("user_id"));
				dto.setPassword(rs.getString("password"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstName(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));
				dto.setStatus(rs.getInt("status"));
				dto.setLoginFlg(rs.getInt("logined"));
				dto.setmFlg(rs.getInt("m_flg"));
				dto.setInsertDate(rs.getString("regist_date"));
				dto.setUpdateDate(rs.getString("update_date"));

			}

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
			return dto;

		}


	//IDとパスワードが合っているか確かめるメソッド


	public String passwordIsTrue(String userId, String password){


		String result = null;

		String sql = " SELECT * FROM user_info WHERE user_id = ?";

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();


			if(!rs.next()){

				result = "IDが間違っています";

			}else if(!password.equals(rs.getString("password"))){

				result = "入力されたパスワードが異なります。";

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

		return result;



	}

}
