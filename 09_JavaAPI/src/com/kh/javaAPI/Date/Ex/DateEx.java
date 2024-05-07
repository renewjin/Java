package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 Date : 특정 날짜와 시간을 나타내는 클래스
 Calendar : 날짜와 시간을 조작하는데 사용되는 추상클래스
 GergorianCalendar : 그레고리력을 사용하서 날짜와 시간을 계산
 SimpleDateFormat : 날짜와 시간을 형식으로 보여주고 그것을 출력
 LocalDate
 */
public class DateEx {
	public static void main(String[] args) {
		//1. Date
		Date 현재데이트 = new Date();
		System.out.println(현재데이트);
		
		//2. Calendar
		Calendar 캘린더 = Calendar.getInstance(); // 추상클래스이기때문에 객체로 가져올수 없음
			// 년 월 일
		int 년 = 캘린더.get(Calendar.YEAR);
		int 월 = 캘린더.get(Calendar.MONTH) + 1; // 0월 부터 가져오기 때문에 +1을 해줘야함
		int 일 = 캘린더.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 날짜 : " + 년 + "/" + 월 + "/" + 일);
		
		/*
		 그레고리안 달력은 1년 1월 1일 무조건 월요일로 정의돼있음
		 2024, 4, 23을 하면 자동으로 2024년 5월 23일로 변경됨
		 2024년 5월 23일은 목요일
		 */
		
		GregorianCalendar 그레고리안1 = new GregorianCalendar();
		GregorianCalendar 그레고리안2 = new GregorianCalendar(2024, 4, 23); // 2024 5월 23일 로 될 것
		int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK); // 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7) 일(8)
		System.out.println("날짜 : " + 날짜); // 2024 5월 23일이 목요일이기 때문에 5가 나타남
		
		// 4. SimpleDateFormat 년 월 일
		// 년 : y
		// 월 : M
		// 일 : d
		// 시 : H (H : 0 ~ 23시	h : 오전(am)과 오후(pm)로 나눠서 표기)
		// 분 : m
		// 초 : s
		// 요일 : E
		//SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("MM-dd");
		String 날짜표시 = 날짜형식.format(new Date());
		System.out.println("날짜형식 지정해서 표시하기 : " + 날짜표시);
		
		// 5. LocalDate 현재 날짜 가져오기
		LocalDate 현재날짜는 = LocalDate.now(); // 추상클래스
		System.out.println("현재날짜는 : " + 현재날짜는);
	}
}
