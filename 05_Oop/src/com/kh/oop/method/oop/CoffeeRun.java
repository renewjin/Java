package com.kh.oop.method.oop;

public class CoffeeRun {

	public static void main(String[] args) {
		// 커피 제조하기
		CoffeeMaker cm = new CoffeeMaker("아메리카노", 1, false);
		
		// 커피 가게작성
		CoffeeStore cs = new CoffeeStore(cm, "커피빈", "서울시 강남구");
		
		// 주문 및 제조
		cs.orderCoffee();
	}

}
