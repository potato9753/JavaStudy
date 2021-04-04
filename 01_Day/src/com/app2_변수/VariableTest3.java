package com.app2_변수;

public class VariableTest3 {

	public static void main(String[] args) {
		// 홍길동 20 서울 남 173.54 75.3 true
		
		//1. 변수 선언 + 초기화
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		char gender = '남';
		float height = 173.54F; // float형이라 F생략시 에러 발생
		double weight = 75.3;
		boolean isMarried = true;
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(isMarried);
		
	}

}
