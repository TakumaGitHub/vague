package com.internousdev.vague.util;

import java.util.ArrayList;
import java.util.List;

public class StringHandle {

	//入力された文字をカンマで分割するメソッド
	public static String[] trimSplitColor(String value){

		String[] values = (value.split(","));//文字列をカンマで分割

		for(String v : values){
			v=  v.trim() ;//前後の空白除去
		}


		return values;

	}



	//検索窓の入力キーワードから文字列の配列を生成
	public static List<String> retrievalValue(String retrievalValue){


		String[] RV = (retrievalValue.split("[\\s　]"));//文字列を空白で分割

		List<String> rValue = new ArrayList<String>();

		for(String rv : RV){
			rv=  rv.trim() ;//前後の空白除去
			rValue.add(rv);
		}

		return rValue;

	}

}
