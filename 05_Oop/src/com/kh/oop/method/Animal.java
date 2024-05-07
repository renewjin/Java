package com.kh.oop.method;

public class Animal {
	// 필드
	public String name;
	public int age;
	
	// 메서드
	// 기본
	public Animal() {
		
	}
	
	// 필수
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// return
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// void로 프린트 출력하기
	public void info() {
		System.out.println("동물 이름 : " + name);
		System.out.println("동물 나이 : " + age);
	}
	
	
	public static void main(String[] args) {
		// 동물 변수명으로 = dog ("이름", "1")
		Animal dog = new Animal("진도", 1);
		//System.out.println("강아지 이름 : " + dog.getName());
		//System.out.println("강아지 나이 : " + dog.getAge());
		dog.info();
		
		Animal cat = new Animal("냥이", 3);
		//System.out.println("고양이 이름 : " + cat.getName());
		//System.out.println("고양이 이름 : " + cat.getAge());
		cat.info();

	}

}
