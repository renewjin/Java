package com.kh.array;
/*
 배열 (자료구조)
 	같은 자료형의 변수를 하나의 묶음으로 다루는 것
 	생성된 배열은 index를 이용해서 구분
 	index : 시작 숫자 (0) 마지막숫자 (마지막숫자 -1);
 	
 	생성된 배열을 활용하기 위해서는 배열을 참조하는 참조형 변수 이용
 	[참조형 변수] - 주소를 저장하는 변수
 	
 	- 소문자로 시작하는 자료형(int double 등) 제외한 나머지는 모두 잠조형 변수
 	- 대표적인 참조형 변수 : String
 	
 	// 배열의 선언과 생성 방법
 	 정수 배열
 	 int[] numbers = new int[5]'
 	 numbers 에는 숫자 5개를 넣을 수 있는 공간이 생성
 */

public class ArrayEx1 {

	public static void main(String[] args) {
		// 숫자 배열 선언 생성
		int[] numbers = new int[5];
		// int 5 라고 하는 것은
		// index : 0, 1, 2, 3, 4
		
		System.out.println(numbers);
		System.out.println(numbers[0]); // 리스트 선언만 하고 안에 값을 넣지 않았기 때문에 초기값은 모두 0
		
		numbers[0] = 10;
		System.out.println(numbers[0]);
		
		// 0 ~ 4 까지 자리에 10 20 30 40 50 
		for (int i = 0 ; i <=4; i ++) {
			numbers[i] = 10 * (i+1);
			System.out.println(numbers[i]);
		}
		
		System.out.println(numbers);
		
		// 
		String[] str = new String[7];
		
		str[0] = "월";
		str[1] = "화";
		str[2] = "수";
		str[3] = "목";
		str[4] = "금";
		str[5] = "토";
		str[6] = "일";
		for (int i = 0; i < 7; i++) {
			System.out.println(str[i]);
		}

	}

}
