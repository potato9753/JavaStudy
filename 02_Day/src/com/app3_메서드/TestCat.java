package com.app3_메서드;

public class TestCat {

	public static void main(String[] args) {
		
		Cat c = new Cat("나비",2,"암컷");
		
		//나이 변경
		c.setAge(3000);
		
		String name = c.getName();
		int age = c.getAge();
		String sex = c.getSex();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		
		//한꺼번에 여러값 변경
		c.setCat("나비2",3000);
		c.setCat(3,"나비3");
		name = c.getName();
		age = c.getAge();
		sex = c.getSex();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);

	}
	
	

}
