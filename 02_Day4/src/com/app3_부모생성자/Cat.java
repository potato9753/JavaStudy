package com.app3_부모생성자;

public class Cat extends Pet {

	public Cat() {
		super(); // 부모 클래스의 기본 생성자 호출, 명시적 호출 가능 반드시 첫라인
		System.out.println("Cat 생성자.");
		//super(); // 명시적 호출은 가장 처음에 해야한다. 아니면 에러 발생
	}
	
	public Cat(int n) {
		super(n); // 부모 클래스의 기본 생성자 호출, 명시적 호출 가능 반드시 첫라인
		System.out.println("Cat 생성자.");
		//super(); // 명시적 호출은 가장 처음에 해야한다. 아니면 에러 발생
	}
}
