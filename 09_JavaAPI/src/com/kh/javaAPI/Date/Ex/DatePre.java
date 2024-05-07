package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜 만들기
		
		// 1. yyyy-MM-dd
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		//Date date = new Date();
		//String 날짜표시1 = sd1.format(date));
		String 날짜표시1 = sd1.format(new Date());
		System.out.println(날짜표시1);
		
		// 2. HH:mm:ss
		SimpleDateFormat sd2 = new SimpleDateFormat("HH:mm:ss");
		String 날짜표시2 = sd2.format(new Date());
		System.out.println(날짜표시2);
		
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat sd3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  EEEE");
		String 날짜표시3 = sd3.format(new Date());
		System.out.println(날짜표시3);

	}

}
