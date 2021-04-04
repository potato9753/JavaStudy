package com.app4_배열;

import java.util.Arrays;

public class ArrayTest4_for문 {

	public static void main(String[] args) {
		
		int[] num = {4,2,5,33,22,99,1};
		String[] name = {"이","재","진"};
		
		//순회하면서 출력
		//1. 일반 for문 => 조건 지정 유의 인덱스와 길이 차이
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (String i : name) {
			System.out.println("<<<"+i);
		}
		//2. foreach문 ==> 향상된 for문
		for (int i : num) {
			System.out.println("<<<"+i);
		}
		
		//3. Arrays.toString()
		System.out.println(Arrays.toString(num));
		
	}//end main

}//end class
