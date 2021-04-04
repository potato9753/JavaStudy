package com.app1_예외;

public class ExceptionTest3 {

	public static void main(String[] args) {
			
		System.out.println("Start");
		
		try {
			int num =0;
			int result = 10/num;
			System.out.println("결과 : " + result);
		}catch(Exception e){//Exception(예외클래스 최상위) -> RuntimeException -> ArithmeticException 다형성으로 인해 사용가능 하지만 권장 안함
			System.out.println("ArithmeticException Error");
		}
		
		
		System.out.println("End");
	}

}
