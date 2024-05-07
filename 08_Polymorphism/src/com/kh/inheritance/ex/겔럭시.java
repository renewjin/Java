package com.kh.inheritance.ex;

// extends 스마트폰 상속받기
public class 겔럭시 extends 스마트폰{
// 필드
	private int 안드로이드;

	// setter
	public void set안드로이드(int 안드로이드) {
		this.안드로이드 = 안드로이드;
	}

	// getter
	public int get안드로이드() {
		return 안드로이드;
	}
	
	// 생성자 : 기본 ctrl + space enter
	public 겔럭시() {
		
	}
	
	// 생성자 : 필수 alt + shift + s -> o
	public 겔럭시(int 안드로이드) {
		super();
		this.안드로이드 = 안드로이드;
	}

	@Override
	public String toString() {
		return "겔럭시 버전 : " + 안드로이드 + " / " + super.toString();
	}
	
	// void, return alt + shift + s s
	/*
	@Override
	public String toString() {
		return "겔럭시 버전 : " + 안드로이드 + " / " + super.toString();
	}
	*/
	
}
