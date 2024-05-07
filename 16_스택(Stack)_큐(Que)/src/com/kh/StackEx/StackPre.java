package com.kh.StackEx;

import java.util.Stack;

public class StackPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Stack 을 활용해서 10 30 50 40 20을 넣고 push사용
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		stack.push(20);
		
		// 맨 위값을 지우고 반환해서 확인
		int 추출값 = stack.pop();
		System.out.println(추출값);
		// 현재 맨 위 값 확인
		int 마지막값 = stack.peek();
		System.out.println(마지막값);
		// 비어있는지 확인
		boolean 확인 = stack.isEmpty();
		System.out.println(확인);
		// 크기는 몇인지 확인
		System.out.println(stack.size());

	}

}
