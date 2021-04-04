package com.app4_Object;

public class Person {
	
	String name;
	int age;
	String address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//getPerson없이
	@Override
	public String toString() {
		return name + "\t" +age + "\t"+address;
	}
	
}
