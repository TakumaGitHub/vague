package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

public class UserCreateDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	DateUtil dateUtil = new DateUtil();
	int i;

	//以下新規ユーザー登録用メソッド

	public int registerUser(LoginUserDTO dto) throws SQLException{

		String sql = "INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,question,answer,insert_date)VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getPassword());
			ps.setString(3, dto.getFamilyName());
			ps.setString(4, dto.getFirstName());
			ps.setString(5, dto.getFamilyNameKana());
			ps.setString(6, dto.getFirstNameKana());
			ps.setInt(7, dto.getSex());
			ps.setString(8, dto.getEmail());
			ps.setInt(9, dto.getQuestion());
			ps.setString(10, dto.getAnswer());
			ps.setString(11, dateUtil.getDate()); //DateUtilクラスのgetDateメソッドで登録時の日時をDBに格納
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return i;
	}



	//以下ログイン認証用メソッド

	public LoginUserDTO getUserInfo(String userId,String password) throws SQLException{

		LoginUserDTO dto = new LoginUserDTO();
		String sql = "SELECT * from user_info WHERE user_id=? AND password=?";

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
				dto.setLoginFlg(rs.getInt("login_flg"));
				dto.setmFlg(rs.getInt("m_flg"));
				dto.setQuestion(rs.getInt("question"));
				dto.setAnswer(rs.getString("answer"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdateDate(rs.getString("update_date"));

			}

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
			return dto;

		}

}
