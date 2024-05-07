package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitch2 {
	
	/*
	 if문을 활용한 예제와 swtich를 활용한 예제
	 */
	public static void main(String[] args) {
		// if를 활용한 메서드 출력
		
		// switch를 활용한 메서드 출력
		ifExam();
	}
	
	public static void ifExam() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 3까지 숫자 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		String result;
		//System.out.println("If문을 활용한 예제입니다");
		if (num == 1) {
			//System.out.println("원");
			result = "원";
		} else if (num ==2) {
			//System.out.println("투");
			result = "투";
		} else {
			System.out.println("잘못된 입력");
			//result = "잘못된 입력";
			return;
		}
		System.out.println(num + "은 한국어로 " +  result + "입니다");
	}
	
	public static void switchExam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 한국어로 입력해주세요.");
		System.out.print("입력방법 (봄, 여름, 가을, 겨울) : ");
		
		String season = sc.nextLine();
		String state;
		// switch 문을 활용해서 문자열 비교 하고 출력하기
		switch (season) {
			case "봄" : 
				//ystem.out.println("따뜻한 날씨");
				state = "따뜻한 날씨";
				break;
			case "여름" : 
				//System.out.println("뜨거운 날씨");
				state = "뜨거운 날씨";
				break;
			case "가을" : 
				//System.out.println("단풍의 날씨");
				state = "단풍의 날씨";
				break;
			case "겨울" : 
				//System.out.println("새하얀 날씨");
				state = "새하얀 날씨";
				break;
			default:
				System.out.println("해당하는 계절이 없습니다.");
				return;
		}
		System.out.println(state + " 날씨");
	}
}
