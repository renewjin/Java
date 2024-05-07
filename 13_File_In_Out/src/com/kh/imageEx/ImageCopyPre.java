package com.kh.imageEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImageCopyPre {
	public static void main(String[] args) {
		// 원본 이미지 hogam 복사이미지 hogam_cute
		// 경로 설정
		String 원본이미지 = "src/com/kh/imageEx/hogam.jpg";
		String 복사이미지 = "src/com/kh/imageEx/hogam_cute.jpg";
		
		try {
			FileInputStream 파일읽기 = new FileInputStream(원본이미지); // 원본이미지 가져오기
			FileOutputStream 파일쓰기 = new FileOutputStream(복사이미지);
			
			// 버퍼를 통해 데이터를 읽고 쓰기 위한 배열 설정
			byte [] buffer = new byte[1024];
			int 길이;
			
			// 버퍼를 통해 원본 이미지 데이터를 가져와 복사할 파일에 사용
			while((길이 = 파일읽기.read(buffer))> 0) {
				파일쓰기.write(buffer, 0, 길이);
			}
			
			파일읽기.close();
			파일쓰기.close();
			
			System.out.println("이미지 복사 완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 복사 실패");
			e.printStackTrace();
		}
		
	}
}
