package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		/*
		 String으로 
		 "applee", "사과"
		 "banana", "바나나"
		 "orange", "오렌지"
		 "grape", "포도"
		 "watermelon", "수박"
		 
		 [] for 문 활용해서 추가
		 
		 전체 출력
		 
		 get 사용해서 banana에 해당하는 값 가져오기
		 size 확인
		 isEmpty 비어있는지 확인
		 containsKey 키가존재하는지 grape
		 containsValue 키가존재하는지 포도
		 모든키 출력 keySet
		 모든값 출력 values()
		 첫번째 키 출력 first
		 마지막키 출력
		 clear
		 */
		TreeMap<String, String> tm = new TreeMap<>();
		// 키-값 한번에 넣는 방법 : 키-값의 리스트를 각각 만들고 for 문을 이용해 Map에 입력하는 put함수를 사용
		String[] keys = {"apple", "banana", "orange", "grape", "watermelon"};
		String[] vlaues = {"사과", "바나나","오렌지", "포도", "수박"};
		
		for (int i=0; i<keys.length;i++) {
			tm.put(keys[i], vlaues[i]);
		}
		
		System.out.println(tm);
		
		System.out.println(tm.get("banana"));
		
		System.out.println(tm.isEmpty());
		
		System.out.println(tm.containsKey("grape"));
		
		System.out.println(tm.containsValue("포도"));
		
		System.out.println(tm.keySet());
		
		System.out.println(tm.values());
		
		System.out.println(tm.firstKey());
		
		System.out.println(tm.lastKey());
		
		tm.clear();
		
		System.out.println(tm);
		
	}
}
