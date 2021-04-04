package com.app4_Object;

import java.util.Date;

public class TestMain {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동", 2, "서울");
	
		
		/*
		 * 
		 * 	참조변수값을 콘솔에 출력하기 위해서는
		 * 	자동으로 문자열로 변환해주는 메서드가 호출된다.
		 * 	Object의 toString()
		 * 
		 * 	대부분의 API는 모두 toString 메서드를 재정의하고 있다.
		 * 
		 * 
		 */
		
		System.out.println(p);
		System.out.println(p.toString());
		
		
		String s = "hello";
		System.out.println("s");
		
		Date d = new Date();
		System.out.println(d);
	}

}
