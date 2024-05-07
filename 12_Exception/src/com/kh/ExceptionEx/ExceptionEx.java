package com.kh.ExceptionEx;

import java.util.*;

/*
 Exception = 예외 상황 발생
 예외는 코드로 처리가능한 에러
 
 try {
 	내가 예외를 발생시킬 수 있지만
 	작성해서 시도하고싶은 코드를 작성
 	
 } catch(Exception e) {
 	예외가 발생했을 때 보여줄 코드나 문구를 작성
 }
 
 catch 문은 무제한으로 작성할 수 있음
 catch 를 여러개 쓸 경우
 
 			catch(배열Exception e) {
 			}
 			catch(Exception e) {
 			}
 */
public class ExceptionEx {
	private Scanner sc = new Scanner(System.in);
	
	// 기본생성자
	public ExceptionEx() {
	}
	
	// 메서드 2개 만들고
	public void method1() {
		int [] 배열 = {10, 20, 30, 40}; // 마지막 인덱스3
		
		for(int i = 0; i <= 배열.length; i++) {
			System.out.println(배열[i]);
		}
	}
	
	public void method2() {
		int [] 배열 = {10, 20, 30, 40}; // 마지막 인덱스3
		
		for(int i = 0; i <= 배열.length; i++) {
			try {
				System.out.println(배열[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("1번 예외상황");
			} catch (Exception e) {
				System.out.println("배열의 인덱스를 벗어났습니다");
			}
		}
	}
	
	// 메인 메서드
	public static void main(String[] args) {
		ExceptionEx 예외발생 = new ExceptionEx();
		//예외발생.method1();
		예외발생.method2();
	}
}
