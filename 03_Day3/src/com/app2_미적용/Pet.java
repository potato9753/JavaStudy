package com.app2_미적용;

// 모든 애완동물 클래스의 공통적인 속성 및 동작 정의하는 부모 클래스
public class Pet {

	String name;
	int age;
	

	public Pet() {
		// TODO Auto-generated constructor stub
	}
	
	public Pet(String name, int age) {
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
	
	public void eat( ) {
		System.out.println("Pet.eat");
	}
	
	
	public void sleep() {
		System.out.println("Pet.sleep");
	}
	
	//모든 데이터 반환
	public String getPet() {
		return name+"\t"+age;
	}
	
}
