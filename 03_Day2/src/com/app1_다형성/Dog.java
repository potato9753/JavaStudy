package com.app1_다형성;

public class Dog extends Pet {
	
	String sex;

	public Dog() {
	}

	public Dog(String name, int age) {
		super(name,age);
	}

	public Dog(String name, int age, String sex) {
		super(name,age);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//Dog에만 있는 기능
	public void run() {
		System.out.println("Dog.run");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}

	@Override
	public String toString() {
		return "Dog [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
