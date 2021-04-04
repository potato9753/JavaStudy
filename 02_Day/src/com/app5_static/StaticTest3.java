package com.app5_static;

public class StaticTest3 {
	
	//static 블럭 ==> 초기화 작업(파일 open) 할 때 주로 사용
	static {
		System.out.println("static 블럭"); // 별다른 선언없이 바로 사용가능
	}
	public void a() {
		System.out.println("초기화 작업");
	}
	public static void main(String[] args) {
		StaticTest3 s = new StaticTest3(); // new를 통해 선언하고 사용해야함
		s.a(); // new선언 후 사용
	}

}
