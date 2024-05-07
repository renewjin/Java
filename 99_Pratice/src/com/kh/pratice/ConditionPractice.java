package com.kh.pratice;

import java.util.Scanner;

public class ConditionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice1();
		//practice2();
		//practice3();
		practice3_1();
		//practice4();
		//practice5();
	}
	
	public static void practice1() {
		// 양수일때의 홀수 짝수 나타내기
		// 양수가 아닐경우 양수만 입력해주세요라는 글자 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 2 == 0 && num >=0) {
			System.out.println("짝수입니다");
		}
		else if (num % 2 != 0 && num >=0) {
			System.out.println("홀수입니다");
		}
		else {
			System.out.println("양수만 입력해 주세요");
		}
		
		/*
		if (num > 0 ){
			if  (num % 2 ==0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		} else {
			System.out.println("양수만 입력해 주세요");
		}
		 */
	}
	
	public static void practice2() {
		// 국어, 영어, 수학 세과목의 점수를 키보드로 입력받고 합계와 평균 계산
		// 합계와 평균을 이용하여 합격/ 불합격처리
		// 합격조건 : 세과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수 입력하세요 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double avage = (double) total / 3;
		
		if (korean >= 40 && english >= 40 && math >=40 && avage >=60) {
			System.out.printf("국어 : %s, 영어 : %s, 수학 : %s, 합계 : %s, 평균 : %s \n", korean, english, math, total, avage);
			System.out.println("축하합니다, 합격입니다");
		}
		else {
			System.out.println("불합격입니다");
		}
		
		
	}
	
	public static void practice3() {
		// 1~12 사이의 수를 입력받아 해당 달의 일수를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month +"월은 31일까지 있습니다");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month +"월은 30일까지 있습니다");
		}
		else if (month == 2) {
			System.out.println(month +"월은 29일까지 있습니다");
		}
		else {
			System.out.println(month +"월은 잘못 입력된 달입니다");
		}
	}
	
	public static void practice3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		/*
		int day;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		} else if (month == 2) {
			day = 29;
		} else {
			day = 0;
		}
		
		switch (day) {
			case 31:
				System.out.println(month +"월은 31일까지 있습니다");
				break;
			case 30:
				System.out.println(month +"월은 30일까지 있습니다");
				break;
			case 29:
				System.out.println(month +"월은 29일까지 있습니다");
				break;
			default :
				System.out.println(month +"월은 잘못 입력된 달입니다");
		}
		*/
		int daysMonth;
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				daysMonth = 31;
				//System.out.println(month +"월은 31일까지 있습니다");
				break;
			case 2:
				daysMonth = 29;
				//System.out.println(month +"월은 29일까지 있습니다");
				break;
			case 4: case 6: case 9: case 11:
				daysMonth = 30;
				//System.out.println(month +"월은 30일까지 있습니다");
				break;
			default:
				//daysMonth = 0;
				System.out.println(month +"월은 잘못 입력된 달입니다");
				return;
		}
		 
		System.out.println(month +"월은 " + daysMonth +"일까지 있습니다");
		
		
	}
	
	public static void practice4() {
		// 키, 몸무게를 double로 입력 받고 BMI 지수를 계산하여 계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요
		// BMI = 몸무게 / (키(m) * 키(m))
		// BMI가 18.5미만일 경우 저체중, 18.5이상 23미만일 경우 정상체중, 
		// BMI가 23이상 25미만일 경우 과체중, 25이상 30미만일 경우 비만, 30이상일 경우 고도비만
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double tall = sc.nextDouble();
		System.out.print("몸무게를 입력해 주세요 : ");
		double weigth = sc.nextDouble();
		
		double BMI = weigth / (tall * tall);
		String result;
		if (BMI < 18.5) {
			System.out.println("BMI지수 : " + BMI);
			result = "저체중";
		} else if (BMI >=18.5 && BMI < 23) { // else if (BMI < 23)
			System.out.println("BMI지수 : " + BMI);
			result = "정상체중";
		} else if (BMI >=23 && BMI < 25) { // else if (BMI < 25)
			System.out.println("BMI지수 : " + BMI);
			result = "과체중";
		} else if (BMI >=25 && BMI < 30) { // else if (BMI < 30)
			System.out.println("BMI지수 : " + BMI);
			result = "비만";
		} else {
			System.out.println("BMI지수 : " + BMI);
			result = "고도 비만";
		}
		System.out.println(result);
	}
	
	public static void practice5() {
		// 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass Fail을 출력
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있음
		// 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 갑으로 계산
		// 70점 이상일 경우 pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수를 입력하세요 : ");
		int midSoc = sc.nextInt();
		double calMidSoc = (double) midSoc * 0.2;
		System.out.print("기말고사 점수를 입력하세요 : ");
		int finalSoc = sc.nextInt();
		double calFinalSoc = (double) finalSoc * 0.3;
		System.out.print("과제 점수를 입력하세요 : ");
		int homeworkSoc = sc.nextInt();
		double calHomeworkSoc = (double) homeworkSoc * 0.3;
		System.out.print("과제 점수를 입력하세요 : ");
		int attendSoc = sc.nextInt();
		double calAttendSoc = (double) attendSoc * 1.0;
		
		double totalSoc = calMidSoc + calFinalSoc + calHomeworkSoc + attendSoc;
		
		System.out.println("================= 결과 ===============");
		String socure;
		if (totalSoc >= 70 && calAttendSoc>20*0.7) {
			System.out.println("중간 고사 점수(20) : " + calMidSoc);
			System.out.println("기말 고사 점수(30) : " + calFinalSoc);
			System.out.println("과제 점수		(30) : " + calHomeworkSoc);
			System.out.println("출석 점수		(20) : " + calAttendSoc);
			System.out.println("총점 : " + totalSoc);
			socure = "PASS";
			//System.out.println("PASS");
			//resultPrint(calMidSoc, calFinalSoc, calHomeworkSoc, calAttendSoc, totalSoc, socure);
			
		} else if (totalSoc < 70 && calAttendSoc>20*0.7) {
			System.out.println("중간 고사 점수(20) : " + calMidSoc);
			System.out.println("기말 고사 점수(30) : " + calFinalSoc);
			System.out.println("과제 점수		(30) : " + calHomeworkSoc);
			System.out.println("출석 점수		(20) : " + calAttendSoc);
			System.out.println("총점 : " + totalSoc);
			socure = "Fail [점수미달]";
			//System.out.println("Fail [점수미달]");
		} /*else if (calAttendSoc<=20*0.7) {
			socure = "Fail [출석 횟수 부족 (" + attendSoc + "/20)]";
			//System.out.println("Fail [점수미달]");
		} */else {
			socure = "Fail [출석 횟수 부족 (" + attendSoc + "/20)]";
		}
		System.out.println(socure);
	}
	
	/*public static void resultPrint(MS, FS, HS, AS, TS, socure) {
		
	}*/

}
