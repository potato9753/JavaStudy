package com.app1_상속미적용;

public class Cat {
	
	String name;
	int age;
	String color; // Cat만 있는 속성
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//모두 반환
	public String getCat() {
		return name + "\t" + age + "\t" + color;
	}
	
	public void eat( ) {
		System.out.println("Cat.eat");
	}
	
	public void sleep() {
		System.out.println("Cat.sleep");
	}
	//Cat에만 있는 기능
	public void wash() {
		System.out.println("Cat.wash");
	}
}
