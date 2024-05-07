package com.kh.ThreadPre;

public class 우선순위스레드 {
	//main
	public static void main(String[] args) {
		// for 문으로 1부터 10까지 반복
		// 1 ~ 3 까지 차례대로 실행할 수 있도록 설정
		for (int i = 0; i<3 ; i++) {
			스레드연습 스레드 = new 스레드연습(i);
			if(i==0) {
				스레드.setPriority(Thread.MAX_PRIORITY);
			} else if (i==1) {
				스레드.setPriority(Thread.NORM_PRIORITY);
			} else {
				스레드.setPriority(Thread.MIN_PRIORITY);
			}
			스레드.start();
		}
	}
}
