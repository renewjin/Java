package com.kh.partic;

import java.util.Scanner;

public class Partic1_220405 {

	public static void main(String[] args) {
		//practice1();
		practice2();
		//practice3();
		//practice4();
		//practice5();

	}
	
	public static void practice1(){
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		// 인원 수와 사탕 개수를 키보드로 입력받고, 
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int 인원수 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int 사탕수 = sc.nextInt();
		
		int perPerson = 사탕수 / 인원수;
		int remain = 사탕수 % 인원수;
		
		System.out.println("1인당 사탕 개수 : " + perPerson);
		System.out.println("남는 사탕 개수 : " + remain);
		
		sc.close();
		
	}
	
	public static void practice2(){
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String 이름 = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int 학년 = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int 반 = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int 번호 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		/*
		if sc.nextLine() == "M";
			String 성별 = 남학생
		else:
			String 성별 = 여학생
		*/
		//String 성별 = sc.nextLine();
		
		//char 성별 = sc.next().charAt(0);
		String 성별;
		if (sc.nextLine() == "M") {
			성별 = "남학생";
		} else {
			성별 = "여학생";
		}
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double 성적 = sc.nextDouble();
		
		//System.out.println(String.format("%s학년 %s반 %s번 %s 남학생의 성적은 %s이다", 학년, 반, 번호, 이름, 성적));
		System.out.printf("%s학년 %s반 %s번 %s %s의 성적은 %.2f이다", 학년, 반, 번호, 이름, 성별, 성적);
		sc.close();
		
	}
	
	public static void practice3(){
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int 국어 = sc.nextInt();
		System.out.print("영어 : ");
		int 영어 = sc.nextInt();
		System.out.print("수학 : ");
		int 수학 = sc.nextInt();
		
		int 합계 = 국어 + 영어 + 수학;
		System.out.println("합계 : " + 합계);
		//double 평균 = 합계 / 3;
		// 변수의 형변환 할떄 미리 ()를 해서 처리해야 오류가 발생하지 않음 
		double 평균 = (double) 합계 / 3;
		System.out.println("평균 : " + 평균);
		
		sc.close();
		
	}
	
	public static void practice4(){
		// 2개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int 입력1 = sc.nextInt();
		System.out.print("입력2 : ");
		int 입력2 = sc.nextInt();
		
		System.out.println(입력1 == 입력2);
		
		boolean result = 입력1 == 입력2;
		System.out.println(result);
		
		sc.close();
	}
	
	public static void practice5(){
		// 2개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int 입력1 = sc.nextInt();
		System.out.print("입력2 : ");
		int 입력2 = sc.nextInt();
		System.out.print("입력3 : ");
		int 입력3 = sc.nextInt();
		
		boolean result = (입력1 == 입력2) && (입력1 == 입력3);
		System.out.println("result : " + result);
		
		System.out.println((입력1 == 입력2) && (입력1 == 입력3));
		
		sc.close();
	}

}
