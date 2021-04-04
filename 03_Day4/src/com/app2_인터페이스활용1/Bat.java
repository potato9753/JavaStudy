package com.app2_인터페이스활용1;

public class Bat extends Pet implements Flyer{

	//중요한 기능 추가 ==>
	@Override
	public void fly() {}
	
	public Bat() {
	}

	public Bat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}

}
