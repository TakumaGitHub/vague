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
	public String isTrue(String userId, String password, int question, String answer){

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

				}else if(question != rs.getInt("question")){

					result = "秘密の質問が間違っています";

				}else if(!answer.equalsIgnoreCase(rs.getString("answer")) || compareHiraganaKatakana(answer, rs.getString("answer")) != 0){

					result = "秘密の答えが間違っています";

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



	//以下サブメソッド(文字列の比較)

	private int compareHiraganaKatakana(String s1, String s2) {

		return getHiraFrom(s1).compareTo(getHiraFrom(s2));

		}

	private String getHiraFrom(String s) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

		char c = s.charAt(i);

		if (0x30A1 <= c && c <= 0x30F3) {

		c -= 0x0060;

		}
		sb.append(c);
		}
		return sb.toString();
		}




}
