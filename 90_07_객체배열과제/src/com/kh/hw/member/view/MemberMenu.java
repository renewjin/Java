package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	// 기본생성자
	public MemberMenu() {
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				// 회원등록
				insertMember();
				break;
			case 2:
				// 회원검색
				searchMember();
				break;
			case 3:
				// 회원 정보 수정
				break;
			case 4:
				// 회원 삭제
				break;
			case 5:
				// 회원모두출력
				break;
			case 9:
				// 프로그램 종료
				System.out.println("프로그램 종료합니다");
				return;
			default:
				System.out.println("잘못된 번호입니다 다시 입력해 주세요");
			}
		}
	}
	
	// 회원등록
	public void insertMember() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		if (mc.checkId(id)) {
			System.out.println("이미 존재하는 아이디 입니다.");
			return;
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(id, name, password, email, gender, age);
		System.out.println("회원등록이 완료되었습니다.");
	}
	
	// 회원검색
	public void searchMember() {
		while(true) {
			System.out.println("=== 회원 검색 ===");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.print("메뉴 번호 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				// 아이디검색
				searchId();
				break;
			case 2:
				// 이름검색
				searchName();
				break;
			case 3:
				// 이메일검색
				break;
			case 0:
				// 이전메뉴 돌아가기
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다 다시 입력해 주세요");
			}
		}
		
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();
		
		System.out.println(mc.searchId(id));
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		for(int i = 0; i<mc.existMemberNum();i++) {
			if()
		}
		
		
	}
}
