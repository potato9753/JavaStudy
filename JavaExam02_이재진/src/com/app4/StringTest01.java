package com.app4;

public class StringTest01 {

	public static void main(String[] args) {
		String str = "I am second to none";
		String[] word = str.split(" ");
		int leng = 0;
		for (String string : word) {
			leng += string.length();
		}
		
		System.out.println("문자개수: " + leng);
		System.out.println("단어개수: " + word.length );
	}

}
