package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 직원 1에 대한 정보를 담을 변수명 Employee 객체 생성
		Employee emp1 = new Employee();
		emp1.empNo = 1;
		emp1.empName = "AAA";
		emp1.gender = '남';
		System.out.println("=== 직원1 ===");
		System.out.println("사원번호 : " + emp1.empNo);
		System.out.println("사원이름 : " + emp1.empName);
		System.out.println("사원성별 : " + emp1.gender);
		
		// 직원2 필수로 번호 이름 필수 넣자
		// 객체 생성한 후 필수생성자로 작성하기
		Employee emp2 = new Employee(2, "BBB");
		System.out.println("=== 직원2 ===");
		System.out.println("사원번호 : " + emp2.empNo);
		System.out.println("사원이름 : " + emp2.empName);
		
		// 직원3 필수로 모두 작성해서 제출
		Employee emp3 = new Employee(3, "CCC", "마케팅", "사무직", 20, '남', 
				+ 5000, 1000, "010-1234-5678", "서울시 광진구");
		System.out.println("=== 직원3 ===");
		System.out.println("사원번호 : " + emp3.empNo);
		System.out.println("사원이름 : " + emp3.empName);
		System.out.println("사원부서 : " + emp3.dept);
		System.out.println("사원직무 : " + emp3.job);
		System.out.println("사원나이 : " + emp3.age);
		System.out.println("사원성별 : " + emp3.gender);
		System.out.println("사원연봉 : " + emp3.salary);
		System.out.println("사원특봉 : " + emp3.bonusPoint);
		System.out.println("사원폰번 : " + emp3.phone);
		System.out.println("사원주소 : " + emp3.address);
		// 코드 길어지므로 함수로 분리해서 사용
	}

}
