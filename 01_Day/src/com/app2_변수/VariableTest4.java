package com.app2_변수;

public class VariableTest4 {

	public static void main(String[] args) {
		
		
		// 중복 불가
		
		int num = 10;
//		int num = 20;
		
		//로컬 변수 주의할 점 ==> 반드시 사용전에 초기화 해야한다.
		
		//int n;//선언
		int n = 0; //선언 및 초기화
		System.out.println(n);
		
		
		//자바의 변수는 블럭 스코프: {} 내에서만 사용가능하다.
		{
			int s = 10;
			System.out.println(s);
		}
		//System.out.println(s); 에러 발생
		{
			int s = 100; // 블럭이 달라 변수명을 동일하게 사용가능하다.
		}
	}

}
