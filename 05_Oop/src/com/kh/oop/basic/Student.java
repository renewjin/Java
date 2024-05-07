package com.kh.oop.basic;

public class Student {
	//필드	Strung name int age int grade 
	//학생인데 학생의 이름과 		나이와 	학년
	
	// 생성자 메서드 (필수로 작성해야하는 생성자 메서드 만들기)
	// 필수로 넣어야하는것 이름 나이 학녁
	
	// 출력 메서드 정보출력 메서드
	//puvlic void info() {
	//	System.out.println 이름 나이 학년 출력
	//}
	
	// 최종 메인 메서드
	// 학생 객체 생성하기
	// Student student1 김철수 18살 3학년
	// Student student2 박영희 20살 2학년
	
	public String name;
	public int age;
	public int grade;
	
	public Student (String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void info() {
		System.out.println("이름 : " + name + ", " +
				" 나이 : " + age + ", " +
				" 학년 : " + grade);
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("김철수", 18, 3);
		Student student2 = new Student("박영희", 20, 2);
		
		student1.info();
		student2.info();
	}

}
