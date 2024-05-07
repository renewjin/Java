package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	 if 문으로 정수를 비교할 수 있고, 실수를 비교할 수 있고, 문자열 문자 등 모든 것을 비교할 수 있음.
	 
	 대표적으로 정수비교와 문자열 비교 있음
	 
	 정수 비교
	 	if (숫자 == 숫자) {
	 		숫자와 숫자가 같을 때 실행코드
	 	}
	 	
	 문자열 비교
	 	if (문자열.equals("문자열")) {
	 		문자열과 문자열이 같을 때 실행코드
	 	}
	 */

	public static void main(String[] args) {
		// 정수비교
		int number = 10;
		if (number == 10) {
			System.out.println("숫자가 동일합니다");
		}
		
		// 문자열 비교
		String str = "hello";
		if (str.equals("hello")) {
			System.out.println("문자열이 동일합니다");
		}
		
		String str1 = "둘";
		String str2;
		
		if ("둘".equals(str1)) {
			System.out.println("모두 둘 입니다.");
		}

	}
	

}
