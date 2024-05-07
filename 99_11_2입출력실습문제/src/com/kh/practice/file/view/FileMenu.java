package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	// 키보드로 입력받을 Scanner 작성
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController(); 
	
	public void mainMenu() {
		System.out.println("1. 파일저장");
		System.out.println("2. 파일열기");
		System.out.println("3. 파일편집");
		System.out.println("4. 종료");
		System.out.print("메뉴선택 : ");
		
		int choice = sc.nextInt();
		sc.nextLine(); // 남아있는 엔터 지우기
		
		switch(choice) {
		case 1:
			//파일저장
			fileSave();
			break;
		case 2:
			//파일열기
			fileOpen();
			break;
		case 3:
			//파일수정
			fileEdit();
			break;
		case 4:
			//종료
			System.out.println("프로그램 종료");
			System.exit(0);
			//return;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	// 1. 파일저장
	public void fileSave() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		
		// 만약 파일이 존재한다면
		if(fc.checkName(fileName)) { // fc 클래스에 checkName 함수를 이용해 파일이름 체크 
			System.out.println("파일이 이미 존재합니다.");
		} else {
			System.out.print("작성할 내용 입력 : ");
			String content = sc.nextLine();
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}
	
	// 파일 열기
	public void fileOpen() {
		System.out.print("열어줄 파일 이름 입력하기 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		System.out.println("파일내용 : " + fileContent);
	}
	
	// 파일 수정하기
	
	public void fileEdit() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		
		// 파일이 업다면 파일이 존재하지 않습니다.
		System.out.println("현재 파일 내용 : " + fileContent);
		System.out.print("새로운 내용 입력 : ");
		String newContent = sc.nextLine();
		// StringBuilder를 사용해서 파일에 쓸 내용 작성
		fc.fileEdit(fileName, new StringBuilder(newContent));
		
	}
}
