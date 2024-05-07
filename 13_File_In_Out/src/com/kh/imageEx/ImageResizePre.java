package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	public static void main(String[] args) {
		// 원본 이미지 pigs.jpg	pigs_cuts.jpg	가로400, 세로200
		
		// 1. 파일 경로
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 사이즈조정이미지 = "src/com/kh/imageEx/pig_cute.jpg";
		
		// 2. 크기 조정 변수 설정
		int 가로 = 400;
		int 세로 = 200;
		
		
		try {
			// 3. 버퍼이미지를 통해 이미지 불러오기
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			// 4. 새로운 크기의 이미지 생성
			//											가로크기, 세로크기, 이미지타입선택
			BufferedImage 크기조정이미지 = new BufferedImage(가로, 세로, BufferedImage.TYPE_INT_RGB);
			
			// 5. 이미지 크기 조정해서 새로운 이미지 그리기
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로, 세로, Image.SCALE_SMOOTH);
			
			// 6. 새로운 크기(그릇)에 이미지 크기 조절해서 그린 이미지 넣기
														//	x	y	효과추가여부
			크기조정이미지.createGraphics().drawImage(이미지그리기, 0, 0, null);
			
			// 새로만든 이미지를 파일로 저장
			//			크기조정한파일,		파일형식,	저장할파일
			ImageIO.write(크기조정이미지, "jpg", new File(사이즈조정이미지));
			
			System.out.println("이미지 저장 성공");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 저장 실패");
			e.printStackTrace(); // 에러 원인 코드 나타남
		}
	}
	
	
	
}
