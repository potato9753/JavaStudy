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
 * 
 * 	5. 활용
 * 		가. 다형성 적용한 배열
 * 
 * 		나. 다형성을 적용한 메서드 파라미터
 */


public class TestPet4 {

	public static void methodA(Object obj) {
		//문자열만 출력
		if(obj instanceof String) {
			System.out.println(obj);
			String s = (String)obj; // Object는 length가 없기에 형변환 필요
			System.out.println(s.length());
		}
		//제네릭스 활용하면 극복 가능
		
	}
	
	public static void main(String[] args) {

		methodA(10);
		methodA("홍길동");
		methodA(true);
		methodA(31.4);
	
	}

}
