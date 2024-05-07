package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
// 메서드
	// 생성자 :  기본
	public ArrayPre() {
		
	}
	
	// void
	public void practice1() {
		// 배열을 사용해서 전체 합 구하기
		// 배열을 사용할 때 제일 먼저 숫자인지 문자열인지 실수인지 구분을 해준후 [] 표시 작성
		//int [] num = new int[5]; // 리스트 안에 들어갈 개수만 정했을 때
		int [] num = {1, 2, 3, 4, 5}; // 리스트 안에 들어갈 항목들이 정해져있을 때
		
		int sum = 0;
		
		// for-each 문 처음부터 끝까지 반복해서 무언가를 진행할 때 사용
		// for (형식 사용할 변수명 : 사용하는 리스트)
		for (int number: num) {
			//sum = sum + number;
			sum += number;
		}
		System.out.println("리스트의 숫자들의 합 : " + sum);
	}
	
	public void practice2() {
		// ArrayList 사용해서 물건 추가하기
		// ArrayList 는 크기 제한이 없음
		// 						new ArrayList<>()는 <>안에 String을 넣어도 되고 안넣어도 됨
		ArrayList<String> goods = new ArrayList<>();
		// .add 리스트 항목 추가
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("TV");
		goods.add("에어컨");
		
		// 모두 보기 2가지
		System.out.println(goods);
		
		// for-each 문 활용
		for(String 상품 : goods) {
			System.out.print(상품 + " ");
		}
	}
	
	public void practice3() {
		// 배열을 사용해서 최대값 찾기
		int [] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0];
		
		for(int num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최대값 : " + max);
	}
	
	public void practice4() {
		// 찾음 못찾음
		// 과일 사과 바나나 딸기 오렌지
		String [] fruits = {"사과", "바나나", "딸기", "오렌지"};
		
		String search = "바나나";
		boolean found = false;
		
		for(String 과일 : fruits) {
			if(과일.equals(search)) {
				found = true;
				break;
			}
		}
		
		/*
		if(found) {
			System.out.println("바나나를 찾았습니다~~");
		} else {
			System.out.println("바나나가 없습니다");
		}
		*/
		System.out.println(search + " 찾음? " + (found ? " 찾음":" 못찾음"));
	}
	
	public void practice5() {
		// 스캐너 동물을 입력하고 배열에 동물이 있는지 확인할 것
		// String zoo = {"코끼리", "원숭이", "푸바오", "토끼", "공작"};
		Scanner sc = new Scanner(System.in);
		String [] zoo = {"코끼리", "원숭이", "푸바오", "토끼", "공작"};
		
		System.out.print("동물을 입력해 주세요 : ");
		String search = sc.next();
		boolean found = false;
		
		for(String 동물 : zoo) {
			if(동물.equals(search)) {
				found = true;
				break;
			}
		}
		
		System.out.println(search + "(이)가 있습니까? " + (found ? "있어" : "아니 없어요"));
		
	}
}
