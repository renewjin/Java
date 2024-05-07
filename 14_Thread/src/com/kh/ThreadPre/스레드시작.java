package com.kh.ThreadPre;

public class 스레드시작 {
// main 메서드 생성
// for 문으로 스레드 2개 만들기
	// start() 스레드 시작
	// 메인 메서드 종료 출력
	public static void main(String[] args) {
		
		for (int i = 0; i<5; i++) {
			스레드연습 스레드 = new 스레드연습(i);
			스레드.start();
		}
		System.out.println("메인종료");
	}
}
