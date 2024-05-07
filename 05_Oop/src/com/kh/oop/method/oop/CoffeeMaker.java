package com.kh.oop.method.oop;

public class CoffeeMaker {

	// 필드
	private String coffeeType; // 커피종류
	private int sugar; // 설탕양
	private boolean milk; // 우유 유무
	
	
	
	// setter
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	// getter
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
	// 생성자 기본
	public CoffeeMaker() {
		
	}
	
	// 생성자 필수 coffeeType, sugar, milk
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	// void
	public void info() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : " + coffeeType);
		System.out.println("설탕 : " + sugar + " g");
		if (milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
	}
	
	// main
	/*
	public static void main(String[] args) {
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		
		coffee1.info();
		
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인", 2, true);
		coffee2.info();
	}
	*/
}
