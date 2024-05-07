package com.kh.ExceptionEx;

public class ExceptionPre {
	public static void main(String[] args) {
		// 0으로 나누기 할 때 if 작성하며 예외 처리 발생 방지
		
		try {
			int 나누기결과 =  10 / 0;
			System.out.println(나누기결과);
		} catch (ArithmeticException 산수예외발생) {
			System.out.println("산수문제가 발생했습니다");
		}
		
		// try 단축키 => try 작성후 ctrl + space
		try {
			// 예외가 발생할 수 있지만 시도하고 싶은 코드 작성
			
			int[] 배열 = {1, 2, 3};
			System.out.println(배열[3]);
			
		} catch (Exception e) {
			System.out.println("범위를 벗어났습니다");
		}
	}
}
