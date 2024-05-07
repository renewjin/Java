package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private Member [] members = new Member[SIZE];
	private int memberCount = 0;
	
	public int existMemberNum() {
		return memberCount;
	}
	
	public Boolean checkId(String inputId) {
		// 리스트에 있는 id 비교 for루프 사용
		for(int i = 0; i<memberCount; i++) {
			// 기존 리스트에 있는 아이디와 입력한 아이디와 같으면 true값 리턴 
			if(members[i].getId().equals(inputId)) {
				return true;
			} 
		} 
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		// 리스트의 크기가 10보다 작다면 Member 리스트에 추가해야함
		if (memberCount < 10) {
			// members 리스트 변수에 해당하는 인덱스를 넣어 객체를 만들어서 해당하는 인덱스에 할당함
			members[memberCount++] = new Member(id, name, password, email, gender, age);
		} else {
			System.out.println("더이상 회원을 추가할 수 없습니다.");
		}
	}
	
	public String searchId(String id) {
		// members 리스트를 for 루프 돌려서 id 가 있는지 없는지 
		// 있으면 해당 인덱스의 값들을 리턴
		// 없으면 존재하지 않는다는 메시지 리턴
		/*
		String result ="";
		for (int i = 0; i<memberCount ;i++) {
			// members의 안에서 있는 id와 입력한 id와 같다면
			if(members[i].getId().equals(id)) {
				result = members[i].inform();
				break;
			} 
		}
		if(result.equals("")) {
			return "해당 id는 존재하지 않습니다";
		} else {
			return result;
		}
		*/
		for (int i = 0; i<memberCount ;i++) {
			if(members[i].getId().equals(id)) {
				return members[i].inform();
			}
		} return "해당 id는 존재하지 않습니다";
	}
	
	public Member[] searchName() {
		
	}
}
