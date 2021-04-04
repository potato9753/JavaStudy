package com.app5_연산자;

import java.util.Arrays;

public class OPTest6_논리연산자 {

	public static void main(String[] args) {
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true); // 노란색 밑줄 이유는 앞이 false이기 때문에 뒤에는 실행 안됨
		System.out.println(false&&false); // 노란색 밑줄 이유는 앞이 false이기 때문에 뒤에는 실행 안됨
		
		System.out.println(true||true); // 노란색 밑줄 이유는 앞이 true이기 때문에 뒤에는 실행 안됨
		System.out.println(true||false); // 노란색 밑줄 이유는 앞이 true이기 때문에 뒤에는 실행 안됨
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println(!true);
		System.out.println(!false);
		
		//문제: num값이 20보다 크거나 30보다 작냐
		
		int num = 10;
		System.out.println(num>20 || num<30);
	}

}
