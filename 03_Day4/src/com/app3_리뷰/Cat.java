package com.app3_리뷰;

public class Cat extends Pet {
	
	String color; // 고유한 속성
	
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}

	
}
