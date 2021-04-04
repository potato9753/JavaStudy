package com.app4_배열;

import java.util.Arrays;

public class ArrayTest3_유틸리티 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 	배열과 관련된 유틸리티 클래스
		 * 	java.util.Arrays
		 * 
		 * 
		 */
		
		int[] num = {4,2,5,33,22,99,1};
		Arrays.sort(num);
		System.out.println("1. 정렬:"+ num); // @ 값 출력(사용불가)
		System.out.println("2. 배열 데이터 출력:"+ Arrays.toString(num)); // 배열 데이터 한꺼번에 출력
		
	}

}
