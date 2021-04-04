package com.app2_미적용;
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
 * 		==> 단일 상속만 지원
 * 		==> extends가 없는 클래스는 자동으로 extends Object가 추가된다.
 * 			(Object는 모든 클래스의 부모이다. 따라서 Object의 메서드를 모든 클래스는 사용할 수 있다.)
 * 
 * 
 */
public class TestPet {

	public static void main(String[] args) {

		Cat c = new Cat("나비",2,"Yellow");
		Dog d = new Dog("망치",1, "수컷");
		
		System.out.println(c.getPet());
		System.out.println(d.getPet());
	}

}
