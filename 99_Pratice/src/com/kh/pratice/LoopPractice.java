package com.kh.pratice;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		practice12();
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
				System.out.println(constant);
				//constant+=1;
				constant++;
			}
		}
	}
	
	public static void practice2() {
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
			System.out.println(constant);
			//constant+=1;
			constant++;
		}
		
	}
	
	public static void practice3() {
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
				System.out.println(num);
				num-=1;
				//num--;
			}
		}
	}
	
	public static void practice4() {
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
			System.out.println(num);
			//num-=1;
			num--;
		}
	}
	
	public static void practice7() {
		
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
			System.out.print("연산자를 입력(+,-,*,/,%) : ");
			String operator = sc.next();
			System.out.print("숫자1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("숫자2 입력 : ");
			int num2 = sc.nextInt();
			
			double result =0;
			if (operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
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

}
