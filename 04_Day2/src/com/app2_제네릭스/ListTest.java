package com.app2_제네릭스;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		
		//홍길동 이순신 유관순 이름 저장
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		System.out.println(list);
		
		for (String string : list) {
			System.out.println(string.length());
		}
		
		for (Object object : list) {
			System.out.println(((String)object).length());
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(((String)list.get(i)).length());
		}
	}

}
