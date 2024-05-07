package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 내 집 주소 알아보기
 InetAddress.getLocalHost() : 현재 내 컴퓨터에 지정된 IP 주소를 가져오는 메서드
 
 내 IP 주소 : 192.168.0.23
 기본으로 처음에 컴퓨터가 동일한 선에서 1대일 때는 192.168.0.1		마지막이 1로 시작하는 숫자를 받지만
 
 여러사람이 함꼐 동일한 장소, 동일한 컴퓨터선, 동일한 네트워크를 나눠서 받게 될 경우에는 1부터 번호가 부여받게 됨
 
     강남에 23호
 192.168.0.23의 경우 내 집에있는 호수를 가리켜서 사용
 
 
 숫자로 우리집 주소 = 127.0.0.1 = localhost = 192.168.0.23
 */
public class AddressEx2 {
	public static void main(String[] args) {
		try {
			InetAddress 로컬호스트 = InetAddress.getLocalHost();
			System.out.println("내 IP 주소 : " + 로컬호스트.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// www.facebook.com 페이스북 호스트이름 호스트주소
		try {
			InetAddress 페이스북 = InetAddress.getByName("www.facebook.com");
			System.out.println(페이스북);
			System.out.println("페이스북 이름 : " + 페이스북.getHostName());
			System.out.println("페이스북 ip : " + 페이스북.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// www.instagram.com 인스타그램 호스트이름 호수트주소 검색
		try {
			InetAddress 인스타그램 = InetAddress.getByName("www.instagram.com");
			System.out.println(인스타그램);
			System.out.println("인스타그램 이름 : " + 인스타그램.getHostName());
			System.out.println("인스타그램 ip : " + 인스타그램.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
