package com.app3_리뷰;

public class Fish extends Pet implements Swim {

	@Override
	public void swim() {
		System.out.println("Fish.swim");

	}

	@Override
	public void eat() {
		System.out.println("Fish.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Fish.sleep");
	}

}
