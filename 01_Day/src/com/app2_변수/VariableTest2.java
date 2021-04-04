package com.app2_변수;

public class VariableTest2 {

	public static void main(String[] args) {
		// 홍길동 20 서울 남 173.54 75.3 true
		
		//1. 변수 선언
		String name;
		int age;
		String address;
		char gender;
		float height;
		double weight;
		boolean isMarried;
		
		//2. 변수 초기화
		name = "홍길동";
		age = 20;
		address = "서울";
		gender = '남';
		height = 173.54F; // float형이라 F생략시 에러 발생
		weight = 75.3;
		isMarried = true;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(isMarried);
		
	}

}
