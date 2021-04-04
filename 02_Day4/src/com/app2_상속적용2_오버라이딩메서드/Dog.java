package com.app2_상속적용2_오버라이딩메서드;

public class Dog extends Pet {
	
	String sex;

	public Dog() {
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//모든 정보 반환
	public String getDog() {
		return name + "\t" + age + "\t" + sex;
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
