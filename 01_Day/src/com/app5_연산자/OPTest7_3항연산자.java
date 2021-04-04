package com.app5_연산자;

import java.util.Arrays;

public class OPTest7_3항연산자 {

	public static void main(String[] args) {
		
		int num = 4;
		int result = (num>5)?100:200;
		System.out.println(result);
		
		String str = "이재진";
		String name = (str=="홍길동")?"같다":"다르다";
		System.out.println(name);
				
	}

}
