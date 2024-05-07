package com.kh.FileEx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {
	
	// 생성자 : 기본
	public FilePre() {
		
	}
	
	public void 메서드1() {
		File 텍스트파일 = new File("C:/Users/user1/Desktop/newFFF/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		} else {
			// 만약에 파일 만들기 성공
			try {
				텍스트파일.createNewFile(); // 파일만들기
				System.out.println(텍스트파일.getName() + "파일이 생성되었습니다.");
				
			} catch (IOException e) {
				System.out.println("파일만들기 실패했습니다.");
				e.printStackTrace();
			}
		}
	}
	
	public void 메서드2() {
		// 절대경로
		// 바탕화면에 뉴폴더라는 폴더 생성하고 뉴폴더 안에 파일생성.txt 파일 만들기
		//File 새폴더 = new File("C:/Users/user1/Desktop/뉴폴더");
		String 폴더만들기 = "C:/Users/user1/Desktop/뉴폴더";
		
		// 바탕화면 경로를 설정하는 방법
										// c:/Users/user1
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		System.out.println(바탕화면경로);
		
		File 새폴더 = new File(폴더만들기);
		//File 텍스트파일 = new File("C:/Users/user1/Desktop/뉴폴더/파일생성.txt");
		File 텍스트파일 = new File(폴더만들기 + "/파일생성.txt");
		
		if(새폴더.exists()) {
			System.out.println(새폴더.getName() + "폴더가 존재합니다.");
		} else {
			새폴더.mkdir(); // 폴더생성
			System.out.println("생성된 폴더명 : " + 새폴더.getName());
			System.out.println("생성된 폴더 위치 : " + 새폴더.getPath());
		}
		
		if (텍스트파일.exists()) {
			System.out.println(텍스트파일.getName() + " 파일이 존재합니다.");
		} else {
			try {
				텍스트파일.createNewFile(); // 파일생성
				System.out.println(텍스트파일.getName() + "파일이 생성되었습니다.");
				
			} catch (IOException e) {
				System.out.println("파일을 만들지 못했습니다.");
				e.printStackTrace();
			}
		}
		
		
		
	}

	public void 메서드3() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		
		// 모든 폴더 생성
		File 폴더들 = new File(바탕화면경로 + "/뉴1/뉴2/뉴3");
		폴더들.mkdirs();
		
		// 파일생성
		File 파일 = new File(폴더들 + "/새로운파일.txt");
		try {
			boolean 파일생성확인 = 파일.createNewFile();
			System.out.println("파일이 생성되었나요? " + 파일생성확인);
			
			// 파일 크기확인
			System.out.println(파일.length());
			
			// 파일 마지막 수정일 확인
			System.out.println(파일.lastModified());
			
			// 파일삭제
			파일.delete();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void 메서드4() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		
		try {
			텍스트파일.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void 메서드5() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		File 새로운이름 = new File(바탕화면경로 + "/newFFF/변경된이름.txt");
		
		// 파일 이름 변경하기
		// 만약에 파일이 존재할 경우 -> 파일 이름 변경 // 존재하지 않으면 변경x
		if(텍스트파일.exists()) {
			// 만약에 파일 이름을 성공적으로 변경했다면
			if(텍스트파일.renameTo(새로운이름)) {
				System.out.println("파일 이름이 성공적으로 변경되었습니다.");
			} else {
				System.out.println("파일 이름 변경에 실패했습니다.");
			}
		} else {
			System.out.println("파일 이름이 존재하지 않습니다. 만들어주세요");
			
		}
	}
	
	public void 메서드6() {
		// 바탕화면에 이미지 폴더 / 동물이름.txt 파일을 만들어 준 후
		// 동물이름 소, 고양이, 돼지, 토끼 호랑이 이름을 \n 작성해서 만들어주고
		// 동물이름을 만들어 준 다음에
		// 좋아하는 동물이름으로 폴더 이름 변경한 다음
		// 삭제하기
		
		// 경로설정
		//String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		/*
		String 바탕화면경로 = "C:/Users/user1/Desktop";
		
		File 폴더 = new File(바탕화면경로 + "/이미지폴더");
		File 텍스트파일 = new File(폴더 + "/동물이름.txt");
		File 변경할파일이름 = new File(폴더 + "/고양이.txt");
		
		if (폴더.exists()) {
			System.out.println(폴더.getName() + " 폴더가 존재합니다.");
		} else {
			폴더.mkdir();
		}
		
		if (텍스트파일.exists()) {
			System.out.println(텍스트파일.getName() + " 파일이 존재합니다.");
		} else {
			try {
				BufferedWriter 버퍼글쓰기 = new BufferedWriter(new FileWriter(텍스트파일));
				버퍼글쓰기.write("소\n");
				버퍼글쓰기.write("고양이\n");
				버퍼글쓰기.write("돼지\n");
				버퍼글쓰기.write("토끼\n");
				버퍼글쓰기.write("호랑이\n");
				
				버퍼글쓰기.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (텍스트파일.exists()) {
			
			if(텍스트파일.renameTo(변경할파일이름)) {
				System.out.println("파일이름이 변경되었습니다.");
				
			} else {
				System.out.println("파일이름 변경이 실패하였습니다.");
			}
		}
		
		변경할파일이름.delete();
		
		// 삭제하기
		// 폴더 삭제 파일 삭제
		// 폴더 삭제를 할 때 폴더 안에 파일이 존재한다면 폴더 삭제가 되지 않음
		// -> 폴더안에 파일이 존재하는지 확인하고 폴더 안에 파일이 하나도 존재하지 않는다면 삭제
		// -> 폴더안에 파일 존재 여부 확인 방법
		// -> 배열을 이용해서 파일 목록을 받고 파일 목록이 없다면 삭제
		*/
		
		String 폴더경로 = System.getProperty("user.home") + "/Desktop";
		
		File 이미지폴더 = new File(폴더경로 + "/이미지폴더");
		
		이미지폴더.mkdir(); // 이미지폴더 1개 생성
		
		try {
			
			FileWriter 글쓰기 = new FileWriter(이미지폴더 + "/동물이름.txt");
			
			글쓰기.write("소\n고양이\n돼지\n토끼\n호랑이");
			글쓰기.close();
			
			System.out.println("동물이름 파일에 이름이 작성되었습니다.");
			
			// FileWriter는 글쓰는건 편리하지만 파일의 이름을 비교하거나 다른 잦ㄱ업은 하기 어려움
			File 원본파일 = new File(이미지폴더 + "동물이름.txt");
			File 새로운이름 = new File(이미지폴더 + "좋아하는동물이름.txt");
			
			if(원본파일.renameTo(새로운이름)) {
				System.out.println("파일이름 변경완료");
			} else {
				System.out.println("파일이름 변경실패");
			}
			
			// 삭제하기
			// 폴더 삭제 파일 삭제
			// 폴더 삭제를 할 때 폴더 안에 파일이 존재한다면 폴더 삭제가 되지 않음
			// -> 폴더안에 파일이 존재하는지 확인하고 폴더 안에 파일이 하나도 존재하지 않는다면 삭제
			// -> 폴더안에 파일 존재 여부 확인 방법
			// -> 배열을 이용해서 파일 목록을 받고 파일 목록이 없다면 삭제
			// 만약에 폴더가 열려있거나 사용중, 폴더안에 파일이 숨겨져있는경우 , 삭제권한문제 -> 폴더 삭제안됨!!
			File[] 파일목록 = 이미지폴더.listFiles();
			System.out.println("폴더안에 파일 목록 보기 : " + 파일목록); //
			
			// for-each
			for(File f :파일목록) {
				System.out.println("파일 목록 : " + f.getName());
			}
			
			원본파일.delete();
			새로운이름.delete();
			이미지폴더.delete();
			
		} catch (IOException e) {
			System.out.println("동물 이름 작성하는데 문제가 발생했습니다.");
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		FilePre 파일 = new FilePre();
		//파일.메서드1();
		//파일.메서드2();
		//파일.메서드3();
		//파일.메서드4();
		//파일.메서드5();
		파일.메서드6();
	}
}
