package com.internousdev.vague.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public String getDate(){

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String now = simpleDateFormat.format(date);

		return now;
	}

}
