package com.app2_메서드;
/*
 * 	접근지정자 (access modifier)
 * 	==> 여러 클래스간의 접근을 통해서 어플리케이션이 개발이 되는데,
 * 		보안 및 무결성 보장 그리고 복잡성 감소를 위한 목적으로 사용된다.
 *											UML표기법 
 * 		public : 접근 제한이 없다.                  + 
 * 		protected :                            #
 * 		default :                      
 * 		private : 외부에서 접근 불가 자신만 접근 가능             -
 * 
 * 
 */
public class Cat {

	private String name;  // UML표기법 : -name:String 
	private int age;
	private String sex;
	public Cat() {
		
	}
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void setName(String n) {
		name = n;
		
	}
	public String getName() {
		return name;
	}
	
}
