package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.vague.dto.AddressDTO;
import com.internousdev.vague.util.DBConnector;
import com.internousdev.vague.util.DateUtil;

public class AddressRegiCompleteDAO {


//	SQLのINSERT文を用意
	String sql = "insert into destination_info(user_id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, postal_code, user_address, regist_date) values(?,?,?,?,?,?,?,?,?,?)";

	public int registerAddress(AddressDTO addressDTO) throws SQLException {

		DBConnector db = new DBConnector();
		DateUtil dateUtil = new DateUtil();
		Connection con = null;

		int count = 0;

		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,addressDTO.getUserId());
			ps.setString(2,addressDTO.getFamilyName());
			ps.setString(3,addressDTO.getFirstName());
			ps.setString(4,addressDTO.getFamilyNameKana());
			ps.setString(5,addressDTO.getFirstNameKana());
			ps.setString(6,addressDTO.getEmail());
			ps.setString(7,addressDTO.getTelNumber());
			ps.setString(8,addressDTO.getPostalCode());
			ps.setString(9,addressDTO.getAddr11());
			ps.setString(10,dateUtil.getDate());

			count = ps.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

		return count;

	}



	public ArrayList<AddressDTO> getAddressInfo(String userId) throws SQLException{

		ArrayList<AddressDTO> addressList = new ArrayList<AddressDTO>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "user_id, family_name, first_name, family_name, first_name, email, tel_number, user_address from destination_info where user_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				AddressDTO addressDTO = new AddressDTO();

				addressDTO.setAddressId(rs.getInt("id"));
				addressDTO.setUserId(rs.getString("user_id"));
				addressDTO.setFamilyName(rs.getString("family_name"));
				addressDTO.setFirstName(rs.getString("first_name"));
				addressDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				addressDTO.setFirstNameKana(rs.getString("first_name_kana"));
				addressDTO.setEmail(rs.getString("email"));
				addressDTO.setTelNumber(rs.getString("tel_number"));
				addressDTO.setAddr11(rs.getString("user_address"));

				addressList.add(addressDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

		return addressList;
	}

//	入力された宛先情報が既に登録されていた場合、登録を無効にし、確認画面でエラー文を表示させる。
	public String doubleCheck(AddressDTO addressDTO) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select count(id) as count from destination_info where user_id=? and family_name=? and first_name=? and family_name_kana=? and first_name_kana=? and email=? and tel_number=? and postal_code=? and user_address=?";

		String errorMsg = null;

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,addressDTO.getUserId());
			ps.setString(2,addressDTO.getFamilyName());
			ps.setString(3,addressDTO.getFirstName());
			ps.setString(4,addressDTO.getFamilyNameKana());
			ps.setString(5,addressDTO.getFirstNameKana());
			ps.setString(6,addressDTO.getEmail());
			ps.setString(7,addressDTO.getTelNumber());
			ps.setString(8,addressDTO.getPostalCode());
			ps.setString(9,addressDTO.getAddr11());

			ResultSet rs = ps.executeQuery();


			if(rs.next()) {
				if(rs.getInt("count") > 0) {
					errorMsg = "こちらの宛先は既に登録されています";
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

		return errorMsg;

	}



}
