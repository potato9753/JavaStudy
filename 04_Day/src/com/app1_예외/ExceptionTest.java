package com.app1_예외;

public class ExceptionTest {

	public static void main(String[] args) {
			/*
			 * 
			 * 	1. 예외(exception)?
			 * 		==> 실행중에 발생되는 의도하지 않는 문제
			 * 
			 * 	2. 예외 발생되면?
			 *	==> 프로그램이 비정상 종료 (실행중에 발생된 코드때문에 이후의 코드는 실행안됨)
			 * 
			 * 	3. 예외처리(exception handling)
			 *  ==>비정상되는 프로그램을 정상종료하도록 유도하는 작업을 의미하고
			 *  	개발자 입장에서 최고의 예외처리는 발생된 예외정보를 알려주는 것이다.
			 *  
			 *  4. 예외처리방법
			 *  
			 *  	가. 예외 클래스 제공
			 *  
			 *  		Throwable
			 *  	Error	|	Exception (예외 클래스의 최상위 클래스)
			 * 	
			 * 					Exception
			 * 		RuntimeException	|	IOException(SQLException)
			 * 				|
			 * 		NullPointerException	FileNotFoundException
			 * 		ArithmeticException
			 * 		ArrayIndexOutofBoundsException
			 * 		ClassCastException
			 * 		....
			 *	
			 *	예외 클래스 종류 2가지
			 *	a. 런타임 계열
			 *		- RuntimeException
			 *		- 컴파일 unchecked 계열 (컴파일러가 예외처리 여부 확인 안함)
			 *		- 예외처리 방법으로 예외를 처리하지 않기 때문이다.
			 *		     이유는 예외가 발생되면 안되는 코드이다.
			 *			발생되면 반성하자.
			 *
			 *	b. 비런타임 계열
			 *		- IOException(SQLException)
			 *		- 컴파일 checked 계열
			 * 
			 * 		나. try-catch문==> 예외가 발생된 곳에서 처리
			 * 
			 * 			try{
			 * 				실행문장;
			 * 				실행문장;
			 * 				...
			 * 			}catch(예외클래스명 e){
			 * 				예외발생시 처리하는 문장(사용자에게 알려주는 작업)
			 * 			}
			 * 		
			 * 		 ==> 예외처리시 catch 할 수 있는 전용 예외클래스를 사용해야 된다.
			 * 			단, 다형성 적용해서 부모 타입으로 catch 가능하지만 권장안함.
			 * 		다. throws 예외클래스 ==> 예외가 발생된 곳이 아닌 다른 곳으로 위임해서 처리
			 * 
			 * 	5. 다중 catch문
			 * 		
			 * 		try{
			 * 			실행문장1; //ArithmeticException 발생가능한 코드
			 * 			실행문장2; // NullPointerException 발생가능한 코드
			 * 			실행문장3; // 어떤 예외가 발생할 지 모르는 코드
			 * 			...
			 * 		}catch(ArithmeticException e){
			 * 			예외발생시 처리하는 문장(사용자에게 알려주는 작업)
			 * 		}catch(NullPointerException e){
			 * 			예외발생시 처리하는 문장(사용자에게 알려주는 작업)
			 * 		}catch(Exception e){ //관례로 다중 catch문 마지막은 Exception을 넣어준다.
			 * 			예외발생시 처리하는 문장(사용자에게 알려주는 작업)
			 * 		}
			 * 		
			 * 		- 주의할 점 : 반드시 계층 구조상 부모는 가장 마지막에 catch한다. (다형성, Exception)
			 * 
			 * 	6. finally문
			 * 	
			 * 		try{
			 * 			실행문장;
			 * 			실행문장;
			 * 			...
			 * 		}catch(예외클래스명 e){
			 * 			예외발생시 처리하는 문장(사용자에게 알려주는 작업)
			 * 		}finally{
			 * 			반드시 수행해야하는 문장(자원반납, 파일, DB)
			 * 		}
			 * 
			 * 
			 * 		try{
			 * 
			 * 		}finally{
			 * 
			 * 		}
			 * 
			 * 	7. throws 예외클래스, 예외클래스2
			 * 		==> 자신을 호출한 메서드로 예외처리를 위임하는 방식으로서
			 * 			main까지 위임시키고 마지막에 main에서 try-catch로 처리한다.
			 * 
			 * 		==> 오버라이딩 메서드 사용시 주의한다.
			 * 			- 부모 메서드명과 동일
			 * 			- 부모 메서드 리턴타입과 동일
			 * 			- 부모 메서드 파라미터와 동일
			 * 			- 접근지정자는 같거나 확대 가능
			 * 			- throws는 같거나 계층구조의 하위 기능
			 * 
			 * 	8. 명시적으로 예외 발생(강제적)
			 * 		==> 시스템이 예외로 보지 않기 때문에...
			 * 		==> 방법
			 * 			throw new 예외클래스명(mesg);  // 위임할때는 throws 명시적으로 발생시킬때는 throw
			 * 		==> 예외처리 필요하다.
			 * 		==> 발생시키는 이유는?
			 * 			==> 사용자가 개발한 어플리케이션에서 사용자가 임의의 조건위배시 예외라고 가정할 수 있다.
			 * 
			 */
	}

}
