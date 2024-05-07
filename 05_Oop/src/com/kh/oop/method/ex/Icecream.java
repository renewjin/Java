package com.kh.oop.method.ex;

public class Icecream {

	// 필드
	private String name;
	private int suger;
	private boolean milk;
	
	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSuger(int suger) {
		this.suger = suger;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getSuger() {
		return suger;
	}

	public boolean isMilk() {
		return milk;
	}

	// 생성자 : 기본
	public Icecream() {
		
	}
	
	// 생성자 : 필수 이름 설탕 우유 유무
	public Icecream(String name, int suger, boolean milk) {
		this.name = name;
		this.suger = suger;
		this.milk = milk;
	}
	
	// void make Icecream() { 아이스크림 만들고 이름 설탕 우유 유무 출력
	// 우유 유 -> 우유 추가
	// 우유 무 -> 우유 미추가
	public void makeIcecream() {
		System.out.println("종류 : " + name);
		System.out.println("설탕 : " + suger + " g");
		if (milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
	}
	
	
	// IcecreamRun -> 메인 메서드 실행
}
