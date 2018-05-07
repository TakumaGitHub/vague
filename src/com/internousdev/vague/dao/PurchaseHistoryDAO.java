package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.vague.dto.PurchaseHistoryDTO;
import com.internousdev.vague.util.DBConnector;
//①購入履歴表示（デフォルトは日付順）
//②購入履歴削除(個別削除・全部削除）

public class PurchaseHistoryDAO {

/*--------------------------------------------------------------
 * 購入履歴表示メソッド
 * @param userId
 * @purchaseHistoryDTOList
------------------------------------------------ */


	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<PurchaseHistoryDTO> purchaseHistoryDTOList = new ArrayList<PurchaseHistoryDTO>();

		//購入履歴のテーブルに商品テーブルをくっつけて表示！(LEFT JOIN)
		//"product_Id"で紐づけている。　

		//piはproduct_infoの略
		//phiはpurchase_history_infoの略

		//★ ORDER BY insert_date DESC ★デフォルトの日付順！sort == 1
		String sql = "SELECT phi.id as id, pi.product_id as product_id, pi.product_name as product_name, pi.product_name_kana as product_name_kana , pi.product_description as product_description,pi.image_file_name as image_file_name, pi.image_file_path as image_file_path, phi.price, phi.product_count, pi.release_company, pi.release_date, phi.insert_date  FROM purchase_history_info as phi LEFT JOIN product_info as pi ON phi.product_id = pi.product_id  WHERE phi.user_id = ? ORDER BY insert_date DESC";


		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
				dto.setId(rs.getString("id"));
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setPrice(rs.getInt("price"));
				dto.setCount(rs.getInt("product_count"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setInsertDate(rs.getString("insert_date").replaceAll("\\.0$", ""));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setProductDescription(rs.getString("product_description"));

				purchaseHistoryDTOList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally{
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

		//(deleteFlg.equals("1"))
		String sql = "DELETE FROM purchase_history_info where user_id = ?";


		//★result★
			int result = 0;
		try{	PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);    //◆userId◆　そのユーザーの履歴をすべて削除

			result = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;

	}


	 //--------------------------------------------------------------
	 //削除ボタンで1件ずつ削除するメソッド	 //
	 //--------------------------------------------------------------
	public int deletePart(int id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "DELETE FROM purchase_history_info where id = ?";
		PreparedStatement ps;
		int result2 = 0;
		try{
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			result2 = ps.executeUpdate();
			System.out.println(result2);

		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result2;
	}

	//---------------------------------------------------------------------------------
	//選択削除メソッド　選択したものだけを削除
	//jspからのcheckBoxのcheckListを取得
	//<s:checkbox name="checkFlg" value="2" fieldValue="%{id}" />
	//---------------------------------------------------------------------------------
	public int deleteChoose(List<String> checkList) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		//(checkFlg.equals("2"))
		String sql = "DELETE FROM purchase_history_info where id = ?";

		PreparedStatement ps;
		int result3 = 0;
		try{
			ps = con.prepareStatement(sql);

			for(int i = 0;i < checkList.size();i++){
				String checkId = checkList.get(i);
				ps.setString(1, checkId);
				result3 += ps.executeUpdate();
			}
		}catch(SQLException e){
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result3;
	}
}