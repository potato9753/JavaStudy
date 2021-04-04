package com.app6_제어문;

public class 제어문 {

	public static void main(String[] args) {
		/*
		 * 	문장
		 * 
		 * 	가. 실행문
		 * 		- 순차문 : main 메소드 첫라인부터 순서대로 실행되는 문장.
		 * 		- 제어문 : 
		 * 			a. 분기문(조건문)
		 * 				단일 if문
		 * 				if-else문
		 * 				다중 if문
		 * 				switch문
		 * 
		 * 			b. 반복문
		 * 				for문, foreach문(배열,컬렉션)
		 * 				while문
		 * 				do-while문
		 * 				==> 반복문에서 사용 가능한 2가지 키워드
		 * 					break문 : 반복문을 빠져 나올 때
		 * 					continue문 : {}안의 반복되는 문장들 중에서 임의의 skip 할 때
		 * 					ex.
		 * 						while(num<5){
		 * 							System.out.println("1");
		 * 							if(num==3)continue;
		 * 							System.out.println("2");
		 * 							System.out.println("3");
		 * 						}
		 * 
		 * 	나. 비실행문
		 * 		- 주석문
		 * 			: 단일 주석문 //
		 * 			: 멀티 주석문 /* 
		 * 
		 */
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("1");
			if(i==2) {
				System.out.println("continue");
				continue;
			}
			System.out.println("2");
			System.out.println("3");
		}
	}

}
