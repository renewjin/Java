package com.kh.practice.book.model.vo;

import java.util.Calendar;

public class Book {
// 필드
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;

// 메서드
	// 생성자 : 기본
	public Book() {
	}
	
	// 생성자 : 필수
	public Book(String title, String author, int price, Calendar date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	// getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public Calendar getDate() {
		return date;
	}

	public double getDiscount() {
		return discount;
	}
	
	public String toString() {
		return "도서명 : " + title + ", 저자 : " + author + ", 가격 : " + price + 
				", 출판일 : " + date + ", 할인율 : " + discount;
	}
	
	

}
