package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.vague.dto.PurchaseHistoryDTO;
import com.internousdev.vague.util.DBConnector;

// 担当：縄田
// 表示する商品購入履歴をDBから取得し、DTOに格納。

public class PurchaseHistoryDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId) throws SQLException{
		ArrayList<PurchaseHistoryDTO> purchaseHistoryDTOList = new ArrayList<PurchaseHistoryDTO>();

		String sql = "SELECT phi.id as id, pi.product_id as product_id, pi.product_name as product_name, pi.product_name_kana as product_name_kana , pi.product_description as product_description,pi.image_file_name as image_file_name, pi.image_file_path as image_file_path, phi.price, phi.product_count, phi.address_id, di.postal_code, di.user_address, pi.release_company, pi.release_date, phi.regist_date  FROM purchase_history_info as phi LEFT JOIN product_info as pi ON phi.product_id = pi.product_id LEFT JOIN destination_info as di ON phi.address_id = di.id  WHERE phi.user_id = ? ORDER BY regist_date DESC";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();

				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setId(rs.getString("id"));
				dto.setProductId(rs.getString("product_id"));
				dto.setCount(rs.getInt("product_count"));
				dto.setAddressId(rs.getInt("address_id"));
				dto.setPostalCode(rs.getString("postal_code"));
				dto.setUserAddress(rs.getString("user_address"));
				dto.setInsertDate(rs.getString("regist_date").replaceAll("\\.0$", ""));

				purchaseHistoryDTOList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return purchaseHistoryDTOList;
	}


	//--------------------------------------------------------------
	// 全削除するメソッド　
	//--------------------------------------------------------------*/
	public int deleteHistory(String userId) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM purchase_history_info where user_id = ?";
			int result = 0;
		try{	PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);    //◆userId◆　そのユーザーの履歴をすべて削除
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}
}