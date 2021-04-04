package com.app2_parent;

public class Parent {
	
	public int n1 = 10;    // 접근 제한이 없다.
	protected int n2 = 20; // 같은 패키지에서는 접근 가능, 패키지가 달라도 상속관계면 접근 가능
	int n3 = 30;           // 같은 패키지에서 접근 가능, 패키지가 다르면 접근 불가  
	private int n4 = 40;   // 자신만 접근 가능
	
}
