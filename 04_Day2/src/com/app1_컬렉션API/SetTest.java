package com.app1_컬렉션API;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
			
		HashSet set = new HashSet();
		//데이터 저장
		set.add(1);
		set.add(1);
		set.add("홍길동");
		set.add(true);
		set.add(new Date());
		
		//데이터 출력
		//1. toString 이용
		System.out.println(set);
		
		//2. for문
		for (Object object : set) {
			System.out.println(object);
		}
		
		//3. Iterator API 활용 ==> 컬렉션에 저장된 데이터를 순회하면서 값을 조회하는 일관된 방식의 API
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			Object a = ite.next();
			if(a.equals("홍길동")) {
			System.out.println(a);
			}
		}
	}

}
