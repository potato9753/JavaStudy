package com.app1_데이터타입;

public class DataTypeTest3_이스케이프문자 {

	public static void main(String[] args) {
		
		/*
		 * 	이스케이프 문자(escape)
		 * 
		 * 	\n : 키보드로 엔터친 효과(개행문자)
		 * 	\t : 키보드로 탭 친 효과
		 * 	\" : 쌍따옴표 출력
		 *  \' : 홑따옴표 출력
		 *  \\ : \를 출력할 때 사용 ==> 파일의 경로 지정시 주로 사용
		 *  
		 */
		
		System.out.println("HelloWorld");
		System.out.println("Hello\nWorld");
		System.out.println("Hello\tWorld");
		System.out.println("Hello\"World");
		System.out.println("Hello\'World");
		System.out.println("Hello\\World");
		System.out.println("c:\\\\temp");
		
	}

}
