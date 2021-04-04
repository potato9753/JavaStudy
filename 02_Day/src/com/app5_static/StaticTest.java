package com.app5_static;

class Outer{
	
	static class Inner{
		
		
	}
}
public class StaticTest {

	static int num; // static변수(클래스변수) ==> new 없이 사용가능
	int size; //인스턴스 변수 ==> 반드시 객체생성후 사용가능
	
	public void a() {}  // 인스턴스 메서드 ==> 반드시 객체생성후 사용가능, 참조변수.인스턴스메서드
	public static void b() {} //static 메서드 ==>new없이 사용가능
	
	public static void main(String[] args) {
		/*
		 * 
		 * 	static 키워드
		 * 
		 *  1. 사용
		 *  	- 클래스(중첩클래스만 가능)
		 *  	- 변수
		 *  	- 메서드
		 *  
		 *  2. 특징
		 *  
		 *  	- 객체생성없이 사용가능하다(**************)
		 *  	- 1번만 생성(인스턴스틑 new할 때 마다 생성)
		 *  	- 클래스명.static변수(메서드)
		 *  	- heap 메모리와 관련없이 Method Area 메모리와 관련(프로그램 실행할때 생성하고 종료할때 없어짐)
		 *  	- 프로그램 실행시 생성되니 깨문에 단 한번 생성
		 *  
		 *  3. 용도:
		 *  	가. static 변수 : 데이터 누적 용도로 사용한다. 프로그램 종료 전까지 저장할 필요
		 *  	나. static 메서드 : 객체 생성없이 사용할 목적
		 *  		ex. Integer.parseInt("10") ==> 10
		 *  			String.valueOf(값) ==> 문자열
		 *  			..
		 *  
		 */

	}

}
