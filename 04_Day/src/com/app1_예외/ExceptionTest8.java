package com.app1_예외;

class Parent{
	public void a() throws RuntimeException{
	}
}//end Parent

class Child extends Parent{
	//오버라이딩 메서드
	public void a() throws ArithmeticException{}
	
}

public class ExceptionTest8 {

	public static void main(String[] args) {
			
		System.out.println("Start");
		
		System.out.println("End");
	}

}
