package com.app3_데이터변환;

public class TypeCast2 {

	public static void main(String[] args) {
		
		//a 경우
		byte b =10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		
		// b 경우
		char c = 'A';
		int c2 = c; // 아스키코드값
		System.out.println(c2);
		
		char x = 'a';
		int x2 = x;
		System.out.println(x2);
		
		System.out.println('a'+1); // 연산 가능하다. ( 산술 연산 및 비교 연산 가능)
		System.out.println('a'>100);
		
		// c 경우
		short s1 = 10;
		short s2 = 20;
		//short s3 = s1 + s2; 에러 발생
		int s4 = s1 + s2;
		short s5 = (short)(s1+s2);
		
		//d 경우
		int k = 10;
		float k2 = 4.2f;
		double result = k + k2; // 큰 타입과 작은 타입 연산은 큰 타입으로 반환된다.
		System.out.println(result);
	}

}
