package com.app5_연산자;

import java.util.Arrays;

public class OPTest5_증감연산자 {

	public static void main(String[] args) {
		
		int n = 10;
		++n;
		System.out.println(n);
		
		int n2 = 10;
		n2++;
		System.out.println(n2);
		
		//증감 연산자 사용시 주의할 점 ==> 다른 연산자와 같이 사용시
		
		int k = 10;
		int k2 = ++k; //==> 전치는 먼저 증가하고 할당
		System.out.println(k+"\t"+k2);
		
		int z =10;
		int z2 = z++; //==> 후치는 할당하고 증가
		System.out.println(z+"\t"+z2);
		
	}

}
