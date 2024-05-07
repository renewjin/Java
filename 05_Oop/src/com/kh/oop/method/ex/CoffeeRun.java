package com.kh.oop.method.ex;

public class CoffeeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMaker coffee1 = new CoffeeMaker();
		
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.info();
		System.out.println("----------------");
		
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인", 3, true);
		coffee2.info();
	}

}
