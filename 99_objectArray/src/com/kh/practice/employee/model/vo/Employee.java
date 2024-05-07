package com.kh.practice.employee.model.vo;

public class Employee {
// 필드
	private String name;
	private String subject;
	private int score;
	
	
// 메서드
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	// 생성자: 기본
	public Employee() {
		
	}
	
	// 생성자 : 최종
	public Employee(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// inform : String, 모든 필드값들을 합쳐 반환
	public String inform() {
		return "이름 : " + name + ", 과목 : " + subject + ", 점수 : " + score;
	}
	
}
