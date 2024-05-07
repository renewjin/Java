package com.kh.pratice;

import java.util.Scanner;

public class ControllPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice_1();
		//practice_2();
		//practice_5();
		practice_10();
	}
	
	public static void practice_1() {
		//메뉴를 출력하고 메뉴 번호를 누르면 ○○메뉴입니다 를 
		// 종료 번호를 누르면 "프로그램이 종료 됩니다."를 출력하세요
		Scanner sc  = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		String menu; 
		switch (num) {
			case 1:
				menu = "입력";
				break;
			case 2:
				menu = "수정";
				break;
			case 3:
				menu = "조회";
				break;
			case 4:
				menu = "삭제";
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다");
				return;
			default:
				System.out.println("해당하는 메뉴는 없습니다");
				return;
		}
		System.out.println(menu + " 메뉴입니다");
		
		
	}
	
	public static void practice_2() {
		// 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 짝수다를 출력하고
		// 짝수가 아니면 홀수다를 출력하세요
		// 양수가 아니면 양수만 입력해주세요를 출력하세요
		Scanner sc  = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해 주세요");
		}
	}
	
	public static void practice_3() {
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
	
	public static void practice_4() {
		// switch 문을 사용하여 입력받은 1 ~ 12 사이의 정수를 입력하여 봄, 여름, 가을, 겨울을 출력하세요
		Scanner sc  = new Scanner(System.in);
		System.out.print("1~12 사이의 월을 입력하세요 : ");
		int month = sc.nextInt();
		String season;
		switch (month) {
			case 1 : case 2 : case 12 :
				season = "겨울";
				break;
			case 3 : case 4 : case 5 :
				season = "봄";
				break;
			case 6 : case 7 : case 8 :
				season = "여름";
				break;
			case 9 : case 10 : case 11 :
				season = "가을";
				break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다");
				return;
		}
		System.out.println(month + "월은 " + season + "입니다");
	}
	
	public static void practice_5() {
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요
		// 로그인 성공 시 "로그인 성공"
		// 아이디가 틀렷을 시 "아이디가 틀렸습니다"
		// 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다"를 출력하세요
		Scanner sc  = new Scanner(System.in);
		
		String userID = "myId";
		String userPW = "myPassword12";
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		
		if (userID.equals(id) && userPW.equals(password)) {
			System.out.println("로그인 성공");
		} else if (userID.equals(id)) {
			System.out.println("비밀번호가 틀렸습니다");
		} else if (userPW.equals(password)) {
			System.out.println("아이디가 틀렸습니다");
		} // ! 특정 조건을 부정하는데 사용 
			// userPW.equals(password) : 일치하면 참
			// !userPW.equals(password) : 일치하지 않으면 참
			// else if (!userPW.equals(password))
	}
	
	public static void practice_6() {
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력
		// 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 뎃극 작성이 가능하고
		// 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능
		// 비회원은 게시글 조히만 가능
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급을 입력하세요 (관리자, 회원, 비회원)");
		
		// 권한이나 규칙을 설정할 때 자주 사용하는 변수명 : Role
		String userRole = sc.next();
		System.out.println("해당 회원 권한 등급");
		switch (userRole) {
			case "관리자":
				System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 장성, 게시글 조회");
			case "회원":
				System.out.println("게시글 작성\n"
						+ "게시글 조회\n"
						+ "댓글 작성");
			case "비회원":
				System.out.println("게시글 조회");
			default:
				System.out.println("해당등급은 존재하지 않습니다.");
		}
	}
	
	public static void practice_7() {
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
	
	public static void practice_8() {
		// 키보드로 두 개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰 연산 결과를 출력하세요
		// 두개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력 했을 시 "잘못 입력하셨습니다. 프로그램을 종료합니다" 출력
		Scanner sc  = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.next();
		
		if (num1 > 0 && num2 >0) {
			int result;
			double result_1;
			switch (operator) {
				case "+":
					result = num1 + num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				case "-":
					result = num1 - num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				case "*":
					result = num1 * num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				case "/":
					result_1  = (double) num1 / num2;
					System.out.println(num1 + operator + num2 + "=" + result_1);
					break;
				case "%":
					result = num1 % num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
					return;
			}
			
		} else {
			System.out.println("양의수만 입력하세요");
		}
		
	}
	
	public static void practice_9() {
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
	
	public static void practice_10() {
		// 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요
		Scanner sc  = new Scanner(System.in);
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 (숫자만 입력) : ");
		int num = sc.nextInt();
		
		switch (num) {
			case 1:
				practice_1();
				break;
			case 2:
				practice_2();
				break;
			case 3:
				practice_3();
				break;
			case 4:
				practice_4();
				break;
			case 5:
				practice_5();
				break;
			case 6:
				practice_6();
				break;
			case 7:
				practice_7();
				break;
			case 8:
				practice_8();
				break;
			case 9:
				practice_9();
				break;
			default:
				System.out.println("입력번호가 잘못되었습니다.");
		}
			
	}
	
	public static void practice_11() {
		// 정수를 이용해서 4자리 비밀번호를 만들려고 하는데
		// 이때 4자리 정수를 입력받아 각 자리 수에 중복되는 값이 없을 경우 '생성 성공'
		// 중복 값이 있으면 '중복값 있음'
		// 자리수가 안 맞으면 '자리 수 안 맞음' 출력
		// 단 제일 앞자리 수의 값은 1~9 사이 정수
		Scanner sc  = new Scanner(System.in);
		
		while(true) {
			System.out.print("비밀번호 입력(1000~9999) : ");
			int passWord = sc.nextInt(); 
			
			if (passWord<1000 || passWord>9999) {
				System.out.println("자리수 안맞음");
				continue;
			}
			
			// 자리값
			int = [] digits = new int[4]; // 4자리만 허용 0 ~3
			digits[0] = passWord / 1000 // 천의자리
			digits[1] = (passWord / 100) % 10 // 백의자리
			digits[2] = (passWord / 10) % 10 // 십의자리
			digits[3] = passWord % 10 // 일의자리
			
			// 중복 여부
			boolean isTrue = true;
			for (int i = 0; i < digits.length; i++) {
				for (int j = i + 1; j < digits.length; j++) {
					if (digits[i] == digits[j]) {
						isTrue = true;
						break;
					}
				}
				
				if(!isTrue) {
					break
				}
				// 중복 여부에 따른 메시지 출력
				if(!isTrue) {
					System.out.println("중복값이 있음");
				} else {
					System.out.println("비밀번호 생성 성공");
					break;
				}
			}
		}
		
		
	}

}
