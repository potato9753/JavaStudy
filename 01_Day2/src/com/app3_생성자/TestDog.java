package com.app3_생성자;
/*
 * 		생성자
 * 	
 * 	1. 용도 : 인스턴스 변수 초기화
 * 	2. 형태 
 * 		
 * 		public 클래스명([변수,변수2]){} // []는 있을수도 있고 없을수도 없다는 의미
 * 
 * 	3. 특징
 * 		- 반드시 호출해야 실행된다. 
 * 		- 호출이 끝나면 돌아온다.
 * 		- 호출 방법: new 클래스명();
 * 		- 명시적으로 작성하지 않으면 자동으로 기본생성자를 생성해준다. 단, 명시적으로 만들면 기본생성자는 자동생성안됨.
 * 		- 기본생성자 문법: public 클래스명(){}
 * 
 * 	4. 오버로딩 생성자 : 하나의 클래스안에 여러 생성자를 지정 가능한 생성자로서 반드시 인자리스트가 달라야한다.(변수의 갯수, 변수의 타입, 변수의 순서)
 * 					==> 다양한 형태로 객체생성 방법 제공
 * 
 */
public class TestDog {

	public static void main(String[] args) {
		
		Dog d = new Dog("나비", 2,"암컷");
		Dog d2 = new Dog("망치",1);
		Dog d3 = new Dog("뭉치","수컷");
		
		System.out.println(d.name+"\t"+d.age+"\t"+d.sex); // 나비 2 암컷
		System.out.println(d2.name+"\t"+d2.age+"\t"+d2.sex); // 망치 1 null
		System.out.println(d3.name+"\t"+d3.age+"\t"+d3.sex); // 뭉치 0 수컷
	}

}
