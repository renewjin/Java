package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 비교 연산자
		 == : 서로 같으면 true
		 	예를 들어 
		 			5 == 5 true
		 			3 == 5 false
		 != : 서로 다르면 true
		 	예를 들어
		 			5 != 5 false
		 			3 != 5 true
		 			
		 논리 연산자
		 && : and 왼쪽 오른쪽 두 개의 조건이 모두 참일 때만 전체 표현이 참
		 	예를 들어
		 			(5 == 5) && (3 == 3) : true
		 			(5 == 3) && (3 == 3) : false
		 			(5 == 5) && (3 == 5) : false
		 			
		 || : or 왼쪽 오른쪽 둘 중 하나라도 참이면 참
		 	예를 들어
		 			(5 == 5) || (3 == 3) : true
		 			(5 == 3) || (3 == 3) : true
		 			(5 == 5) || (3 == 5) : true
		 			(5 == 3) || (3 == 5) : false
		 			
		 비교 연산자 >, <, >=, <=
		 왼쪽 > 오른쪽 : 오른쪽의 값보다 왼쪽의 값이 크면 true
		 왼쪽 >= 오른쪽 : 오른쪽의 값보다 왼쪽의 값이 크거나 같으면 true
		 왼쪽 < 오른쪽 : 왼쪽의 값보다 오른쪽의 값이 크면 true 
		 왼쪽 <= 오른쪽 : 왼쪽의 값보다 오른쪽의 값이 크거나 같으면 크면 true 
		 
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		// num1 num2 값이 1. 같은지 2. 다른지 3. 어떤값이 더 큰지
		//1. num1 == num2
		
		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		boolean result3 = num1 > num2;
		System.out.println("num1 == num2 : " + result1);
		System.out.println("num1 != num2 : " + result2);
		System.out.println("num1 > num2 : " + result3);
		
		

	}

}
