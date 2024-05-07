package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	// 키보드 값 입력받을 scanner
	Scanner sc = new Scanner(System.in);
	
	BookController bc = new BookController();
	
	// Book을 실행하지마자 보이는 메인메뉴 만들기
	public void mainMenu() {
		// 만약에 true 라면 계속 실행
		while(true) {
			System.out.println(" === 도서관리 프로그램 ===");
			System.out.println("1. 도서추가");
			System.out.println("2. 도서 전체 목록 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("6. 종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				// 도서추가
				insertBook();
				break;
			case 2:
				// 전체목록조회 
				selectList();
				break;
			case 3:
				// 도서 검색
				searchBook();
				break;
			case 4:
				// 도서삭제
				deleteBook();
				break;
			case 5:
				// 오름차순 정렬
				ascBook();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
		}
	}
	
	// 도서목록을 오름차순으로 정렬하기
	// ascending 오름차순
	public void ascBook() {
		// bookController 도서 오르차순 정렬하는 기능 추가
		bc.ascBook();
	}
	
	// 도서 삭제
	public void deleteBook() {
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		//BookController 도서삭제 기능 추가
		bc.deleteBook(title, author);
	}
	
	// 검색조회
	public void searchBook() {
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		bc.searchBook(keyword);
	}
	
	// 전체 목록 조회
	public void selectList() {
		bc.selectList();
	}
	
	// 책 추가하기 위해 키보드로 작성하는 insertBook void 만들기
	public void insertBook() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		// 책 정보 저장하는 Book 객체 소환
		//						제목,  저자,     카테고리,   가격
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("도서 추가가 완료 되었습니다.");
	}
}
