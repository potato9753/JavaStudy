package com.app1_다형성;
/*
 *	다형성(polymorphism)
 *
 *	1. 상속전제
 *	2. 개념 :
 *		- 하나의 참조변수가 다른 타입의 인스턴스를 참조할 수 있는 능력
 *			(부모타입으로 자식을 참조하는 능력)
 * 	3. 목적: 재사용
 * 	4. 단점:
 * 		- 하나의 변수에 모든 데이터를 저장하기에는 매우 효율적이다.
 * 		- 문제는 부모에는 없고 자식에만 추가된 요소접근은 불가능하다.
 * 			==>형변환으로 해결가능
 * 
 */
public class TestPet {

	public static void main(String[] args) {

		//1. 다형성 적용 안 한 형태
		Cat c = new Cat("나비",2,"Yellow");
		Dog d = new Dog("망치",1, "수컷");
		
		//2. 다형성 적용한 형태
		Pet p = new Cat("나비",2,"Yellow");
		System.out.println(p);
		//p.wash(); wash는 자식에만 추가된 요소이기 때문에 에러 발생
		Cat xxx = (Cat)p; //wash 사용을 위한 Cat 형변환
		xxx.wash();
		p = (Pet)xxx;
		
		p = new Dog("망치",1, "수컷");
		System.out.println(p);
		//p.run(); run은 자식에만 추가된 요소이기 때문에 에러 발생
		Dog yyy = (Dog)p;
		yyy.run();
		
	}

}
