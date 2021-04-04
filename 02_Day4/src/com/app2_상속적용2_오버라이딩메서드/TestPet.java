package com.app2_상속적용2_오버라이딩메서드;
/*
 * 	상속(ingeritance)
 * 
 * 	1. 목적: 부모의 요소를 자식이 재사용
 * 	2. 방법: 
 * 
 * 		가. 일반화
 * 		나. 구체화
 * 
 * 	3. 상속관계?
 * 		==> 반드시 is a 관계가 성립되어야 한다.(같은 종류)
 * 		==> UML로는 삼각형의 실선
 * 		==> Java code로는 extends 키워드로 표현
 * 
 * 	4. 특징
 * 		==> 상속불가요소( 부모 생성자, private 요소)
 * 		==> 단일 상속만 지원
 * 		==> extends가 없는 클래스는 자동으로 extends Object가 추가된다.
 * 			(Object는 모든 클래스의 부모이다. 따라서 Object의 메서드를 모든 클래스는 사용할 수 있다.)
 * 
 * 	5. 오버라이딩 메서드(overriding method)
 * 		개념: 부모의 메서드를 자식이 재정의
 * 		규칙 : 
 * 			- 부모의 메서드명과 동일
 * 			- 부모의 메서드의 인자리스트와 동일
 * 			- 부모의 메서드 리턴타입과 동일
 * 			- 접근지정자는 부모의 접근지정자와 같거나 확대 형태로 사용 가능
 * 			- 예외 클래스는 부모의 예외클래스와 같거나 축소 형태로 사용 가능
 * 		@Override 어노테이션이 지원된다.
 * 
 * 
 */
public class TestPet {

	public static void main(String[] args) {

		Cat c = new Cat("나비",2,"Yellow");
		Dog d = new Dog("망치",1, "수컷");
		Pet p = new Pet("재진", 28);
		
		System.out.println(c.getCat());
		System.out.println(d.getDog());
		System.out.println(c.getPet());
		System.out.println(d.getPet());
		System.out.println(p.getPet());
		c.eat();
		c.sleep();
		d.eat();
		d.sleep();
		
		
	}

}
