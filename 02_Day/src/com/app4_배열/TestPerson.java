package com.app4_배열;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("홍길동1", 20, "광주");
		Person p2 = new Person("홍길동2", 30, "서울");
		Person p3 = new Person("홍길동3", 40, "수원");
		
		//person 배열
		
		Person [] person = {new Person("홍길동1", 20, "광주"),new Person("홍길동2", 30, "서울"), new Person("홍길동3", 40, "수원")};
		
		
		for (Person p : person) {
			System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getAddress());
		}
	}

}
