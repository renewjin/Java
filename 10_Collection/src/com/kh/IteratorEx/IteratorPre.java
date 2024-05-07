package com.kh.IteratorEx;

/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/
import java.util.*;

public class IteratorPre {

	public static void main(String[] args) {
		// 100, 10, 20, 30, 50 70
		// ArrayList<Integer> 숫자들 = new ArrayList<>();
		// 숫자를 추가하는 방법 1. 숫자들.add(100)
		// 숫자를 추가하는 방법 2. Arrays.asList()
		ArrayList<Integer> 숫자들 = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		숫자들.add(70);
		System.out.println(숫자들);
		
		// Iterator 생성
		Iterator<Integer> 반복하기 = 숫자들.iterator();
		
		// while문 사용해서 hasNext()로 다음 요소가 있는지 확인하고
		// next()로 출력하기
		
		while(반복하기.hasNext()) {
			//int 숫자 = 반복하기.next();
			//System.out.println(숫자);
			System.out.println(반복하기.next());
		}

	}

}
