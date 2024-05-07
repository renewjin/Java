package com.kh.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		// 순서대로 배열 인덱스를 넣은 후 그 값을 출력하세요
		int numbers [] = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i] + " ");
		}
	}
	
	public void practice2() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		// 연순으로 배열 인덱스를 넣은 후 그 값을 출력하세요
		int numbers [] = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			//numbers[i] = 10 - i;
			numbers[i] = numbers.length - i;
			System.out.print(numbers[i] + " ");
		}
	}
	
	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int number = sc.nextInt();
		
		int numbers [] = new int[number];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}	
	}
	
	public void practice4() {
		// 길이가 5인 String 배열을 선언하고 사과, 귤, 포도, 복숭아, 참외로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하세요
		/*
		String strs [] = new String[5];
		strs[0] = "사과";
		strs[1] = "귤";
		strs[2] = "포도";
		strs[3] = "복숭아";
		strs[4] = "참외";
		
		System.out.print(strs[1]);
		*/
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
		
	}
	
	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와
		// 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String word = sc.nextLine();
		System.out.print("문자 : ");
		char s = sc.next().charAt(0);
		
		System.out.println(word.length());
		String strs [] = new String[word.length()];
		
		for (int i = 0; i < word.length(); i++) {
			strs[i] = 
		}
	}
	
	public void practice6() {
		// 월 ~ 일 까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력시 잘못입력하셨습니다를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int inputNum = sc.nextInt();
		
		if(inputNum < 0 || inputNum > 6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		/*
		String days [] = new String[7];
		days[0] = "월요일";
		days[1] = "화요일";
		days[2] = "수요일";
		days[3] = "목요일";
		days[4] = "금요일";
		days[5] = "토요일";
		days[6] = "일요일";
		*/
		String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		/*
		for (int i = 0; i < days.length; i ++) {
			if(i==inputNum) {
				System.out.println(days[i]);
				break;
			}
		}
		*/
		System.out.println(days[inputNum]);
	}
	
	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		// 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int inputNum = sc.nextInt();
		
		int numbers [] = new int[inputNum];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			numbers[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			sum = sum + numbers[i];
		}
		System.out.print("\n");
		System.out.print("총 합 : " + sum);
	}
	
	public void practice8() {
		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 다시입력하세요 출력
		// 다시 정수를 받도록 하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int inputNum = sc.nextInt();
		while(true) {
			
			if(inputNum < 3 || inputNum%2==0) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				break;
			}
			System.out.print("정수 : ");
			inputNum = sc.nextInt();
		}
		
		int midNum = inputNum/2;
		System.out.println(midNum); // 3->1, 5->2 7->3
		
		int numbers [] = new int[inputNum];
		for (int i = 0; i < numbers.length; i++) { // 세부코드 수정필요
			if(i<=midNum) {
				numbers[i] = i+1;
			} else {
				numbers[i] = midNum-i +3;
			}
			System.out.print(numbers[i] + ", ");
		}
	}
	
	public void practice9() {
		// 길이가 7인 배열을 생성하고, 1 ~ 45 까지 랜덤한 숫자값을 넣어서 출력
		int numbers [] = new int[7];
		
		Random random = new Random();
		for(int i=0; i < numbers.length; i++) {
			int randomNumber = random.nextInt(46);
			numbers[i] = randomNumber;
			System.out.print(numbers[i] + " ");
		}	
	}
	
	public void practice10() {
		// 주민등록번호 송뵬저라 아휴뷰토 *로 가리고 출려갛세요
		// 단, 원본 배열 값은 변경없이 배열 복사본으로 변경하세요
		
	}
	
	public void practice11() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
		// 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화한 후 출력
		int numbers [] = new int[10];
		Random random = new Random();
		for(int i=0; i < numbers.length; i++) {
			int randomNumber = random.nextInt(11);
			numbers[i] = randomNumber;
			System.out.print(numbers[i] + " ");
		}	
	}
	
	public void practice12() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
		// 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력
		int numbers [] = new int[10];
		Random random = new Random();
		
		for(int i = 0; i < numbers.length; i++) {
			int randomNumber = random.nextInt(11);
			numbers[i] = randomNumber;
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		//int min = min(numbers);
		//int max = max(numbers);
		Arrays.sort(numbers);
		int min = numbers[0];
		int max = numbers[numbers.length -1];
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
	
	public void practice13() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
		// 1 ~ 10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화 후 출력
		int numbers [] = new int[10];
		Random random = new Random();
		
		int i = 0;
		//while (true) {
		while (i < numbers.length) {
			int a = 0;
			int randomNumber = random.nextInt(11);
			//System.out.println("randomNumber : " + randomNumber);
			for(int j = 0; j < numbers.length; j++) {
				if(randomNumber == numbers[j]) {
					// 난수가 리스트안에 있는 수와 비교했을 때 같은수가 있다면
					// for 루프 탈출 while 루프 처음으로 이동
					//System.out.println("randomNumber : " + randomNumber);
					//System.out.println("numbers[j] : " + numbers[j]);
					a = 1;
					break;
				} 
			}
			if (a != 1) {
				numbers[i] = randomNumber;
				//System.out.println("numbers[" +i+"] : " + numbers[i]);
				System.out.print(numbers[i] + " ");
				i += 1;
			}
			/*
			if (i >= numbers.length) {
				//System.out.println("end");
				break;
			}
			*/
		}	
		
	}
	
	public void practice14() {
		// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요
		//ArrayList<Integer> numbers = new ArrayList<>();
		int numbers [] = new int[6];
		Random random = new Random();
		int j = 0;
		while(true) {
			int a = 0;
			int randomNumber = random.nextInt(46);
			
			for (int i = 0; i < numbers.length; i++) {
				if(randomNumber == numbers[i]) {
					a=1;
					break;
				}
			}
			
			
			if (a != 1) {
				numbers[j] = randomNumber;
				j += 1;
			}
			
			if (j >= numbers.length) {
				break;
			}
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	public void practice15() {
		//문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력
	}
	
	public void practice16() {
		// 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당
		// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화
		// 사용자에게 배열에 값을 더 넣을지 물어보고 몇개를 더 입력할 건지 
		// 늘린 곳에 어떤 데이터를 넣을것인지 받기
		// 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력
	}
	
	public void practice17() {
		// 사용자가 입력한 값이 배열에 있는지 검색
		// 있으면, ooo 치킨배달 가능
		// 없으면 ooo 치킨은 없는 메뉴입니다 출력
		// 단, 치킨 메뉴가 들어가잇는 배열은 본인 스스로 정하세요
		
		String chickenMenu [] = {"양념치킨", "후라이드치킨", "간장치킨"}; 
		
		// 사용자로부터 치킨이름 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		// 배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		// for- each 문을 사용해서 치킨이 잇는지 확인하는 작업
		// 만약에 치킨이 존재한다면 found true; break;
		// 만약에 치킨이 존재한다면 배달 가능 출력
		// 존재하지 않는다면 oo 치킨은 없는 메뉴입니다 출력
		
		for(String 치킨 : chickenMenu) {
			System.out.println("치킨 : " + 치킨);
			System.out.println("inputChic : " + inputChic);
			if(치킨.equals(inputChic)) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println(inputChic + "배달 가능");
		} else {
			System.out.println(inputChic + "은 없는 메뉴입니다.");
		}
		
	}
	
}
