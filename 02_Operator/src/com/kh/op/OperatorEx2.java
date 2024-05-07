package com.kh.op;

import java.util.Scanner;

// class 바깥에는 package와 import만 작성할 수 있음.
// 이외 개발자가 실행하고자 하는 내용은 class 내부에 작성해줘야함
// 메서드 : 특정 상태나 기능을 정리해놓은 집합
public class OperatorEx2 {
	//1. 메서드 : 스캐너를 사용하지 않는 메서드
	public static void method1() {
		int num1 = 20;
		int num2 = 5;
		int 더하기 = num1 + num2;
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		int 나누기 = num1 / num2;
		System.out.println("더하기 : " + 더하기);
		System.out.println("빼기 : " + 빼기);
		System.out.println("곱하기 : " + 곱하기);
		System.out.println("나누기 : " + 나누기);
	}
	
	public static void method2() {
		//Scanner sc = new Scanner(System.in);
		double num1 = 1.4;
		double num2 = 2.5;
		double 더하기 = num1 + num2;
		double 빼기 = num1 - num2;
		double 곱하기 = num1 * num2;
		double 나누기 = num1 / num2;
		System.out.println("더하기 : " + 더하기);
		System.out.println("빼기 : " + 빼기);
		System.out.println("곱하기 : " + 곱하기);
		System.out.println("나누기 : " + 나누기);
	}
	
	// method3 () -> Scanner
	// 메서드 옆에 있는 () 나중에 어떤 값을 받을 때 사용
	// 값을 받을 일이 없으면 () 빈공간으로 유지
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 a를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수값 b를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("덧셈결과 : " + sum);
		System.out.println("뺄셈결과 : " + sub);
		System.out.println("곱셈결과 : " + mul);
		System.out.println("나눗셈결과 : " + div);
		
		sc.close();
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수값 a를 입력하세요 : ");
		double num1 = sc.nextDouble();
		System.out.print("실수값 b를 입력하세요 : ");
		double num2 = sc.nextDouble();
		
		double sum = num1 + num2;
		double dif = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		
		System.out.println("덧셈결과 : " + sum);
		//System.out.println("덧셈결과 : " + round(sum,2));
		//System.out.println("덧셈결과 : " + Math.round(sum));
		System.out.println("뺄셈결과 : " + dif);
		System.out.println("곱셈결과 : " + mul);
		System.out.println("나눗셈결과 : " + div);
		
		sc.close();
		
		method1();
	}
		
	
	// 최종 제출 메인 메서드
	public static void main(String[] args) {
		// 앞으로 만든 메서드 중에서 출력하고 싶은 메서드만 작성할 것
		//method1();
		//method2();
		//method3();
		method4();

	}

}
