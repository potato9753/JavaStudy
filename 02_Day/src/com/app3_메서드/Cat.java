package com.app3_메서드;

public class Cat {

	
	//1. 인스턴스 변수 : 데이터 저장
	private String name;
	private int age;
	private String sex;
	public Cat() {
	}
	 
	//2. 생성자 : 인스턴스 변수 초기화
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	//3. 메서드 : 인스턴스 변수 값 변경 및 조회
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
		if(age > 15) {
			System.out.println("나이가 잘못 입력 되었습니다.");
		}
		else {
		this.age = age;
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//추가적인 메서드 제공
	
	//오버로딩 메서드
	public void setCat(String name, int age) {
		this.name = name;
		if(age > 15) {
			System.out.println("나이가 잘못 입력 되었습니다.");
		}
		else {
		this.age = age;
		}
	}
	
	public void setCat(int age, String name) {
		this.name = name;
		if(age > 15) {
			System.out.println("나이가 잘못 입력 되었습니다.");
		}
		else {
		this.age = age;
		}
	}
	
	//검증작업 메서드
	
	private boolean ageCheck(int age) {
		boolean result = false;
		if(age>20) {
			result = true;
		}
		return result;
	}
	
	public String getCat() {
		return 
	}
	/*
	 * 
	 * OOP 3대 특징
	 * 
	 * 1.상속
	 * 2.다형성
	 * 3.은닉화(캡슐화)
	 * 	- private, public 활용
	 * 		ex. Cat의 변수를 private : Cat 자신이 데이터를 보호
	 * 			Cat의 ageCheck메서드 private: 외부클래스입장에서 복잡성 감소
	 */
}
