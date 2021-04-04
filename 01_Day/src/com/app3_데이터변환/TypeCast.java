package com.app3_데이터변환;

public class TypeCast {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 	데이터 형변환
		 * 
		 * 	가. 묵시적 형변환(자동)
		 * 	
		 * 		a. byte > short > int > long > float > double (작은 타입 > 큰 타입)
		 * 		b. char > int (문자 > 정수)
		 * 			==> 문자가 연산 가능
		 * 		c. int보다 작은 타입의 연산결과는 int로 반환된다.
		 * 			ex. short s = 10;
		 * 				short s2 = 20;
		 * 				short s3 = s + s2; // 에러 2바이트 + 2바이트 = 4바이트(int)
		 * 
		 * 		d. 큰 타입과 작은 타입 연산결과는 큰 타입으로 반환
		 * 
		 * 
		 * 	나. 명시적 형변환(강제)
		 * 	
		 * 		형변환 연산자 : (데이터 타입) 변수명;
		 * 		
		 * 
		 * 	중요한 점은 기본형 뿐만 아니라 참조형(클래스)도 형변환이 가능하다. ==> 상속 전제
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
