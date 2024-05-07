package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	// 기본 메서드
	
	//LoopForEx 에서 출력하길 원한다면
	// public static void gugudan 으로 static을 추가해준 다음에
	// public static void main(String[] args) {
	//	guguDan();
	// }
	// static을 붙이지 않고 출력하길 원한다면
	// 출력용 클래스를 만들어서 출력하기 LoopForRun
	public void guguDan() {
		// 사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신것을 환영합니다");
		// 구구단을 0을 입력하기 전까지 반복해서 출력하기
		while (true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 수를 입력해 주세요.");
			int dan = sc.nextInt();
			// 받은 수를 for 루프 이용해서 출력
			if (dan==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			for (int a = 1; a <= 9; a++) {
				System.out.println(dan*a);
		}
		
		}

	}
	
	public void guguDan2() {
		// 구구단 거꾸로 나타내기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신것을 환영합니다");
		// 구구단을 0을 입력하기 전까지 반복해서 출력하기
		while (true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 수를 입력해 주세요.");
			int dan = sc.nextInt();
			// 받은 수를 for 루프 이용해서 출력
			if (dan==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			for (int a = 9; a > 0; a--) {
				System.out.println(dan*a);
			}
		
		}
		
	}
	
	public void guguDan3() {
		// 구구단을 1단부터 9단까지 모두 출력
		
		// 1단부터 9단까지 출력
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println("***** " + dan + " *****");
			// 1단에서 부터 1~9를 곱해준 값을 출력
			
			for(int num = 1; num <= 9; num ++) {
				System.out.println(dan + "*" + num + " = " + (dan*num));
			}
			
		}
	}
	
	public void guguDan4() {
		// 구구단을 2단부터 9단까지 출력
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("***** " + dan + " *****");
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + (dan*num));
			}
				
		}
	}
	
	// 10개 숫자 출력하기 랜덤으로
	public void randomNumber() {
		// Random 불러와 내가 지정한 범위에서 숫자를 랜덤으로 출력하기
		// 지정 범위 1에서 1000 사이
		Random ran = new Random();
		//nextInt() 안에 숫자를 넣어서 어디서부터 어디사이에서 랜덤으로 숫자가 나와야하는지 점위를 지정할 수 있음
		//nextInt(4) : 0 ~ 3의 숫자가 나옴
		
		for (int i = 1; i <= 10; i++) {
			int ranNum = ran.nextInt(100) + 1; // ran.nextInt(100) -> 범위가 0에서 99 이지만 마지막에 +1을 붙어 1에서 100까지로 변경
			System.out.println(i + "번째 랜덤 숫자 : " + ranNum);
		}
	}
	
	public void randomNumber2() {
		// 랜덤으로 1 ~ 45 번호  6개 출력
		
		Random random = new Random();
		
		for (int i = 1; i <= 6; i++) {
			int ranNum = random.nextInt(45) + 1;
			System.out.println(i + "번째 번호 : " + ranNum);
			
		}
		
		
	}
	
	// 1부터 10까지의 숫자 중에서 홀수만 출력하기
	public void oddNum() {
		for (int num = 1; num <= 10; num++) {
			if (num%2 == 1) {
				System.out.println(num);
			}
		}
	}
	
	// 1부터 10까지의 숫자 중에서 짝수만 출력하기
	public void evenNum() {
		for (int num = 1; num <= 10; num++) {
			if (num%2 == 0) {
				System.out.println(num);
			}
		}
	}
	
	// 숫자를 맞출 때까지 계속 문제를 풀도록 하기
	// for 문으로 기회 2번 주기
	// if 문을 수정해서 숫자값이 정답보다 작으면 숫자가 작습니다. 반대로 크면 숫자가 큽니다.
	public void numberGame() {
		// 랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추는 게임
		Scanner sc = new Scanner(System.in);
		
		// 랜덤으로 숫자 만들기
		Random random = new Random();
		while(true) {
			int randomNumber = random.nextInt(3) +1; // 1~3
			//System.out.println("숫자를 맞춰보세요 : ");
			
			for (int i = 1; i < 3; i++) {
				System.out.println(i + "번째 기회입니다.");
				System.out.println("숫자를 맞춰보세요 : ");
				int guest = sc.nextInt();
				
				if (guest == randomNumber) {
					System.out.println("축하합니다.!! 숫자를 맞췄습니다");
					break;
				} else {
					System.out.println("숫자가 틀렸습니다.");
					//System.out.println("정답은 : " + randomNumber + " 입니다.");
					if (guest<randomNumber) {
						System.out.println(guest + "보다 큽니다");
					} else {
						System.out.println(guest + "보다 작습니다");
					}
					
				}
					
			}
			
			System.out.println("정답은 : " + randomNumber + " 입니다.");
			System.out.print("게임을 다시 시작하겠습니까? (1번 yes / 2번 no)");
			int playAgain = sc.nextInt();
			if (playAgain == 2) {
				System.out.println("게임을 종료합니다");
				return;
			} 
			
		}
			
			// 만약애 숫자를 맞췄다면 숫자를 맞췄습니다.
			
	}
		
}
	
	


