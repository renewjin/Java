package com.kh.practice.employee.controller;

import com.kh.practice.employee.model.vo.Employee;

public class EmployeeController {

	// Employee 클래스를 가져와 길이가 5인 리스트를 만들어 sArr 변수로 할당시킴
	private Employee[] sArr = new Employee[5];
	
	// 상수값을 CUT_LINE 변수에 값을 할당
	// 상수값은 보호할 필요가 없기 때문에 public static를 사용
	public static final int CUT_LINE= 60;
	
	// 생성자 기본
	// 
	public EmployeeController() {
		sArr[0] = new Employee("김", "자바", 100);
		sArr[1] = new Employee("이", "디비", 50);
		sArr[2] = new Employee("박", "화면", 85);
		sArr[3] = new Employee("정", "서버", 60);
		sArr[4] = new Employee("홍", "자바", 20);
	}
	
	// 반환 함수 -> 반환하는 변수의 형식을 써줌
	public Employee[] printStudent() {
		return sArr;
	}
	
	//반환 함수 -> 반환하는 변수의 형식을 써줌
	public int sumScore() {
		int sum = 0;
		for (Employee s : sArr) {
			sum += s.getScore();
		}
		return sum;
	}
	
	//반환 함수 -> 반환하는 변수의 형식을 써줌
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0]/sArr.length;
		return avgArr;
	}
	
	

}
