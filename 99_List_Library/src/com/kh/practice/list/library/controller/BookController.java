package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();
	
	// 생성자 ctrl space enter
	public BookController() {
	}
	
	// 책 추가하기
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	// 책 전체보기
	public void selectList() {
		// 만약에 책이 없다면 등록된 도서가 없습니다.
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			//for- each 활용해서 전체보기
			for (Book b: list) {
				System.out.println(b.toString());
			}
		}
		// 책이 있다면 책 목록을 보여주기
	}
	
	// 키워드로 책 검색하기
	public void searchBook(String keyword) {
		ArrayList<Book> 검색결과 = new ArrayList<>();
		for (Book b : list) {
			if(b.getTitle().contains(keyword) || b.getAuthor().contains(keyword)) {
				검색결과.add(b);
			}
		}
		
		if(검색결과.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book bb : 검색결과) {
				System.out.println(bb);
			}
		}
	}
	
	public void deleteBook(String title, String author) {
		/*
		// true false를 통해 삭제가 됐는지 안됐는지 확인할 수 있도록 함
		boolean removed = false; // boolean 기본값 false
		
		// 책 제목과 저자를 검색해서 삭제할 책 찾기
		// 정체 목록
		for(Book bbb : list) {
			// 만약에 내가 삭제하고자하는 책제목과 책저자가 존재한다면
			if(bbb.getTitle().equals(title) && bbb.getAuthor().equals(author)) {
				list.remove(bbb);
				// 삭제가 됐으면 true
				removed = true;
				break;
			}
		}
		
		// 만약에 삭제가 됐으면 삭제됐다는 true false를 이용해서 표시하기
		if(removed) {
			System.out.println("도서 삭제가 완료되었습니다.");
		} else {
			System.out.println("해당하는 도서를 찾을 수 없습니다.");
		}
		*/
		
		for (Book b : list) {
			if(b.getTitle().contains(title) && b.getAuthor().contains(author)) {
				System.out.println("해당하는 " + b.getTitle() + "," +  b.getAuthor() + "이 목록에서 삭제되었습니다.");
				list.remove(b);
				System.out.println(list);
				break;
			} else {
				System.out.println("해당 책은 존재하지 않습니다");
			}
		}
		
	}
	
	// 책 제목 오름차순 정렬
	public void ascBook() {
		// for while short 오름찻누 정렬을 해주면 됨 -> 코드가 길어짐
		// sort 리스트 정렬함수(정렬할 리스트, 정렬하는 기준)
		//											// :: 람다표현식 -> Book 파일의 getTitle 참조해서 사용하겠다
		//									comparing : 비교하다
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}

}
