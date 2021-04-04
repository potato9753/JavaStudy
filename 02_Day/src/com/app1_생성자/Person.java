package com.app1_생성자;

public class Person {
	
	String name; // 인스턴스 변수
	int age;
	String address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String address) { //로컬 변수 name
		/*
		 * this는
		 * 	==> heap 메모리에 올라간 자신의 인스턴스를 탐조하는 키워드이다.
		 *  ==> 용도 : 로컬변수와 인스턴스 변수명이 동일한 경우에 this를 사용해서 인스턴스를 참조하도록 한다.
		 */
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
}
