package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.vague.util.DBConnector;

public class LoginUserDAO {


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
