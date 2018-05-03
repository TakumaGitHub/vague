package com.internousdev.vague.util;

import java.util.ArrayList;
import java.util.List;

/**
 * DTOを格納したリストをdivideNumberで指定した数で分けるクラス
 * @author miyazaki
 *
 * @param <E>
 */
public class DivideDTOList<E> {


	public List<List<E>> divide(List<E> DTOList, int divideNumber){

		List<List<E>> dividedDTOList = new ArrayList<List<E>>();

		List<E> packedDTOList = new ArrayList<E>();

		for(int i = 0; i < DTOList.size(); i++){

			if((i + 1) % divideNumber == 0){

				packedDTOList.add(DTOList.get(i));
				dividedDTOList.add(packedDTOList);
				packedDTOList = new ArrayList<E>();


			}else if((i + 1) == DTOList.size()){

				packedDTOList.add(DTOList.get(i));
				dividedDTOList.add(packedDTOList);

			}else{

				packedDTOList.add(DTOList.get(i));

			}

		}


		return dividedDTOList;

	}

}
