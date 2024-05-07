package com.kh.oop.method.ex;

public class IcecreamRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream ice = new Icecream();
		ice.setName("메로나");
		ice.setSuger(2);
		ice.setMilk(true);
		
		ice.makeIcecream();
		
		Icecream ice1 = new Icecream("월드콘", 3, false);
		ice1.makeIcecream();
	}

}
