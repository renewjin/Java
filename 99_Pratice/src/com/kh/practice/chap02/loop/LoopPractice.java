package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void Geeting() {
		System.out.println("안녕하세요.");
	}
	
	public void Geeting2() {
		System.out.println("반갑습니다.");
	}
	
	public static void practice1() {
		// 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요
		// 단 입력한 수는 1볻아 크거나 같아야함
		// 만일 1 미만의 숫자가 입력됏다면 1이상의 숫자를 입력해주세요를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if (num<1) {
			System.out.print("1이상의 숫자를 입력해주세요.");
		} else {
			int constant = 1;
			while (constant<=num) {
				System.out.print(constant + " ");
				//constant+=1;
				constant++;
			}
		}
	}
	
	public void practice2() {
		// 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요
		// 단 입력한 수는 1보다 크거나 같아야함
		// 만일 1 미만의 숫자가 입력됏다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		while (num<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 :");
			num = sc.nextInt();
		}
		
		int constant = 1;
		while (constant<=num) {
			System.out.print(constant + " ");
			constant+=1;
			//constant++;
		}
	}
	
	public void practice3() {
		// 사용자로부터 한개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요
		// 단 입력한 수는 1보다 크거나 같아야합니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if (num<1) {
			System.out.print("1이상의 숫자를 입력해주세요.");
		} else {
			int constant = 1;
			while (constant<=num) {
				System.out.print(num + " ");
				num-=1;
				//num--;
			}
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		while (num<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 :");
			num = sc.nextInt();
		}
		
		int constant = 1;
		while (constant<=num) {
			System.out.print(num + " ");
			//num-=1;
			num--;
		}
	}
	
	// do-while : 조건이 참이 아니어도 무조건 최초 1회는 실행
	public void practice4_1() {
		Scanner sc = new Scanner(System.in);
		
		int num; // practice4_1 안에서 어디에서든 num을 알 수 있도록 바깥으로 호출해줌
		do {
			System.out.print("숫자를 입력하세요 :");
			num = sc.nextInt();
			
			// 1미만의 숫자가 들어오면
			if(num<1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			// 조건에 관계없이 do로 인해 무조건 1회 실행되는 것이기 때문에 return이나 break를 장성해주지 않아도 될 경우가 많음
			}
		} while(num>1);
		
		// 만약에 1보다 커서 밑으로 내려온다면
		// num 부터 1까지 거꾸로 출력해주는 for문 작성해 주기
		for (int i = num; i >=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		int result = 0;
		for (int i = 1 ; i <= num ; i++) {
			result += i;
			if (i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(result);
	}
	
	public void practice6() {
		// 사용자로부터 두개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
		// 만일 1미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해 주세요"를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 :");
		int num2 = sc.nextInt();
		
		if (num1<1 || num2<1) {
			System.out.print("1이상의 숫자를 입력하세요 :");
			return;
		}
		
		if (num1<num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + "\t");
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + "\t");
			}
		}
	}
	
	public void practice7() {
		// 사용자로부터 두개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
		// 만일 1미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해 주세요"를 출력되면서 다시 사용자가 값을 입력하도록 설정
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램을 종료하고 싶다면 입력하는 수를 같은 값으로 넣으세요");
			System.out.print("첫번째 숫자를 입력하세요 :");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 :");
			int num2 = sc.nextInt();
			
			if (num1 == num2) {
				System.out.print("프로그램이 종료됩니다");
				break;
			}
			
			if (num1<1 || num2<1) {
				System.out.println("1이상의 숫자를 입력하세요.");
				continue;
			}
			
			if (num1<num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + "\t");
				}
			} else {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + "\t");
				}
				System.out.print("\n");
			}
		}
	}
	
	public void practice7_1() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("프로그램을 종료하고 싶다면 입력하는 수를 같은 값으로 넣으세요");
			System.out.print("첫번째 숫자를 입력하세요 :");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 :");
			int num2 = sc.nextInt();
			
			if (num1 == num2) {
				System.out.print("프로그램이 종료됩니다");
				break;
			}
			
			if (num1<1 || num2<1) {
				System.out.println("1이상의 숫자를 입력하세요.");
				continue;
			}
			
			int min = Math.min(num1, num2); // 최대값 구하기
			int max = Math.max(num1, num2); // 최소값 구하기
			
			for (int i = min; i <= max; i++) {
				System.out.print(i + "\t");
			}
			
			System.out.print("\n");
		}
	}
	
	public static void practice11() {
		//사용자로부터 시작 숫자와 공차를 입력받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요
		// 단, 출력되는 숫자는 총 10개 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int stepNum = sc.nextInt();
		int result = startNum;
		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				System.out.println(result);
			} else {
				result += stepNum;
				System.out.println(result);
			}
		}
		
	}
	
	public static void practice12() {
		// 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요
		// 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복
		// exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료
		// 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력
		// 없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력
		// 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할 것");
			System.out.print("연산자를 입력(+,-,*,/,%) : ");
			String operator = sc.next();
			
			
			double result =0;
			if (operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.print("숫자1 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("숫자2 입력 : ");
				int num2 = sc.nextInt();
				
				switch (operator) {
				case "+" :
					result = num1 + num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				case "-" :
					result = num1 - num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				case "*" :
					result = num1 * num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				case "/" :
					if (num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						break;
					} 
					result = num1 / num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
				case "%" :
					if (num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						break;
					} 
					result = num1 % num2;
					System.out.println(num1 + operator + num2 + "=" + result);
					break;
					
				default:
					System.out.println("없는 연산자입니다. 다시입력해주세요");
				}
			}
			
		}
	}
	
	public static void practice12_1() {
		Scanner sc = new Scanner(System.in);
		
		String operator;
		
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할 것");
			System.out.print("연산자를 입력(+,-,*,/,%) : ");
			
			operator = sc.next();
			
			if (operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("숫자1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("숫자2 입력 : ");
			int num2 = sc.nextInt();
			
			int result;
			
			// switch case "+"
			if (operator.equals("+")) {
				result = num1 + num2;
			} else if (operator.equals("-")) {
				result = num1 - num2;
			} else if (operator.equals("*")) {
				result = num1 * num2;
			} else if (operator.equals("/")) {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue; // 해당 조건만 건너뛰고 루프를 계속 돔, 반면 break는 루프를 빠져나감
				}
				result = num1 / num2;
			} else if (operator.equals("%")) {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 % num2;
				
			} else {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			System.out.println(num1 + operator + num2 + "=" + result);
		}
		
	}
	
	public static void practice13() {
		/*
		 정수 입력 : 4
			*
			**
			***
			****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice14() {
		/*
		 정수 입력 : 4
			****
			***
			**
			*
		를 구현하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice15() {
		/*
		 정수 입력 : 4
			****
			 ***
			  **
			   *
		를 구현하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = num; k > i; k--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
