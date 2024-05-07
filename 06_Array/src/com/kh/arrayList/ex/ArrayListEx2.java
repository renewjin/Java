package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	// 기본 생성자
	public ArrayListEx2() {
		
	}
	
	public void method1() {
		// 딸기 바나나 사과
		ArrayList<String> list = new ArrayList<>();
		
		// add를 사용해서 딸기 바나나 사과 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		// get 0 1 2 사용해서 각 index 자리에 값 출력하기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// set 바나나 -> 키위 수정
		list.set(1, "키위");
		System.out.println(list.get(1));
		
		// size를 이용해서 크기 확인
		System.out.println(list.size());
		
		// remove 키위 삭제
		list.remove(1);
		System.out.println(list.get(1));
		
		// isEmpt() 비어있는지 확인
		System.out.println(list.isEmpty());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//	내가 만든 변수명 : list변수명
		for (String 과일 : list) {
			System.out.println(과일);
		}
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		// add 사자 호랑이 고양이 강아지
		// 한줄 붙여넣기 ctrl + alt + ↓
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		// size() 동물이 몇마리 있는지 확인
		System.out.println(animal.size());
		
		// get 으로 동물 확인
		System.out.println(animal.get(0));
		System.out.println(animal.get(1));
		System.out.println(animal.get(2));
		System.out.println(animal.get(3));
		
		// set 고양이 -> 토기로 변경
		animal.set(2, "토끼");
		
		// remove 강아지 삭제
		//animal.remove(3);
		animal.remove("강아지");
		
		
		// for문을 활용해서 get 출력
		for(String 동물: animal) {
			System.out.println(동물);
		}
		
		// clear 사용해서 모두 삭제
		animal.clear();
		
		// isEmpty 확인
		System.out.println(animal.isEmpty());
	}
	
	public void method3() {
		// 피자가게
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("===피자메뉴===");
		// add 고구마 포테이토 페페로니
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페페로니");
		
		// get을 활용해서 출력
		for(int i = 0; i < pizza.size(); i++) {
			System.out.println(pizza.get(i));
		}
		
		// 모두보기
		System.out.println("모든 메뉴 보기 : " + pizza);
		
		// set 활용해서 페페로니 -> 파인애플
		pizza.set(2, "파인애플");
		
		// remove 파인애플
		pizza.remove("파인애플");
		
		// for 문 활용해서 출력
		for (String 메뉴:pizza) {
			System.out.println(메뉴);
		}
		
		System.out.println("피자가게가 사라질 예정입니다.");
		
		// 메뉴모두 삭제 clear()
		pizza.clear();
		// 메뉴 모두 삭제되었는지 확인 isEmpty()
		System.out.println(pizza.isEmpty());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		ae.method3();

	}

}
