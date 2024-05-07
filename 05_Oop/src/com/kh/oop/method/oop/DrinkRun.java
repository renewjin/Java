package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		// 
		DrinkMaker dm = new DrinkMaker();
		dm.setDrinkType("딸기 스무디");
		dm.setQuantity(2);
		dm.setTemp(2);
		
		//DrinkStore ds = new DrinkStore(dm, "KH", "서울", true);
		DrinkStore ds = new DrinkStore();
		ds.setMaker(dm);
		ds.setName("KH");
		ds.setLocation("서울");
		ds.setTakeout(true);

		ds.orderDrink();
	}

}
