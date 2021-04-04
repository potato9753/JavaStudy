package com.app6_제어문;

import java.util.Scanner;

public class while문 {

	public static void main(String[] args) {

		/*
		 * 	반복이 원하는 형태로 될려면 구성요소 3가지
		 * 
		 * 	ex. "Hello"을 5번 출력
		 * 
		 * 	가. 시작값
		 * 		1부터
		 * 		0부터
		 * 		100부터
		 * 		==> int n=1;		
		 * 	
		 * 	나. 시작값을 증가시키는  / 감소시키는 연산자(증감연산자)
		 * 		++n;
		 * 		--n;
		 * 
		 * 	다. 조건식
		 * 		==> 5번 출력하기 위한 조건식(n<6)
		 * 
		 */
		int n = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello"+i);
		}
		
		// while문은 반복횟수 예측이 힘들때 .. 주로 무한루프
		while (n<5) {
			System.out.println("Hello"+n);
			n++;
		}
	}//end main

}//end class
