package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {
	/*
	 if - else if - else
	 사용방법
	 if (조건) {
	 	조건이 참일 경우 실행할 코드 작성
	 }
	 else if (조건2){
	 	조건1이 거짓이고 조건2가 참일경우 실행할 코드 작성
	 }
	 else {
	 	조건 1과 조건2가 모두 거짓일 경우 실행할 코드
	 }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1();
		//method2();
		method3();
	}
	
	// 만약 돈이 2000원 이상 있을 경우 택시를 탄다
	// 만약 돈이 1500 ~ 2000 미만인 경우 대중교통을 이용한다
	// 돈이 없을 경우 걸어간다
	
	public static void method1() {
		int money = 1800;
		
		if (money >= 2000) {
			System.out.println("택시를 탄다");
		}
		else if (money>=1500 && money < 2000) {
			System.out.println("대중교통을 탄다");
		}
		else {
			System.out.println("걸어간다");
		}
	}
	
	public static void method2() {
		/*
		 나이를 입력받아
		 13세 이하면 어린이
		 13세 초과 18세 이하 청소년
		 18세 초과 성인
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		if (age<=13) {
			System.out.println("어린이");
		} else if (age>13 && age <=18) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}
	
	public static void method3() {
		/*
		 입력받은 숫자를 받아 계절을 출력하세요
		 1, 2, 12 겨울
		 3, 4, 5 봄
		 6, 7, 8 여름
		 9, 10, 11 가을
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요");
		int month = sc.nextInt();
		
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울");
		} else if (3<= month && 6> month) {
			System.out.println("봄");
		} else if (6<= month && 9 > month) {
			System.out.println("여름");
		} else if (9<= month && 12 > month) {
			System.out.println("가을");
		} else {
			System.out.println("해당하는 달은 없습니다");
		}
		
	}
	
	public static void method4() {
		// 13세 이하 어린이 14 ~ 18 청소년 19세 성인
		int age = 15;
		String result;
		if (age <=13) {
			result = "어린이";
		} else if (age >= 14 && age <19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		System.out.println(result);
	}

}
