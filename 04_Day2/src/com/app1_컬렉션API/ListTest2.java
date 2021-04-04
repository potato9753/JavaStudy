package com.app1_컬렉션API;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		List list = new ArrayList(); //다형성
		
		list.add(1);
		list.add(1);
		list.add("홍길동");
		list.add(true);
		list.add(new Date());
		
		//데이터 출력
		//1. toString
		System.out.println("1. toString : " + list);
		
		//2. for문
		for (Object object : list) {
			System.out.println(object);
		}
		
		//3. Iterator API 활용
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

		//4. 위치값(index) 이용
		
		System.out.println("index" + list.get(0));
		System.out.println("index" + list.get(3));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
