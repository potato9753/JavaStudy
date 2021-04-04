package com.app1_생성자;

public class TestPerson {

	public static void main(String[] args) {
			
		Person p = new Person("홍길동",29,"서울");
		System.out.println(p.name +"\t"+p.age+"\t"+p.address);
	}

}
