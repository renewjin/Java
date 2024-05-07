package com.kh.practice.dimension;

import java.util.Random;

public class DimensionPractice {

	public void practice1() {
		// 3행 3열 짜리 문자열 배열을 선언 및 할당
		// 인덱스 0행 0열 부터 2행 2열까지 차례대로 접근하여 "(0,0)"과 같은 형식으로 저장후 출력
		String [][] stringArray = new String[3][3];
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	stringArray[i][j] = "(" + i + ", " + j + ")";
            }
        }
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	System.out.println(stringArray[i][j]);
            }
        }
	}
	
	public void practice2() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당
		// 1. 1~16까지 값을 차례대로 저장
		// 2. 저장된값들을 차례대로 출력
		
		int [][] intArray = new int[4][4];
		
		int k = 1;
		for(int i = 0; i<intArray.length; i++) {
			for(int j = 0; j<intArray.length; j++) {
				intArray[i][j] = k;
				k++;
			}
		}
		
		for (int i = 0; i<intArray.length; i++) {
            for (int j = 0; j<intArray.length; j++) {
            	System.out.print(intArray[i][j] + "\t");
            }
            System.out.println("");
        }
	}
	
	public void practice3() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당
		// 16 ~ 1 과 같이 값을 거꾸로 저장
		
		int [][] intArray = new int[4][4];
		
		int k = 16;
		for (int i = 0; i<intArray.length; i++) {
			for (int j = 0; j<intArray.length; j++) {
				intArray[i][j] = k;
				k--;
			}
		}
		
		for (int i = 0; i<intArray.length; i++) {
			for (int j = 0; j<intArray.length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public void practice4() {
		// 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행2열까지는 1~10까지의 임의의 정수값 저장
		// 3열은 행들의 값, 3행은 열들의 합
		Random random = new Random();
		
		int [][] intArray = new int [4][4];
		
		
		
		for (int i = 0; i < intArray.length; i++) {
			int rawSum = 0;
			for (int j = 0; j < intArray.length; j++) {
				int randomNum = random.nextInt(11);
				if (i != intArray.length -1 && j != intArray.length -1) {
					intArray[i][j] = randomNum;
					rawSum += intArray[i][j];
				}
				
				if (j == intArray.length -1) {
					intArray[i][j] = rawSum;
				}
			}
		}
		
		for (int i = 0; i<intArray.length; i++) {
			for (int j = 0; j<intArray.length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}
	
}
