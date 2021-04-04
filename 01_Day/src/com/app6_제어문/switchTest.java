package com.app6_제어문;

import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {

		/*
		 * 	다중 비교
		 * 
		 * 	가. 다중 if문
		 * 		==> ==을 비롯한 다양한 연산자 사용가능
		 * 
		 * 	나. switch문
		 * 		==> 내부적으로  == 비교
		 * 		==> break 만났을 때 {} 빠져나온다.
		 * 		==> break는 옵션 break 없으면 일치하는 케이스 아래로 전부 실행 (순차문이라서)
		 * 		==> 비교하는 데이터 종류가 정해져 있다.
		 * 			byte
		 * 			short
		 * 			int
		 * 			char
		 * 			String
		 * 			enum
		 */		
		
		int key = 80;
		switch (key) {
		case 90:
			System.out.println("90");
			
		case 80:
			System.out.println("80");
			
		case 70:
			System.out.println("70");
			
		default:
			System.out.println("default");
			
		}
		
		String s = "A";
		switch (s) {
		case "A":
			
			break;

		default:
			break;
		}
	}

}
