package com.app6_제어문;

import java.util.Scanner;

public class if문 {

	public static void main(String[] args) {

		// 단일 if문: 조건이 참인 경우에만 실행하고자 할 때
		System.out.println("1");
		if (3 == 31) {
			System.out.println("2");
			System.out.println("3");
		}
		System.out.println("4");
		System.out.println("end");

		// if-else문 : 조건이 참인 경우와 거짓인 경우 실행문장이 다른 경우

		System.out.println("10");
		if (1 == 21) {
			System.out.println("20");
			System.out.println("30");
		} else {
			System.out.println("40");
			System.out.println("end2");
		}
		
		// 다중 if문 : 
		/*
		 *  100~90 : A
		 *  90~80 : B
		 *  80~70 : C
		 *  이외 : F
		 */
		
		//키보드 입력 받기 : 
		// java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력");
		String name = scan.nextLine();
		System.out.println("점수 입력");
		int num = scan.nextInt();
		
		if(num >= 90 ) {
			System.out.println("A");
		}else if(num>=80) {
			System.out.println("B");
		}else if(num>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		System.out.println(name);
	}

}
