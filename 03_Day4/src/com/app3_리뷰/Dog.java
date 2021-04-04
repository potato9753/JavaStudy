package com.app3_리뷰;

public class Dog extends Pet {

	String run;
	
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Dog(String run) {
		this.run = run;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Dog [run=" + run + ", name=" + name + ", age=" + age + "]";
	}

}
