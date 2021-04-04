package com.app3_리뷰;

public class Bird extends Pet implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bird.fly");
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
