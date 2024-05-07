package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
		method3();
	}
	
	public static void method1() {
		// 입력 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.print("입력한 숫자가 동일합니다");
		} else {
			System.out.print("입력한 숫자가 다릅니다");
		}
		
	}
	
	public static void method2() {
		// 입력 문자값 2개를 받아서 문자가 일치하는지 비교
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("str1 : ");
		String str1 = sc.nextLine();
		System.out.print("str2 : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.print("입력한 문자가 동일합니다");
		} else {
			System.out.print("입력한 문자가 다릅니다");
		}
	}
	
	public static void method3() {
		// 실수 2개를 입력받아서 실수 비교
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("double1 : ");
		double double1 = sc.nextDouble(); 
		System.out.print("double2 : ");
		double double2 = sc.nextDouble();
		
		if (double1 == double2) {
			System.out.print("입력한 숫자가 동일합니다");
		} else {
			System.out.print("입력한 숫자가 다릅니다");
		}
	}

}
