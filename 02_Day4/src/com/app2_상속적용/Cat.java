package com.app2_상속적용;


//Cat is a Pet. Cat과 Pet 상속관계라고 할 수 있다.
public class Cat extends Pet {
	
	String color;

	public Cat() {
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//모두 반환
	public String getCat() {
		return name + "\t" + age + "\t" + color;
	}
	
	//Cat에만 있는 기능
	public void wash() {
		System.out.println("Cat.wash");
	}
	
}
