package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	public static void main(String[] args) {
		/*
		TreeSet<String> ts = new TreeSet<>();
		// 과일들 String "키위 복숭아 참외 수박 딸기"
		ts.add("키위");
		ts.add("복숭아");
		ts.add("참외");
		ts.add("수박");
		ts.add("딸기");
		*/
		TreeSet<String> ts = new TreeSet<>(Set.of("키위", "복숭아", "참외", "수박", "딸기"));
		System.out.println(ts);
		// 복숭아 제거
		ts.remove("복숭아");
		
		// 수박이 포함되어있는지 확인
		System.out.println(ts.contains("수박"));
		
		// 과일들이 비어잇는지 확인
		System.out.println(ts.isEmpty());
		
		// 과일들 개수
		System.out.println(ts.size());

		// 가장 작은 값
		System.out.println(ts.first());
		
		// 가장 큰 값
		System.out.println(ts.last());

		// 모든 값 제거
		ts.clear();
		
		// 모든값 제거 확인	
		System.out.println(ts.size());
	}
	
}
