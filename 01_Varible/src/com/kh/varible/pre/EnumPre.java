package com.kh.varible.pre;

public class EnumPre {
// enum 무지개 {빨~보};
// 필드
	enum 무지개 {빨, 주, 노, 초, 파, 남, 보};
	
	// enum으로 소비자 {학생, 직장인, 연장자}
	// enum으로 판매자 {소매업, 도매업, 중매업}
	enum 소비자 {학생, 직장인, 연장자};
	enum 판매자 {소매업, 도매업, 중매업};
// 생성자 기본
	public EnumPre() {
		
	}

// 메서드 
	// void
	public void 메서드1() {
		System.out.println(무지개.빨);
		System.out.println(무지개.주);
		System.out.println(무지개.노);
		System.out.println(무지개.초);
		System.out.println(무지개.파);
		System.out.println(무지개.남);
		System.out.println(무지개.보);
		
		// 한번에 출력방법
		// 장바구니 = 배열에 담기
		//				values() : enum 밑에 있는 메서드
		무지개[] 배열 = 무지개.values(); // enum으로 작성한 값을 가지고옴
		// for-each
		for(무지개 무 : 배열) {
			System.out.println(무);
		}
	}
	
	// void 메서드2를 만들어서 소비자와 판매자를 for-each 사용해서 각각 출력
	// 소비자 학생   판매자 소매업 ordinal() if문 사용해서 비교하는 문장을 메서드 2작성
	public void 메서드2() {
		소비자 [] 소비자들 = 소비자.values();
		판매자 [] 판매자들 = 판매자.values();
		for(소비자 a : 소비자들) {
			System.out.println("소비자 enum 상수 : " + a);
		}
		
		for (판매자 b : 판매자들) {
			System.out.println("판매자 enum 상수 : " + b);
		}
		
		/*
		소비자 소비자상수 = 소비자.valueOf("학생");
		판매자 판매자상수 = 판매자.valueOf("소매업");
		if(소비자상수.ordinal() == 판매자상수.ordinal()) {
			System.out.println("소비자 enum에 있는 학생 인덱스와 판매자 enum에 있는 소매업의 인덱스가 일치합니다");
		} else {
			System.out.println("소비자 enum에 있는 학생 인덱스와 판매자 enum에 있는 소매업의 인덱스가 불일치합니다");
		}
		*/
		소비자 c = 소비자.학생;
		판매자 s = 판매자.소매업;
		
		if(c.ordinal()>s.ordinal()) {
			System.out.println("학생등급이 소매업 등급보다 높습니다");
		} else if (c.ordinal()<s.ordinal()) {
			System.out.println("학생등급이 소매업 등급보다 낮습니다");
		} else {
			System.out.println("등급이 같습니다");
		}
	}
	
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		//ep.메서드1();
		ep.메서드2();
	}
}
