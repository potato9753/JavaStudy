package com.app5_연산자;

import java.util.Arrays;

public class OPTest3_대입연산자 {

	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 3;

		n2 += n;
		System.out.println(n + "\t" + n2);
		
		n2 -= n;
		System.out.println(n + "\t" + n2);

		n2 *= n;
		System.out.println(n + "\t" + n2);
		
		n2 /= n;
		System.out.println(n + "\t" + n2);
		
		n2 %= n;
		System.out.println(n + "\t" + n2);
	}

}
