package com.app1_예외;

class Test{
	public void a() throws ArithmeticException{
		b();
	}
	public void b() throws ArithmeticException{
		// ArithmeticException
		int num = 0;
		int result = 10/num;
		System.out.println("결과 : " + result);
					
	}
}//end Test

public class ExceptionTest7 {

	public static void main(String[] args) {
			
		System.out.println("Start");
		
		Test t = new Test();
		try{
			t.a();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("End");
	}

}
