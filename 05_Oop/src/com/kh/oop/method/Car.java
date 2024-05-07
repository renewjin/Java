package com.kh.oop.method;

public class Car {
	// 필드
	public String brand;
	public String model;
	public int year;
	//public boolean isTrue;
	 
	// 생성자
	
	// 생성자  : 기본
	public Car() {
		
	}
	// 생성자  : 필수
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	// return 메서드
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	/*
	public boolean getTrue() {
		return isTrue;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Toyota", "Camry", 2022);
		
		System.out.println(car1.getBrand() + "  " + car1.getModel() + "  " + car1.getYear());

	}

}
