package com.kh.hw.person.model.vo;

public class Student extends Person{
// 필드
	private int grade;
	private String major;
	
// 메서드
	// setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// getter
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	
	// 생성자 : 기본
	
	public Student() {
		
	}
	
	// 생성자 : 필수
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	
	// @Override toString
	@Override
	public String toString() {
		return "학생 [이름=" + getName() + ", 나이=" + getAge() + ", 키=" + getHeight() +
				", 몸무게=" + getWeight() + ", 학년=" + grade + ", 전공 : " + major + "]";
	}
}
