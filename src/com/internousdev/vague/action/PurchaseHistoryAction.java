package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.PurchaseHistoryDAO;
import com.internousdev.vague.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;
//★注文履歴★
//マイページからとんでくる!

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {

	// セッション
	public Map<String, Object> session;

	// 商品購入履歴取得DAO
	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();

	// 商品購入履歴格納DTO List
	private List<PurchaseHistoryDTO> allHistoryList = new ArrayList<>();

	// 商品購入履歴格納DTO List
	public ArrayList<PurchaseHistoryDTO> historyList = new ArrayList<PurchaseHistoryDTO>();

	//ページごとに格納するList
	private ArrayList<ArrayList<PurchaseHistoryDTO>> mainList = new ArrayList<>();

	//現在のページ数
	private int pageSelect;

	//ページ数の一覧List
	private List<Integer> pageList = new ArrayList<>();


	// 1 = 全件削除
	// 2 = 個別ボタン削除
	// 3 = チェックボックス削除
	private String deleteFlg; // 削除フラグ

	private String message; // 削除メッセージ
	private int id; // 個別削除id取得 DAOメソッドの戻り値
	private List<String> checkList;// checkBoxの値
	private int sort; // ソート

	// 商品購入履歴取得メソッド
	public String execute() throws SQLException {

		// ログインしてなければログインページに移動
		if (!session.containsKey("userId")) {
			return ERROR;// ■login.jspへ
		}

		String result = SUCCESS;
		String userId = (session.get("userId").toString());// sessionからuserId取得

		// もし削除フラグがなかったら、購入履歴を表示する。
		// DAOのメソッドを呼びだす→getPurchaseHistory
		// historyList=日付順の注文履歴

		// 1
		if (deleteFlg == null) {
			// ↓DAOのメソッド↓
			setAllHistoryList(purchaseHistoryDAO.getPurchaseHistory(userId));

			// ↓iteratorで回す。iteratorはnewする必要がなく、iterator()を呼び出せばよい。
			Iterator<PurchaseHistoryDTO> it = historyList.iterator();

			if (!(it.hasNext())) {
				historyList = null;
			}
			// 2
		} else if (deleteFlg.equals("1")) { // 全件削除メソッド（下にあるよお） //deleteFlg="1"
			delete(); // ★
			setAllHistoryList(purchaseHistoryDAO.getPurchaseHistory(userId));

			// 3
		} else if (deleteFlg.equals("2")) { // 選択した項目を削除 //checkFlg="2"
			deleteChoose();// ★
			setAllHistoryList(purchaseHistoryDAO.getPurchaseHistory(userId));
		}

		// ソート機能↓------------------------------------------------------
		if (sort == 1) { // デフォルトの注文日順
			allHistoryList = purchaseHistoryDAO.getPurchaseHistory(userId);

		} else if (sort == 2) {// 値段の高い順
			allHistoryList = purchaseHistoryDAO.sortPriceDesc(userId);

		} else if (sort == 3) {// 値段の安い順
			allHistoryList = purchaseHistoryDAO.sortPriceAsc(userId);
		}
		return result;
	}

	// 全件削除メソッド----------------------------------------------------------
	public void delete() throws SQLException {

		String user_id = session.get("userId").toString();

		int res = purchaseHistoryDAO.deleteHistory(user_id);

		if (res > 0) {
			historyList = null;
			setMessage("【注文履歴をすべて削除しました】");
		} else if (res == 0) {
			setMessage("【履歴の削除に失敗しました。】");
		}

	}

	public void deleteChoose() throws SQLException {
		if (checkList == null) {
			setMessage("チェックボックスにチェックを入れてください。");
			return;
		}

		// 何件削除したか
		// checkListはjspからもってきたchooseList <s:checkbox name="checkList,,,,,>
		int res = purchaseHistoryDAO.deleteChoose(checkList);

		// 削除したときのメッセージ
		if (res > 0) {
			setMessage(res + "件削除しました");
		} else if (res == 0) {
			setMessage("削除できませんでした。");
		}
	}

	// deleteFlg
	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	// jspからIDもってくる
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 削除メッセージ
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// session
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	// checkBoxの値
	public List<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(List<String> checkList) {
		this.checkList = checkList;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getPageSelect() {
		return pageSelect;
	}

	public void setPageSelect(int pageSelect) {
		this.pageSelect = pageSelect;
	}

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}

	public List<PurchaseHistoryDTO> getAllHistoryList() {
		return allHistoryList;
	}

	public void setAllHistoryList(List<PurchaseHistoryDTO> allHistoryList) {
		this.allHistoryList = allHistoryList;
	}

	public ArrayList<ArrayList<PurchaseHistoryDTO>> getMainList() {
		return mainList;
	}

	public void setMainList(ArrayList<ArrayList<PurchaseHistoryDTO>> mainList) {
		this.mainList = mainList;
	}

	public ArrayList<PurchaseHistoryDTO> getHistoryList() {
		return historyList;
	}

	public void setHistoryList(ArrayList<PurchaseHistoryDTO> historyList) {
		this.historyList = historyList;
	}
}