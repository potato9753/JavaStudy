package com.app1_예외;

class Test2{
	public void a() throws ArithmeticException,NullPointerException{
		b();
	}
	public void b() throws ArithmeticException,NullPointerException{
		// ArithmeticException
		int num = 0;
		int result = 10/num;
		System.out.println("결과 : " + result);
		
		// NullPointerException
		String name = null;
		System.out.println(name.length());
	}
}//end Test

public class ExceptionTest6 {

	public static void main(String[] args) {
			
		System.out.println("Start");
		
		Test t = new Test();
		try{
			t.a();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e){//Exception(예외클래스 최상위) -> RuntimeException -> ArithmeticException 다형성으로 인해 사용가능 하지만 권장 안함
			System.out.println(e.getMessage());
		}catch(Exception e){//Exception(예외클래스 최상위) -> RuntimeException -> ArithmeticException 다형성으로 인해 사용가능 하지만 권장 안함
			System.out.println(e.getMessage());
		}
		
		System.out.println("End");
	}

}
