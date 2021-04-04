package com.app1;

public class Parent {
	
	public int n1 = 10;    // 접근 제한이 없다.
	protected int n2 = 20; // 같은 패키지에서는 접근 가능
	int n3 = 30;           // 같은 패키지에서 접근 가능  
	private int n4 = 40;   // 자신만 접근 가능
	
}
