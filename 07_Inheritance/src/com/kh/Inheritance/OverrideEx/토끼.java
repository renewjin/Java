package com.kh.Inheritance.OverrideEx;

public class 토끼 extends 동물{
// 메서드
	// 생성자 : 필수
	public 토끼(String 이름) {
		super(이름);
	}
	
	public void 소리() {
		System.out.println(이름 + "이(가) 낑낑 소리를 냅니다.");
	}
}
