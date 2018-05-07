package com.internousdev.vague.util;

import java.util.ArrayList;

import com.internousdev.vague.dto.ProductDTO;

public class PageObject {
	//ページネーションするために1ページごとの情報を保持するクラス。
	//ページ識別用ID
	private int pageId;

	//当該1ページに格納する商品リスト
	private ArrayList<ProductDTO> pagenatedItemList = new ArrayList<>();

	//ページネートされた商品リスト（pagenatedItemList)を取得するメソッド
	public ArrayList<ProductDTO> getPagenatedList() {
		return pagenatedItemList;
	}

	//ページネートされた商品リストを格納するメソッド
	public void setPagenatedList(ArrayList<ProductDTO> list) {
		pagenatedItemList = list;
	}

	// AllPagesクラスのpagenate()に使う
	// list ページネーション処理を行うリスト
	// ｊ=繰り返し用変数
	public void addPagenatedList(ArrayList<ProductDTO> list, int j) {
		pagenatedItemList.add((ProductDTO)list.get(j));
	}

	//ページID取得
	public int getPageId() {
		return pageId;
	}
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

}
