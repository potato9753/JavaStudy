package com.app3_적용;

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
	
	@Override//모든 정보 반환
	public String getPet() {
		return super.getPet() + "\t" + sex;
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
	
}
