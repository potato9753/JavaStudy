package com.app1_예외;

public class ExceptionTest5 {

	public static void main(String[] args) {
			
		System.out.println("Start");
		
		try {
			// ArithmeticException
			int num = 0;
			int result = 10/num;
			System.out.println("결과 : " + result);
			
			// NullPointerException
			String name = null;
			System.out.println(name.length());
			
		}catch(ArithmeticException e){//Exception(예외클래스 최상위) -> RuntimeException -> ArithmeticException 다형성으로 인해 사용가능 하지만 권장 안함
			//System.out.println("ArithmeticException Error" + e.getMessage());
			e.printStackTrace(); //디버깅용으로 많이 쓴다.(에러 경로 등 다양한 정보를 알려줌)
		}catch(NullPointerException e){//Exception(예외클래스 최상위) -> RuntimeException -> ArithmeticException 다형성으로 인해 사용가능 하지만 권장 안함
			System.out.println("NullPointerException Error" + e.getMessage());
		}catch(Exception e){//Exception(예외클래스 최상위) -> RuntimeException -> ArithmeticException 다형성으로 인해 사용가능 하지만 권장 안함
			System.out.println("Exception Error" + e.getMessage());
		}finally {
			System.out.println("반드시 실행되는 문장");
		}
		/////////////////
		try {
			System.out.println("try");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("End");
	}

}
