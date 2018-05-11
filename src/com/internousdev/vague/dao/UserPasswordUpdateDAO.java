package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.DBConnector;

/**
 *ユーザーのパスワードを変更するDAO
 * @author miyazaki
 *
 */
public class UserPasswordUpdateDAO {

	//入力情報が合っているかどうか
	public String isTrue(String userId, String password){

		String result = null;

		String sql = " SELECT * FROM user_info WHERE user_id = ? ";

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

				//IDに対応するユーザーがいなかったら
				if(!rs.next()){

					result = "IDが間違っています";

				}else if(password.equals(rs.getString("password"))){

					result = "以前のパスワードと同じです";

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



	//パスワードを再設定するメソッド
	public int updatePassword(LoginUserDTO loginUserDTO){

		String userId = loginUserDTO.getUserId();

		String password = loginUserDTO.getPassword();


		String sql = " UPDATE user_info SET password = ? WHERE user_id = ? ";

		int ret = 0;

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();


		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, password);
			ps.setString(2, userId);

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
