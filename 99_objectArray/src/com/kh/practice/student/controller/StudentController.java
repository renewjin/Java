package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	// 5개가 들어갈 배열을 만들어주는데 학생으로 만들어 주세요
	// 값이 변하는 변수의 경우 데이터 보호를 위해 private을 사용
	
	private Student[] sArr = new Student[5];
	
	// 상수는 값이 고정이므로 공개해도 되기 때문에 public static를 사용
	public static final int CUT_LINE= 60; // final -> 상수, 대문자로 사용
//메서드
	// 생성자 : 기본
	public StudentController() {
		/*		
		 * 		┌ sArr[0] 이름 과목 점수 / 김길동 자바 100
		 * 		├ sArr[1] 이름 과목 점수 / 박길동 디비 50
		 Student├ sArr[2] 이름 과목 점수 / 이길동 화면 85
		 sArr	├ sArr[3] 이름 과목 점수 / 정길동 서버 60
		 		└ sArr[4] 이름 과목 점수 / 홍길동 자바 20
		 
		 */

		
		// 0번째 학생 4번째 학생까지 값을 넣어주기
		/*
		Student a = new Student();
		a.setName("김길동");
		a.setSubject("자바");
		a.setScore(100);
		*/
		
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	// 반환 메서드
	// sArr에 저장된 사람들의 정보들을 모두 보기
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() { // 점수 합한 값 전달
		int sum = 0;
		for (Student s : sArr) {
			sum += s.getScore();
		}
		// 마지막으로 총합을 sumScore을 부른다면 내가 가진 점수를 보여주겠다
		return sum;
	}
	
	// 총점을 받아서 평균 구하기
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length; // 학생들의 평균
		return avgArr;
	}
	
	// 각 학생의 합격 여부를 확인하고 출력하는 메서드
	public void printPass() {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " 학생은 " + ( s.isPassed() ? "통과" : "불합격" ) + "입니다.");
		}
	}
	
}
