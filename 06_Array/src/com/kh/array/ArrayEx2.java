package com.kh.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// for 문을 활용한 배열 출력하기
		int numbers [] = new int [5];
		// 1부터 4까지 배열에 숫자를 넣기
		// length
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] : " + numbers[i]);
		}
		
		method1();
	}
	
	public static void method1() {
		// 정수 0 1 2 10 20 30 출력하기
		int num [] = new int[3];
		for(int i = 0; i < num.length; i++) {
			num[i] = (i+1) * 10;
			System.out.println("num[" + i +"] : " + num[i]);
		}
		
		// String
		// 문자열 각 자리에 월화수목금토일 각 자리에 어떤 요일이 들어가 잇는지 출력
		String str [] = {"월", "화", "수", "목", "금", "토", "일"};
		for(int i = 0; i < str.length; i++) {
			System.out.println("str[" + i +"] : " + str[i]);
		}
		
		// 실수 index 2까지 만들어주고 출력 실수 자유
		double db1 [] = new double[3];
		db1[0] = 3.14;
		db1[1] = 57.612;
		db1[2] = 8.070;
		
		for (int i = 0; i < db1.length; i++) {
			System.out.println("db1[" + i +"] : " + db1[i]);
		}
		
		// 문자 A B C 넣어준 다음 각 자리 출력해보기
		/*
		char chr [] = new char[3];
		chr[0] = 'A';
		chr[1] = 'B';
		chr[2] = 'C';
		*/
		char chr[] = {'A', 'B', 'C'};
		for (int i = 0; i < chr.length; i++) {
			System.out.println("chr[" + i +"] : " + chr[i]);
		}
	}
}
