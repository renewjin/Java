package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {

	// 객체 생성 -> 리스트형태
	private Audition[] sArr = new Audition[5];
	
	public static final int CUT_LINE = 60;
	
	// 5개의 객체배열을 샘플데이터의 값으ㅗ 초기화 해주는 기본 생성자
	public AuditionController() {
		sArr[0] = new Audition("김영희", "발라드", 100);
		sArr[1] = new Audition("박영희", "힙합", 50);
		sArr[2] = new Audition("이연이", "뮤지컬", 85);
		sArr[3] = new Audition("정영히", "댄스", 60);
		sArr[4] = new Audition("홍영희", "팝", 20);
	}
	
	// printStudent();Audition[]
	// 객체 배열에 잇는 데이터 반환
	public Audition[] printStudent() {
		return sArr;
	}
	
	// 객체 배열의 점수를 합한 값 리턴
	public int sumScore() {
		int sum = 0;
		for(Audition a : sArr) {
			sum += a.getScore();
		}
		return sum;
	}
	
	// double 배열을 만들어 sumScore의 리턴값을 0번째 인덱스에 저장
	// 합의 평균을 1번째 인덱스에 저장 후 배열 리턴
	public double[] avgScore() {
		double [] avgS = new double[2];
		avgS[0] = sumScore();
		avgS[1] = avgS[0]/sArr.length;
		return avgS;
	}
	
	// pringPass() void
	// for-each 문으로 각 지원자 합격여부 출력
	public void printPass() {
		for (Audition a : sArr) {
			if(a.getScore() >= CUT_LINE) {
				System.out.println(a.getName() + "님은 합격입니다.");
			} else {
				System.out.println(a.getName() + "님은 불합격입니다.");
			}
		}
	}

}
