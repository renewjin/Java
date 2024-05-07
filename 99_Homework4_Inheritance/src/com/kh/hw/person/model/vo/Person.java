package com.kh.hw.person.model.vo;

public class Person {
// 필드
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
// 메서드
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	// 생성자 : 기본
	public Person() {
		
	}
	
	// 생성자 : 필수
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 각 필드 반환 메소드
	@Override
	public String toString() {
		return "사람[name= " + name + ", age=" + age + ", height=" + height
				+ ",  weight" + weight + "]";
	}
}
