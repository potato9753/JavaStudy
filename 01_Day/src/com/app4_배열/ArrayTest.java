package com.app4_배열;

public class ArrayTest {

	public static void main(String[] args) {

		/*
		 * 	* 데이터 저장 방법 3가지
		 * 
		 * 	1) 변수
		 * 		- 값 하나만 저장 가능
		 * 		- 변수는 중복불가 ==> 데이터 갯수만큼 변수가 필요하다.
		 * 					==> 데이터가 많을수록 데이터 관리가 어려워진다.
		 * 
		 * 	2) 배열(array)
		 * 
		 *	1. 용도 : 데이터 저장
		 * 	2. 단 하나의 변수명(배열명)으로 데이터 관리 가능하다.
		 * 	3. 배열 사용 방법 -1
		 * 
		 * 		가. 배열 선언
		 * 
		 *			데이터변수 [] 변수명;
		 *			ex. int [] num; , String [] names;
		 * 
		 * 			질문? n와 n2 차이점?
		 * 			int n; // 기본형 변수(실제값 저장)
		 * 			int []n2; //참조형 변수(주소값 저장)
		 * 
		 * 		나. 배열 생성
		 * 		
		 * 			변수명 = new 데이터타입[크기];
		 * 			ex. num = new int[3];
		 * 				names = new String[2];
		 * 		
		 * 		배열 사용 방법 -2
		 * 		
		 * 		int [] num = {10,20,30};
		 * 
		 * 		배열 사용 방법 -3 (1번+2번 혼합)
		 * 
		 * 		int [] num = new int[]{10,20,30}; //대괄호에 크기지정하면 안됨
		 * 
		 * 	3) 컬렉션 API
		 */
		
		int [] num;// 참조형 변수, 로컬 변수
		
		num = new int[3]; // new(인스턴스)
		
		System.out.println(num);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		num[0]=10;
		num[1]=20;
		num[2] = num[1] - num[0];
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println("배열길이:"+num.length);
		

	}

}
