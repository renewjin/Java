package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	// TODO Auto-generated method stub
	/*
	 while(조건식) : 끝이 확실하지 않는 반복에 사용
	 
	 while (조건식이 참일경우) {
	 	
	 	조건식이 참일 경우에 실행
	 	
	 }
	 조건식이 거짓일 경우에 실행 종료
	 
	 예제 코드 1:
	 	while(true) {
	 		System.out.println("무한반복");
	 	}
	 
	 예제 코드 2:
	 	while(false) {
	 		System.out.println("실행하지 못하고 종료");
	 	}
	 	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inLoop();
		//whileLoop();
		whileLoopEx();
		
	}
	
	public static void inLoop() {
		
		
		while(true) {
			System.out.println("print 10번");
		}
	}
	
	public static void whileLoop() {
		// 조건이 참일 때 실행할 코드
		int i = 0;
		
		while(true) {
			System.out.println("i :" + i);
			i +=1;
			if (i == 10) {
				break;
			}
		}
	}
	
	public static void whileLoopEx() {
		// 스캐너 활용해서 키보드 값 입력 받기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 실행 2. 종료");
			System.out.println("원하는 숫자를 입력하세요 :");
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("프로그램을 실행합니다");
					break;
				case 2:
					System.out.println("프로그램을 종료합니다");
					//break;
					return;
					// break와 return 모두 case를 탈출하는 구문이기 때문에
					// 같이 사용할 수 없음
					// break의 경우에는 while이 true일 때 종료되지 않고 계속 반복
					// return의 경우 while이 true여도 while 코드를 탈출할수 있음.
				default:
					System.out.println("잘못된 번호입니다 다시입력해주세요");
			}
		}
		
		
	}

}
