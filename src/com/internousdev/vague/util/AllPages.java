package com.internousdev.vague.util;

import java.util.ArrayList;

import com.internousdev.vague.dto.ProductDTO;

//渡されたリストに対してページネーションを行う

public class AllPages {
	//ページネーションしてjsp上に表示するために格納する。

	public ArrayList<PageObject> pagenate(ArrayList<ProductDTO> list, int count){
		ArrayList<PageObject> displayBook = new ArrayList<PageObject>();

		int itemCount = count;
		int index = 0;
		int maxPages = 0;

		if((list.size() % count) == 0){
			maxPages = list.size() / count;
		}else{
			maxPages = (list.size() / count) + 1;
		}

		for(int i = 0; i < maxPages; i++){
			PageObject page = new PageObject();
			for(int j = index; j < itemCount; j++){
			if(list.size() == j) {
				break;
			}
			page.addPagenatedList(list,j);
		}

		page.setPageId(i);
		displayBook.add(page);
		index += count;
		itemCount += count;
		}
		return displayBook;
	}

	//渡されたリスト数とページあたりのオブジェクト数から総ページ数を返す

	public int getMaxPage(ArrayList<?> list, int count){
		int maxPages = 0;

		if((list.size() % count) == 0) {
			maxPages = list.size() / count;
		}else{
			maxPages = (list.size() / count) + 1;
		}
		return maxPages;
	}
}
