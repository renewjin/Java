package com.kh.conditionEx;

import java.util.Scanner;

// 패키지 : 작성한 파일의 폴더 위치
//조건문 기능용 클래스
public class ConditionEx {
	
	//최종 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1();
		//method2();
		//method3();
		practice1();

	}
	
	/*
	 if 주어진 조건이 참일 때 실행되는 코드 블록
	 else 조건이 거짓일 때 실행되는 코드 블록(필수가 아님)
	 
	 사용방법
	 if (조건문) {
	 	조건이 참일 경우 실행할 코드 작성
	 	만약에 조건문의 조건이 참이 아닐 경우
	 	자동으로 실행 종료
	 }
	 
	 */
	
	// 메서드 1 : 19세 이상은 성인입니다. 출력하기
	public static void method1() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("고객님의 나이를 입력하세요 : ");
		 int age = sc.nextInt();
		 if (age>=19) {
			 System.out.println("성인입니다.");
		 } else {
			 System.out.println("미성년자입니다");
		 }
	}
	
	public static void method2() {
		int num = 2;
		
		// 만약 num 이 짝수일 경우 짝수입니다 출력하기
		if (num % 2 == 0) {
			System.out.println("짝수입니다!!!");
		} else {
			System.out.println("홀수입니다!!!");
		}
	}
	
	public static void method3() {
		
		// 0~13 어린이
		
		// 1. 범위
			// 0보다 커야함
			// 14보다 작아야함
		// 만약에 이 학생의 나이가 0보다 크고 14보다 작을 때
		// 어린이라고 표기하기
		
		// 14부터는 어린이가 아닙니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		if (age > 0 && age < 14) {
			System.out.println("어린이 입니다.");
		} else {
			System.out.println("어린이가 아닙니다.");
		}
		
	}
	
	public static void practice1() {
		// 나이가 10세 이상 20세 미만일 때는 10 대
		// 이 외는 10대가 아님 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		if (age<20 && age>=10) {
			System.out.println("10대 입니다.");
		} 
		else {
			System.out.println("10대가 아닙니다.");
		}
		
	}
	
	public static void practice2() {
		// 나이가 80세 이상이면 80세 이상입니다. 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		if (age>=80) {
			System.out.println("80 이상입니다.");
		} 
	}
	
}
