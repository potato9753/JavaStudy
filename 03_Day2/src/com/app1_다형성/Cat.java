package com.app1_다형성;


//Cat is a Pet. Cat과 Pet 상속관계라고 할 수 있다.
public class Cat extends Pet {
	
	String color;

	public Cat() {
	}

	public Cat(String name, int age) {
		super(name,age);
	}

	public Cat(String name, int age, String color) {
		super(name,age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Cat에만 있는 기능
	public void wash() {
		System.out.println("Cat.wash");
	}

	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}

	
}
