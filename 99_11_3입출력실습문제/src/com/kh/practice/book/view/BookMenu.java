package com.kh.practice.book.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	ArrayList<Book> list = new ArrayList<>();
	
	public BookMenu() {
	}
	
	public void mainMenu() {
		while (true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴번호 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				// 도서 추가 저장
				fileSave();
				break;
			case 2:
				// 저장 도서 출력
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력 번호 입니다.");
			}
		}
		
	}
	
	// 도서 추가 저장
	public void fileSave() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("도서가격 : ");
		int price = sc.nextInt();
		System.out.print("출판날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		date.split("-");
		//SimpleDateFormat date = new SimpleDateFormat(sc.nextLine());
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		
		bc.fileSave(title, author, price, date, discount);
	}
	
}
