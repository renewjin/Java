package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	// www.google.com 호스트명과 IP 주소 가져오기
	public static void main(String[] args) {
		try {
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("호스트 명 : " + 구글.getHostName());
			System.out.println("ip주소 : " + 구글.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 나의 컴퓨터 이름과 자리번호 확인하기
		// get localhost
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			
			System.out.println(localhost);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
