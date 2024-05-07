package com.kh.oop.basic;

public class Bank {
	// 이름, 계좌번호, 잔액, 비밀번호, 마케팅수신동의
	public String name;
	public String accountNumber;
	public int balance;
	public String password;
	public boolean agree;
	
	// 생성자 메서드
	// 1. 필수가 아닌 생성자
	// 생성자 = 클래스명 같아야함
	public Bank () {
		
	}
	
	// 2. 필수인 생성자 이름, 계좌번호, 잔액, 비밀번호
	public Bank (String name, String accoNum, int balan, String pW) {
		this.name = name;
		this.accountNumber = accoNum;
		this.balance = balan;
		this.password = pW;
	}
	
	// 3. 출력 생성자
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + balance);
		System.out.println("비밀번호 : " + password);
		System.out.println("마케팅수신동의 : " + agree);
	}
	
	// 4. 최종 메인 출력 메서드
	public static void main(String[] args) {
		// 1. 조 씨 은행 통장 ok
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-3333";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree = true;
		
		customer1.info();
		
		// 2. 던 씨 은행 통장 수신동의 안함
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accountNumber = "111-110-1234";
		customer2.balance = 1000;
		customer2.password = "1234";
		// boolean의 디폴트값은 false
		
		customer2.info();
		
		// 3. 필수 생성자를 활용해서 마이클씨의 은행통장
		// 이름 계좌번호 잔액 비밀번호를 입력하고
		// 마케팅 수신동의를 true 변경해서 출력하기
		Bank customer3 = new Bank("마이클", "111-123-4567", 20000, "7845");
		customer3.agree = true;
		
		customer3.info();
		
	}
}
