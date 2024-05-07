package com.kh.oop.method.oop;

public class DrinkMaker {
	// 필드
	private String drinkType;
	private int quantity;
	private int temp;

	public String getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	// 생성자 : 기본
	public DrinkMaker() {
		
	}
	
	// 생성자 : 필수 음료종류 양 온도
	public DrinkMaker(String drinkType, int quantity, int temp) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	
	// void makeDrink
		// 음료종류, 음료양
	
		// if 온도 (<5) 차갑게
		// else if 온도 (5 ~ 10) 미지근하게
		// else 뜨겁게
	public void makeDrink() {
		System.out.println("음료 종류 : " + drinkType);
		System.out.println("음료 양 : " + quantity);
		if (temp < 5) {
			System.out.println("음료의 온도는 차갑게");
		} else if (5 <= temp && temp <= 10) {
			System.out.println("음료의 온도는 미지근하게");
		} else {
			System.out.println("음료의 온도는 뜨겁게");
		}
		
		System.out.println("음료 제조 완료");
	}
	
	// 음료제조 완료 출력
	
	
	
	
}
