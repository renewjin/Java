package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(); 
		
		// offer 80 60 30 20
		q.offer(80);
		q.offer(60);
		q.offer(30);
		q.offer(20);
		
		System.out.println(q);
		// poll 데이터 확인 및 제거
		int 추출값 = q.poll();
		System.out.println(추출값);
		
		// peek 맨 앞 데이터 확인
		int 값확인 = q.peek();
		System.out.println(값확인);
		
		// isEmpty 비어있는지 확인
		System.out.println(q.isEmpty());
	}
}
