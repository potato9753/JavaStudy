package com.app3_static_import;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static java.lang.Integer.MAX_VALUE;

public class TestMain {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt("10");
		String str = String.valueOf(100);
		int num1 = Integer.MAX_VALUE;
		
		// static 요소접근시 클래스명을 사용하지 말자. ==> 가독성이 떨어진다. 하지만 단순해서 안드로이드 개발시 자주 사용됨.
		int a = parseInt("10");
		String str2 = valueOf(100);
		int b = MAX_VALUE;
		
	}
}
