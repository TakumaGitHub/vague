package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.vague.dto.AddressDTO;
import com.internousdev.vague.util.DBConnector;

public class AddressDAO {

	public int registerAddress(AddressDTO addressDTO) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = null;

		int updateCount = 0;

//		郵便番号(postal_code)は一旦保留。
		String sql = "INSERT INTO destination_info(user_id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, postal_code, email, regist_date) VALUES(?,?,?,?,?,?,?,?,NOW())";

		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, addressDTO.getUserId());
			ps.setString(2, addressDTO.getFamilyName());
			ps.setString(3, addressDTO.getFirstName());
			ps.setString(4, addressDTO.getFamilyNameKana());
			ps.setString(5, addressDTO.getFirstNameKana());
			ps.setString(6, addressDTO.getAddr11());
			ps.setString(7, addressDTO.getTelNumber());
			ps.setString(8, addressDTO.getPostalCode());
			ps.setString(9, addressDTO.getEmail());

			updateCount = ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

		return updateCount;

	}


	public ArrayList<AddressDTO> getAddressInfo(String userId) throws SQLException{

		ArrayList<AddressDTO> addressInfoListDTO = new ArrayList<AddressDTO>();
		DBConnector db = new DBConnector();
		Connection con = null;

//		郵便番号(postal_code)は一旦保留。
		String sql = "SELECT id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, postal_code, email FROM destination_info WHERE user_id = ?";


		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				AddressDTO addressDTO = new AddressDTO();
				addressDTO.setAddressId(rs.getInt("id"));
				addressDTO.setFamilyName(rs.getString("family_name"));
				addressDTO.setFirstName(rs.getString("first_name"));
				addressDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				addressDTO.setFirstNameKana(rs.getString("first_name_kana"));
				addressDTO.setEmail(rs.getString("email"));
				addressDTO.setTelNumber(rs.getString("tel_number"));
				addressDTO.setPostalCode(rs.getString("postal_code"));
				addressDTO.setAddr11(rs.getString("user_address"));
				addressInfoListDTO.add(addressDTO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return addressInfoListDTO;
	}

	public AddressDTO getAddressInfo(int addressId) throws SQLException{

		AddressDTO addressDTO = new AddressDTO();
		DBConnector db = new DBConnector();
		Connection con = null;

//		郵便番号(postal_code)は一旦保留。
		String sql = "SELECT id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, postal_code, email FROM destination_info WHERE id = ?";


		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, addressId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {

				addressDTO.setAddressId(rs.getInt("id"));
				addressDTO.setFamilyName(rs.getString("family_name"));
				addressDTO.setFirstName(rs.getString("first_name"));
				addressDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				addressDTO.setFirstNameKana(rs.getString("first_name_kana"));
				addressDTO.setEmail(rs.getString("email"));
				addressDTO.setTelNumber(rs.getString("tel_number"));
				addressDTO.setPostalCode(rs.getString("postal_code"));
				addressDTO.setAddr11(rs.getString("user_address"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return addressDTO;
	}


}
