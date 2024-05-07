package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		//Product product1 = new Product("겔럭시", 10000, "삼성");
		//product1.information();
		
		// Product 객체생성
		Product product1 = new Product();
		
		product1.setpName("겔럭시");
		product1.setPrice(10000);
		product1.setBrand("삼성");
		
		product1.information();
		
	}

}
