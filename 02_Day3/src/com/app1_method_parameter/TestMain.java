package com.app1_method_parameter;

class Cat{
	String name;
	int age;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
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
	
}

public class TestMain {

	public static void 기본형타입메서드(int num) {
		num = 20;
	}
	
	public static void 참조형타입메서드(Cat c) {
		c.setAge(20);
	}
	
	public static void main(String[] args) {
		
		//1. 기본형 : 값(실제값)이 전달할때는 전달받은 메서드에서 변경해도 원본값은 변경 안됨
		// call by value
		int x = 10;
		System.out.println("1. 값 전달 전 : " + x);
		기본형타입메서드(x);
		System.out.println("2. 값 전달 후 : " + x);
		
		//2. 참조형( 클래스, 배열 ) : 값(주소값)이 전달할 때는 전달받은 메서드에서 변경하면 원본 값이 변경된다.
		//call by reference
		Cat y = new Cat("나비",2);
		System.out.println("1. 값 전달 전 age 값: " + y.getAge());
		참조형타입메서드(y);
		System.out.println("2. 값 전달 후 age 값: " + y.getAge());
		
	}

}
