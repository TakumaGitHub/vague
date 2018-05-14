package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.DBConnector;

public class UserCreateDAO {



	//以下新規ユーザー登録用メソッド

	public void createUserInfo(LoginUserDTO loginUserDTO) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserDTO.getUserId());
			ps.setString(2, loginUserDTO.getPassword());
			ps.setString(3, loginUserDTO.getFamilyName());
			ps.setString(4, loginUserDTO.getFirstName());
			ps.setString(5, loginUserDTO.getFamilyNameKana());
			ps.setString(6, loginUserDTO.getFirstNameKana());
			ps.setInt(7, loginUserDTO.getSex());
			ps.setString(8, loginUserDTO.getEmail());
			ps.setString(9, dateUtil.getDate());  //DateUtilクラスのgetDateメソッドで登録時の日時をDBに格納

			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

	public String getOverlapping(String userId) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = " SELECT user_id FROM user_info ";

		String result = null;

		List<String> userIdList = new ArrayList<String>();

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				userIdList.add(rs.getString("user_id"));


			}

			for(String Id : userIdList){

				if(Id.equals(userId)){

					result = "このIDは既に使われています";

				}

			}





		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;



	}

}

