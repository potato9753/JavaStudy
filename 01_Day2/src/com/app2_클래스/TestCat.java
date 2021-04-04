package com.app2_클래스;

// Cat 관리(생성, 변수의 값 설정, 값 변경, 조회,....)역할
// 의 클래스 ==> 핸들링 클래스
public class TestCat {

	public static void main(String[] args) {
		// Cat클래스에 메모리에 올리는 작업==>객체생성
		/*
		 *		클래스명 변수명 = new 클래스명();
		 *
		 */
		Cat c = new Cat(); //c 참조형, new Cat() -> heap영역에 세가지 변수 생성
		
		//인스턴스변수 초기롸
		c.name = "나비";
		c.age = 2;
		c.sex ="암컷";
		
		//데이터 출력
		System.out.print(c.name);
		System.out.print(c.age);
		System.out.println(c.sex);
		
		
		Cat c2 = new Cat();
		
		c2.name = "망치";
		c2.age = 1;
		c2.sex ="수컷";
		
		//데이터 출력
		System.out.print(c2.name);
		System.out.print(c2.age);
		System.out.println(c2.sex);
	}

}
