package com.app4_배열;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int [] num = {10,20,30};
				
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println("배열길이:"+num.length);

		int [] arr;
		arr = new int[num.length];
		arr[0] = 1;
		
		System.out.println(arr[0]);
		
		int [] num2 = new int[] {10,20,30,40};
		
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		System.out.println(num2.length);
	}

}
