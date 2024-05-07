package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	// 기본생성자
	public MapPre() {
		
	}
	
	// void 메서드 생성
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		/*
		int[] keys = {2, 3, 1};
		String[] values = {"에그마요", "로티세리바베큐", "스파이시쉬림프"};
		for(int i = 0; i<keys.length; i++) {
			map.put(keys[i], values[i]);
		}
		*/
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
	}
	
	public void practice2() {
											//<> 자료형 넣어도 되고 안넣어도 됨
		Map<String, String> map = new HashMap<String, String>();
		// map.put을 활용해서 학원-서울시 강남구 등산-서울시 관악구 롯데타워-서울시 송파구
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		
		// 전체출력 System.out.println();
		System.out.println(map);
		
		// get 이용해서 롯데타워가 어디 있는지 출력
		System.out.println("롯데타워 위치는 : " + map.get("롯데타워"));
		
		// remove 활용해서 등산 삭제
		map.remove("등산");
		
		// for-each ketSet()을 활용해서 전체목록 출력
		for (String 장소 : map.keySet()) {
			System.out.println("장소 : " + 장소 + ", 위치 : " + map.get(장소));
		}
	}
	
	public void practice3() {
		// 특정 값이 존재하는지 확인
		// String Integer 과일 - 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		// 200원짜리 과일이 존재하는가?
		System.out.println("200원 과일이 존재하는가? : " + map.containsValue(200));
		// containsValue true, false 값이 보여짐
		
		// 체리 과일이 존재하는가 ?
		System.out.println("체리가 있나요? : " + map.containsKey("체리"));
		// containsValue, containsKey의 값은 false, true로 반환함
		
		// 크기조회
		System.out.println(map.size());
	}
	
	public void practice4() {
		// 변수명은 map
		Map<Integer, String> map = new HashMap<>();
		
		// put을 이용해서 1- 에그마요, 2- 로티세리바베큐 3- 스테이크앤치즈 4-스파이시쉬림프
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		System.out.println(map);
		
		// get을 이용해서 3번에 value값 찾기
		System.out.println(map.get(3));
		
		// size를 이용해서 총 메뉴가 몇개인지 확인
		System.out.println(map.size());
		
		// remove 이용해서 2번 메뉴 삭제
		map.remove(2);
		System.out.println(map);
		
		// isEmpty를 사용해서 비어있는지 확인
		System.out.println(map.isEmpty());
		
		// keySet을 이용해서 for-each 모든 메뉴 보여주기
		for (int num : map.keySet()) {
			System.out.println(num + "번 메뉴 : " + map.get(num));
		}
		
		// Map.Entry 키-값을 동시에 가져오는 방법 뒤에는 변수명.entrySet()
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		// clear을 이용해서 삭제
		map.clear();
		System.out.println(map.isEmpty());
		System.out.println(map);
	}
	
	// 최종 메인메서드
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		mp.practice1();
		mp.practice2();
		mp.practice3();
		mp.practice4();
	}
}
