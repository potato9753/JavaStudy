package com.app6_제어문;

import java.util.Scanner;

public class while문2 {

	public static void main(String[] args) {

		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("이름 입력");
			String name = scan.nextLine();
			System.out.println("입력된 이름:" + name);
			if(name.equalsIgnoreCase("이재진")) {
				System.out.println("정답");
				break;
			}
		}
	}//end main

}//end class
