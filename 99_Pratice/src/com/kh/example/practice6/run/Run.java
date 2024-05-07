package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("kh서점에 오신 것을 환영합니다");
		
		// book1 책정보 입력 후 출력
		Book book1 = new Book();
		book1.title = "그것이 알고싶다";
		book1.publisher = "SBS";
		book1.author = "박진아";
		book1.inform();
		
		// book2 책정보 필수생성자에서 String title, String publisher, String author 출력
		Book book2 = new Book("5월 32일", "kh T반", "단체일동");
		book2.inform();
		
		// book3 모두 입력되어 있는 필수 생성자 이용해서 출력
		Book book3 = new Book("Do it! 자바 프로그램 입문", "이지스퍼블리싱", "박은종", 16500, 0.34);
		book3.inform();
	}

}
