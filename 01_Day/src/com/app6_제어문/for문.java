package com.app6_제어문;

import java.util.Scanner;

public class for문 {

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
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello"+i);
		}
		for (int i = 10; i < 15; i++) {
			System.out.println("world"+i);
		}
		for (int i = 10; i > 5; i--) {
			System.out.println("Happy"+i);
		}
		for (int i = 0,j=0; i < 5 && j<5 ; i++,j++) {
			System.out.println("world"+i+j);
		}
		
		//중첩 for문
		/*
		 *  2*1 = 2
		 *  2*2 = 4
		 *  ..
		 *  9*8 = 72
		 *  9*9 = 81
		 */
		
		for (int i = 2; i < 10; i++) {
			for (int j=1;j < 10; j++) {
				System.out.println(i+"*"+j +"=" + i*j);
			}
		}
		
		for (int i = 0; i < 10; i+=2) {
			System.out.println("KT"+i);
		}
		// for문은 반복 횟수 쉽게 예측 가능하다.
	}//end main

}//end class
