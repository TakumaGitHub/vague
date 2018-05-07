package com.internousdev.vague.util;

import java.util.ArrayList;

import com.internousdev.vague.dto.ProductDTO;

public class ProductList {

	public ArrayList<ArrayList<ProductDTO>> devideProductListBy9Items(ArrayList<ProductDTO> productList) {
		ArrayList<ArrayList<ProductDTO>> nineItemsList = new ArrayList<>();

		int t = 0;
		nineItemsList.add(new ArrayList<ProductDTO>());
		for(int i=1; i <= productList.size() ; i++) {
			nineItemsList.get(t).add(productList.get(i - 1));
			nineItemsList.get(t).add(productList.get(i - 1));
				if(i % 9 == 0 && i != 0) {
					t++;
					nineItemsList.add(new ArrayList<ProductDTO>());
				}
		}
		return nineItemsList;
	}

}
