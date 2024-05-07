package com.kh.pratice;
//패키지 : 내가 만든 클래스가 들어있는 폴더 위치
import java.util.Scanner;

//클래스 : 실행하고자 하는 코드를 작성하는 공간
public class Operator {
	// 기본 출력 메서드
	// 최종 메서드에서 호출
	
	// 메인 메서드 : 최종으로 실행하는 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice8();
		//practice9();
		//practice10();
		practice11();
	}
	
	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수를 입력하세요 : ");
		int people = sc.nextInt();
		System.out.println("사탕 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		
		// 1인당 나눠줄 사탕 개수 계산
		int getCandies = candies / people;
		
		// 나눠주고 남은 사탕 개수
		int reMain = candies % people;
		
		// 결과 출력
		System.out.println("참여 인원 : " + people);
		System.out.println("사탕 총 개수 : " + candies);
		System.out.println("동일하게 나눠가진 캔디 개수 : " + getCandies);
		System.out.println("남은 캔디 개수 : " + reMain);
		
	}
	
	public static void practice2() {
		/*
		 이름 학년(숫자만), 반(숫자만), 번호(숫자만), 성별(M/F), 성적(소수점 아래 둘째 짜리까지)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		// 성별 입력 받기 String -> char
		// 스캐너로 char 값을 입력받고자 할 경우에는
		// charAt을 사용해서 문자열 위치를 읽어오는 작업을 진행해야 함
		// Scanner - next - charAt(숫자만 적음) 
		//							내가 보고자하는 숫자위치
		// charAt(0) : 맨 앞 글자를 보기
		// charAt(1) : 두번째 글자를 보기
		// charAt(2) : 세번째 글자를 보기
		System.out.print("성별(M/F) : ");
		//String gender = sc.next();
		//String gender = sc.nextLine();
		char gender = sc.next().charAt(0);
		
		// 성적 입력 받기 소수점 둘째 자리 까지만 입력받음
		System.out.print("성적 : ");
		double score = sc.nextDouble(); // 전체자리 입렵받음
		// 성별에 따라 출력 문자열 설정
		// 삼항 연산자 출력 문자열 설정
		
		// System.out.print("줄바꿈 없이 가로로 출력")
		//				println("다출력한 다음에 다음줄에서 작성하기 Enter")
		//				printf("서식이 지정된 문자열을 출력할 때 사용 
		//						%d : 정수
		//						%f : 소수점 수
		//						%s : 문자열 출력
		//						%c : 문자하나 출력
		//						%b : true인지 false 출력
		//						%x : 16진수 정수
		//						%o : 8진수 정수
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("성별 : " + gender);
		//System.out.println("성적 : " + score);
		// printf + ,
		// printf 로 %f를  출력할 때는 소수점 자리를 지정해줘도 되고 지정해주지 않아도 된다.
		// 다만, 만약에 소수점 자리 위치를 지정해서 출력하길 원한다면
		//예를들어 소수점 4번째 자리까지 출력하길 원함 : %.4f
		//예를들어 소수점 5번째 자리까지 출력하길 원함 : %.5f
		System.out.printf("성적 : %.2f", score);
		
	}
	
	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		// 변수의 형변환 할떄 미리 ()를 해서 처리해야 오류가 발생하지 않음 
		double average = (double) total / 3.0;
	}
	
	public static void practice4() {
		
		// 2개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true 아니면 false 출력
		Scanner sc = new Scanner(System.in);
		// 첫 번째 수 입력받기
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 == num2);
		
		boolean result = num1 == num2;
		System.out.println(result);
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세 번째 수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num1 == num3);
		System.out.println(result);
		System.out.println((num1 == num2) && (num1 == num3));
		// && : and
		// || : or
		boolean isOr = (num1 == num2) || (num1 == num3);
		System.out.println(isOr);
	}
	
	public static void practice8() {
		// 주민번호를 입려하여 남자, 여자 구분하기
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록 번호를 입력하세요 : ");
		String idNumber = sc.next();
		
		char genderCode = idNumber.charAt(7);
		
		if (genderCode == '1') {
			System.out.println("남자");
		} else if (genderCode == '2') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 주민번호입니다");
			return;
		}
	}
	
	public static void practice9() {
		// 정수 두개를 입력받아 각각 변수 num1, num2애 저장
		// 또 다른 정수를 입력받아 그 수가 num1 이하거나 num2 초과이면 true출력 아니면 false출력
		// 단, num1은 num2보다 작아야 함
		Scanner sc = new Scanner(System.in);
		System.out.print("num1의 값을 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("num2의 값을 입력해 주세요 (단, num1보다 큰값) : ");
		int num2 = sc.nextInt();
		
		if (num1>= num2) {
			System.out.println("num2의값이 num1보다 크지 않습니다");
			return;
		}
		
		System.out.print("num3의 값을 입력해 주세요 : ");
		int num3 = sc.nextInt();
		
		if (num3<=num1 || num3>num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	
	public static void practice10() {
		// 키보드로 무낮 하나를 입력받아 그 문자의 유니코드를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		
		char inputChar = sc.next().charAt(0);
		
		// 유닡코드 출력
		// 전 세계의 모든 글자나 문자를 ㄹ컴퓨터에서 일관되게 표현하기 위한 방식
		// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		int unicode = inputChar; // char 2byte int 8byte
		System.out.println("입력한 문자 " + inputChar + "의 유티코드의 문자 " + unicode);
		
	}
	
	public static void practice11() {
		// 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산과 형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f; // 기본값이 double 이기때문에 float으로 변경해주는 f붙여줌
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); // 2몫 2로 떨어진다면?
		System.out.println((int) dNum); //2
		// double 실수로 되어있는 것을 정수로 변경
		// double 8byte int 4byte 강제 형변환을 (int) 변경하겠다는 표시를 작성 후 시켜줄것
		System.out.println((double)iNum2 * dNum); //10.0
		// 작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double) 필수가 아님
		System.out.println((double) iNum1); //10.0
		System.out.println((double) iNum1 / iNum2); // 2.5; // 정수 -> 실수형
		System.out.println(dNum); // 2.5
		
		System.out.println((int) fNum); //3 // 실수형 -> 정수형
		System.out.println((int) (iNum1 / fNum)); //3 // 나누기를 해서 몫이 3
		// int와 float은 같은 크기의 byte 정수인지 실수인지 표기
		// float 기본으로 소수점 이하 6자리 까지만 보여줌 
		System.out.println((double) (iNum1 / fNum)); // 3.3333333
		
		System.out.println((double) iNum1 / fNum); // 3.333333333333333335
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(ch + iNum1); // 75
		// 'A' 값이 (int)ch를 통해 65
		// 큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨짐
		// 65 + (int iNum1 = 10) = 75
		System.out.println((char)(ch + iNum1)); //75 'K'
	}
	
	public static void practice12() {
		// A, B, C 사원의 연봉을 입력받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		// 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력
		// A사원 인센티브 0.4, b사원 인센티브 없음, C사원 인센티브 0.15
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		System.out.println("A사원 연봉/연봉+α :  ");
	}
}
