package com.app5_static;

import java.util.Calendar;

public class StaticTest4 {
	
	public static void main(String[] args) {
		
		// API : 시스템이 제공하는 클래스 의미
		
		//1. "10" --> 10
		String x = "10";
		int num = Integer.parseInt(x);
		System.out.println(x+100); //문자열과 비문자열의 + 연산은 연결되어 반환
		System.out.println("1. 문자열 형태의 정수값을 실제 정수값으로 변경 :"+num);
		
		
		//2. 비문자열 --> 문자열
		String s = String.valueOf(true);
		String s2 = String.valueOf(10);
		String s3 = String.valueOf('a');
		String s4 = String.valueOf(new char[] {'a','b'});
		String s5 = String.valueOf(3.41);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		//날짜
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); // month는 0~11로 관리한다.
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
	
	}

}
