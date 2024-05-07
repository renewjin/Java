package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		
		student1.setGrade(3);
		student1.setClassroom(1);
		student1.setName("김철수");
		student1.setGender('남');
		student1.setHeight(175.6);
		
		student1.informateion();
		
	}

}
