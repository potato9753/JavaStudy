package com.app1_인터페이스2;

interface X{}
interface Y{}
interface Z extends X,Y{} // 인터페이스간에는 다중 상속 가능

interface A{}
interface Flyer{
	
	public static final int NUM = 20; //객체생성없이 편하게 사용하기 위해 static을 준다.
	int SIZE = 20; // 자동으로 public static final 지정된다.
	
	public abstract void methodA();
	public void methodB();
	void methodC(); // 자동으로 public abstract 지정된다. 하지만 권장하지 않는다.
	
	public default void methodD() { //default 메서드는 인터페이스에서만 사용가능, 인스턴스 메서드는 클래스에서만 사용가능
		System.out.println("default.methodD()");
	}
	
	public static void methodE() {
		System.out.println("static.methodE()");
	}
	
}

//Bird 클래스와 Flyer 인터페이스 관계는 구현 관계
class Bird extends Object implements Flyer,A{

	@Override
	public void methodA() {}

	@Override
	public void methodB() {}

	@Override
	public void methodC() {}
	
}

class Airplane implements Flyer{

	@Override
	public void methodA() {}

	@Override
	public void methodB() {}

	@Override
	public void methodC() {}
	
}

public class TestMain {
	
	public static void main(String[] args) {
		
		//Flyer f = new Flyer(); 객체생성 불가
		//다형성 가능
		Flyer f = new Bird();
		Bird b = new Bird();
		b.methodA();
		b.methodB();
		b.methodD(); // default 메서드는 객체생성후 사용가능
		Flyer.methodE(); // static 메서드는 interface명으로 접근
		System.out.println(b.NUM);
		System.out.println(b.SIZE);
		//b.NUM = 10; 상수 변경 불가
	}
}
