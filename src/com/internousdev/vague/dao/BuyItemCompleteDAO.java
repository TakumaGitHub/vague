package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.internousdev.vague.dto.CartDTO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.DBConnector;

/*
 * 決済ボタンを押した後のアクション
 */

public class BuyItemCompleteDAO {
	private Map<String,Object> session;
	/*
	 * カート内情報を取得しCartDTOにsetするメソッド
	 */
	public int getCount(String userId,int productId)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		int Count = 0;

		String sql = "select product_count from product_info where user_id = ? and product_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Count += rs.getInt("product_count");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return Count;
	}

	public ArrayList<CartDTO> getCart(String userId)throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection= dbConnector.getConnection();
		ArrayList<CartDTO> cartLIst=new ArrayList<CartDTO>();


		 //↓cart_info,product_info内の共通product_idで２つのテーブルを結合
		String sql = "SELECT pi.product_stock as product_stock, "
				+ "ci.user_id as userId, "
				+ "ci.id as cartId,"
				+ "ci.product_id as product_id, "
				+ "pi.product_name as product_name, "
				+ "pi.product_name_kana as product_name_kana, "
				+ "pi.image_file_path as image_file_path, "
				+ "pi.price as price, "
				+ "ci.product_count as product_count, "
				+ "pi.release_company as release_company, "
				+ "pi.release_date as release_date "
				+ "FROM cart_info as ci LEFT JOIN product_info as pi ON ci.product_id = pi.product_id WHERE ci.user_id = ?";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				CartDTO dto=new CartDTO();
				//product_infoテーブル
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setProductStock(rs.getInt("product_stock"));
				dto.setPrice(rs.getInt("price"));
				//cart_infoテーブル
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductCount(rs.getInt("product_count"));

//				if(rs.getInt("product_count")>=rs.getInt("product_stock")){
//
//				}

				cartLIst.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return cartLIst;



	}
	//product内の情報を取得しproductDTOに格納するメソッド
	public int updateProductCount(ArrayList<CartDTO> purchasedItems){
		DBConnector dbConnector = new DBConnector();
		Connection connection= dbConnector.getConnection();
		int result=0;
		String sql="UPDATE product_info set product_stock = ?,update_date = now() WHERE product_id=?";

		try{
			PreparedStatement ps=connection.prepareStatement(sql);

			for(CartDTO item:purchasedItems){

				ps.setInt(1, item.getProductStock() - item.getProductCount());
				ps.setInt(2, item.getProductId());

				result += ps.executeUpdate();

			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
			connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;



	}

	/*
	 * purchase_history_infoテーブルに登録
	 *
	 */
	public int setPurchaseHistory(List<CartDTO> cartList) throws SQLException{
		DBConnector db= new DBConnector();
		Connection con = db.getConnection();

		int ret =0;

		//for文でカート情報の商品件数ぶん商品情報を商品購入履歴に登録する。その件数処理数がretに入る

		try{
			for(int i=0; i<cartList.size(); i++){
				String sql="INSERT INTO purchase_history_info(user_id,product_id,product_count,price,insert_date,update_date)VALUES(?,?,?,?,NOW(),NOW())";
				PreparedStatement ps=con.prepareStatement(sql);
                String userID=((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
				ps.setString(1,cartList.get(i).set(userID));
				ps.setInt(2, cartList.get(i).getProductId());
				ps.setInt(3, cartList.get(i).getProductCount());
				ps.setInt(4, cartList.get(i).getPrice());

				ret += ps.executeUpdate();

			}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}
			return ret;
		}


	/*
	 * cart_infoテーブル内のアイテムを削除
	 */

	public int deleteCartItems(String userId,ArrayList<CartDTO> purchasedItems){
		DBConnector db= new DBConnector();
		Connection con = db.getConnection();

		int ret=0;

		//userIdとproductIdが一致する項目を削除
		String sql = "DELETE FROM cart_info where user_id =? and product_id =?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			//購入したアイテムの数だけdeleteを行う
			for(CartDTO item:purchasedItems){
				ps.setString(1, userId);
				ps.setInt(2, item.getProductId());
				ret += ps.executeUpdate();

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
		return ret;
	}
}