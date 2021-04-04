package com.app2_상속적용2_오버라이딩메서드;


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

	//부모의 메서드를 자식이 필요에 의해서 재정의할 수 있다. ==> 오버라이딩메서드라고 부른다.
	@Override //어노테이션이라고 부른다. 기능은 지정된 메서드가 오버라이딩 메서드임을 알려주는 동시에 규칙에 맞게 오버라이딩 구현 가능하도록 지원.
	public void eat() {
		System.out.println("Cat.eat");
	}

	
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}
	
	
}
