package com.app2_메서드;

public class TestCat {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		c.name = "나비";
		c.age = 2000; // 논리적인 문제 발생
		c.sex = "암컷";
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
	}

}
