package com.kh.varible.ex;
/*
 Enum(열거형)
 늘어서 작성해 놓은 것을 행함
 
 변수명을 나열해놓은 것 상수 (상시적으로 고정된 이름)
 
 상수들의 집합체
 
 메서드
 	values() : Enum에 적어놓은 모든 상수를 배열로 반환
 	valueOf(String 이름) : 이름과 일치하는 Enum 상수를 반환
 	ordinal() : Enum 상수의 순서를 전달
 	name() : Enum 상수의 이름 반환
 	compareTo(EnumType e) : 다른 Enum 상수와 순서 비교
 	toString() : Enum 상수의 문자열 표현 반환
 	getClass() : Enum 클래스의 Class 객체 반환
 	
 	
 */
// EnumEx => 열거형Ex
public class 열거형Ex {
	public enum 날짜들 {
		월요일,
		화요일,
		수요일,
		목요일,
		금요일,
		토요일,
		일요일, // 변경되지 않기때문에 글자색이 파란색으로 나타남, 상수이므로 영어로 작성할때는 대문자로 작성
	}
	
	public enum 계절 { // 상수 나열
	//	 0	 1	  2	   3	index
		봄, 여름, 가을, 겨울
	}
	
	public static void main(String[] args) {
		//각 요일 출력
		System.out.println("월요일 : " + 날짜들.월요일);
		System.out.println("화요일 : " + 날짜들.화요일);
		
		계절 [] 계절들 = 계절.values();
		System.out.println("계절들에 정의된 모든 상수");
		for(계절 r : 계절들) {
			System.out.println(r);
		}
		
		// valueOf(String 이름) : 이름과 일치하는 Enum 상수를 반환
		계절 봄 = 계절.valueOf("봄");
		// 일치하지 않으면 오류발생 -> 예외처리해줘야함 exception
		//계절 봄 = 계절.valueOf("st");
		System.out.println("봄 과 일치하는 상수 : " + 봄);
		
		//ordinal : 순서 길이를 측정하는 수
		System.out.println("봄 상수의 순서 : " + 봄.ordinal());
		
		// name() : 상수의 이름을 전달
		System.out.println("봄 상수의 이름 : " + 봄.name());
		
		// toString : value() 로 사용했던 것처럼 사용해서 출력
		System.out.println(봄.toString());
		
		// getClass() : 클래스 객체 반환
		System.out.println("클래스의 객체는 : " + 봄.getClass());
		System.out.println("클래스의 객체는 : " + 계절들.getClass());
	}

}
