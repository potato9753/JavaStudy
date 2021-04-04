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
public class TestPet2 {

	public static void main(String[] args) {
		
		//2. 다형성 적용
		Pet [] pets = {new Cat("나비1",3,"블랙"),
					new Dog("두리",3,"수컷"),
					new Cat("나비2",5,"화이트"),
					new Dog("망치",2,"수컷"),
					new Cat("나비3",10,"레드")};
		
		//가. 모든 자식 출력
		for (Pet pet : pets) {
			System.out.println(pet); //pet.toString()
		}
		
		//나. Pet배열에서 Cat만 출력? ==> instanceOf 연산 타입 비교
		for (Pet pet : pets) {
			if(pet instanceof Cat) {
				System.out.println("Cat:"+pet);
			}
			
		//다. Pet배열에서 Cat의 wash메서드 호출?
		for (Pet pet2 : pets) {
			if(pet2 instanceof Cat) {
				Cat xxx = (Cat) pet2; 
				System.out.println(xxx.getColor());
			}
		}
		}
	}

}
