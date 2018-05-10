package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.vague.dto.MyPageDTO;
import com.internousdev.vague.util.DBConnector;

// 担当：縄田
// マイページに表示するユーザー情報をDBから取得し、DTOに格納

public class MyPageDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	/**
	 * DBからユーザー情報を取得するためのメソッド
	 * @return myPageList
	 */

	public ArrayList<MyPageDTO> getMyPageUserInfo(String userId)throws SQLException{
		ArrayList<MyPageDTO>  myPageList = new ArrayList<MyPageDTO>();

		String sql = "SELECT password,family_name,first_name,family_name_kana,first_name_kana,sex,email FROM user_info WHERE user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				MyPageDTO dto = new MyPageDTO();
				dto.setPassword(rs.getString("password"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setSex(rs.getInt("sex"));
				dto.setEmail(rs.getString("email"));

				myPageList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	return myPageList;
	}
}

