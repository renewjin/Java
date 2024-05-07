package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	// getter setter
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	public Student() {
		
	}
	
	public void informateion() {
		System.out.println("학년 : " + getGrade());
		System.out.println("반 : " + getClassroom());
		System.out.println("이름 : " + getName());
		System.out.println("키 : " + getHeight());
		System.out.println("성별 : " + getGender());
	}

}
