package com.kh.op;

import java.util.Scanner;

public class OperatorPre {

	public static void main(String[] args) {
		method1();
	}
	//  최종으로 출력하는 메서드는 아님
	// 내가 필요할 때 꺼내서 사용하는 메서드
	// 메서드 : 특정 상태나 기능을 정리해놓은 집합
	// static : 고정된 이라는 뜻을 가지고 있음
	// static 이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	
	public static void method1() {
	//public void method1() {
		// 1. int num1 = 10 int num2 = 3
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		int num1 = 10;
		int num2 = 3;
		
		int sum_1 = num1 + num2;
		int dif_1 = num1 - num2;
		int mul_1 = num1 * num2;
		int div_1 = num1 / num2;
		
		System.out.println("덧셈결과 : " + sum_1);
		System.out.println("뺄셈결과 : " + dif_1);
		System.out.println("곱셈결과 : " + mul_1);
		System.out.println("나눗셈결과 : " + div_1); // -> 3 int이기 때문에 몫만 보여줌
		
		
		
		// 2. double num3 = 2.5 double num4 = 3.5
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		
		double num3 = 2.5;
		double num4 = 3.5;
		
		double sum_2 = num3 + num4;
		double dif_2 = num3 - num4;
		double mul_2 = num3 * num4;
		double div_2 = num3 / num4;
		
		System.out.println("덧셈결과 : " + sum_2);
		System.out.println("뺄셈결과 : " + dif_2);
		System.out.println("곱셈결과 : " + mul_2);
		System.out.println("나눗셈결과 : " + div_2); // -> 0.714285 double이기 때문에 소수점자리까지 다 보여줌 
		
		// 3. Scanner을 이용하여 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수값 a를 입력하세요 : ");
		double a = sc.nextDouble();
		System.out.print("실수값 b를 입력하세요 : ");
		double b = sc.nextDouble();
		
		double sum_3 = a + b;
		double dif_3 = a - b;
		double mul_3 = a * b;
		double div_3 = a / b;
		
		System.out.println("덧셈결과 : " + sum_3);
		System.out.println("뺄셈결과 : " + dif_3);
		System.out.println("곱셈결과 : " + mul_3);
		System.out.println("나눗셈결과 : " + div_3);
		

	}

}
