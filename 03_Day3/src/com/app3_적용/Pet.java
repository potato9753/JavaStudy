package com.app3_적용;

// 모든 애완동물 클래스의 공통적인 속성 및 동작 정의하는 부모 클래스
public abstract class Pet {

	String name;
	int age;
	
	//자식에서 강제하고자 하는 메서드를 추상메서드로 지정
	public abstract void eat();
	
	public abstract void sleep();
	
	//모든 데이터 반환
	public String getPet() {
		return name+"\t"+age;
	}
	
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
	
}
