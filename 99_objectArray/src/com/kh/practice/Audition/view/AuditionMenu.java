package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;
import com.kh.practice.student.model.vo.Student;

public class AuditionMenu {
	
	//AuditionController 클래스의 있는 데이터를 쓰기 위해서 객체생성
	private AuditionController ac = new AuditionController();
	
	// 기본 생성자
	public AuditionMenu() {
		
	}
	
	public void printAuditionMenu() {
		System.out.println("이름\t분야\t점수");
		
		// 이름/분야/점수의 정보를 리턴하는 함수는 Audition 클래스의 inform 함수
		// 정보들을 가지고 있는 리스트를 반환하는 함수는 AuditionController 클래스의 printStudent 함수
		// 이름 분야 점수에 대한 정보들을 출력
		for (Audition audi: ac.printStudent()) {
			System.out.println(audi.inform());
		}
		
		System.out.println("학생들의 총 합점 : " + ac.sumScore());
		//System.out.println("학생들의 총 합점 : " + ac.avgScore()[0]);
		System.out.println("평균 : " + ac.avgScore()[1]);
		System.out.println("=== 학생들의 합격 여부 ===");
		ac.printPass();
		
		
	}
}
