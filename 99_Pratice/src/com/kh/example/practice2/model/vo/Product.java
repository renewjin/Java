package com.kh.example.practice2.model.vo;

public class Product {
	// 필드
	private String pName;
	private int price;
	private String brand;
	
	// setter
	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// getter
	public String getpName() {
		return pName;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	//생성자 : 기본
	public Product() {
		
	}
	
	// 생성자 : 필수
	/*
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	*/
	
	/*
	public void information() {
		System.out.println("상품이름 : " + pName);
		System.out.println("상품가격 : " + price);
		System.out.println("상품브렌드 : " + brand);
	}
	*/
	public void information() {
		System.out.println("상품이름 : " + getpName());
		System.out.println("상품가격 : " + getPrice());
		System.out.println("상품브렌드 : " + getBrand());
	}
}
