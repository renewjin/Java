package com.kh.oop.basic;

public class Animal { // 동물
	
	// 1. 필드 이름 String name 나이 int age
	
	// 2. 초기 생성자 // 생성자 -> 클래스 이름과 동일하다는것 기억
	
	// 3. 필수 생성자 String name, int age
	
	// 4. 출력 메서드 public void info() {
	// System.out.pringln(이름 나이 출력)
	//}
	
	// 5. 메인 메서드 public static void main(String[] args) {
	
	// 1) 초기생성자로
		// Animal dog = new Animal();
		// 강아지의 이름 나이
		// 강아지 정보 출력
	// 2) 필수생성자로
		// Animal cat = new Animal("고양이", 3);
		// 고양이 정보 출력
	
	public String name;
	public int age;
	
	public Animal () {
		
	}
	
	public Animal (String 이름) {
		this.name = 이름;
	}
	
	public Animal (int 나이) {
		this.age = 나이;
	}
	
	public Animal (String 이름, int 나이) {
		this.name = 이름;
		this.age = 나이;
	}
	//이름만 필수로 하나는 나이만 필수로
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "포메";
		dog.age = 2;
		dog.info();
		
		Animal cat = new Animal("냥이", 3);
		cat.info();
		
		//돼지는 이름만 소는 나이만
		Animal pork = new Animal("꿀꿀");
		pork.age = 4;
		pork.info();
		
		Animal beef = new Animal(8);
		beef.name = "소";
		beef.info();
		
	}

}
