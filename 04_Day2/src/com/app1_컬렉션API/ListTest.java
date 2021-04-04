package com.app1_컬렉션API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//1.추가 (append 역할)
		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		System.out.println(list.toString());
		
		//2. 중간 삽입(insert)
		list.add(1, "GGGG");
		System.out.println(list.toString());
		
		//3. 수정
		list.set(0, "ZZZZ");
		System.out.println(list.toString());
		
		//4. 삭제
		list.remove(0);
		System.out.println(list.toString());
		list.remove("CCCC");
		System.out.println(list.toString());
		//list.clear(); 전체삭제
		
		System.out.println("크기: " + list.size());
		System.out.println("존재여부 : "+list.contains("AAAA"));
		System.out.println("값의 인덱스: " + list.indexOf("BBBB"));
		
		Object [] obj = list.toArray();
		System.out.println("배열로 변환:" + Arrays.toString(obj));
		
		System.out.println(list);
		
	}
}
