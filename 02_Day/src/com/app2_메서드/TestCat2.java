package com.app2_메서드;

public class TestCat2 {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		//메서드
		//1. setter 메서드 : 값을 설정(set)하는 메서드
		c.setName("나비");
		
		//2. getter 메서드 :값을 조회(get)하는 메서드
		String name = c.getName();
		System.out.println(name);
	}
	/*
	 * 	메서드(method)
	 * 
	 * 	1. 용도 : 기능 처리
	 * 	2. 문법
	 * 
	 * 		public 리턴타입 메서드명([변수, 변수2]){
	 * 			문장;
	 * 			[return 값;]
	 * 		}
	 * 
	 * 	3. 특징
	 * 		가. 반드시 호출해야 되고 실행 후 호출한 곳으로 돌아온다.
	 * 		나. 호출하는 방법은 반드시 객체 생성후에 참조변수.메서드 형식으로 호출한다.
	 * 
	 * 	4. 종류 4가지
	 * 		- 변수없고 반환값 없다.
	 * 		- 변수있고 반환값 없다.(*)
	 * 		- 변수없고 반환값 있다.(*)
	 * 		- 변수있고 반환값 있다.(*)
	 * 
	 * 
	 * 
	 * 
	 */
}
