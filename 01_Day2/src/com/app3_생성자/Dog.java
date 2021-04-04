package com.app3_생성자;

public class Dog {
	
	String name;
	int age;
	String sex;
	
	//오버로딩 생성자 : 하나의 클래스안에 여러 생성자
	public Dog() {
		System.out.println("Dog 기본생성자");
	}
	
	public Dog(int n) {
		System.out.println("Dog 생성자");
	}

	public Dog(String n, int n2, String n3) {
		this.name = n;
		this.age = n2;
		this.sex = n3;
	}

	public Dog(String n, int n2) {
		this.name = n;
		this.age = n2;
	}

	public Dog(String n, String n3) {
		this.name = n;
		this.sex = n3;
	}
	
}
