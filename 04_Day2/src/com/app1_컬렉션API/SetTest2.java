package com.app1_컬렉션API;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
			
		Set set = new HashSet(); //다형성 적용해서 Set을 HashSet으로 생성
		//데이터 저장
		set.add(1);
		set.add(1);
		set.add("홍길동");
		set.add(true);
		set.add(new Date());
		
		
		System.out.println("갯수: " + set.size());
		System.out.println("값 존재여부 : " + set.contains("홍길동"));
		System.out.println("값 존재여부 : " + set.contains("홍길동1"));
		
		Object [] obj = set.toArray();
		System.out.println("배열 출력: " + Arrays.toString(obj));
		
		set.remove("홍길동");
		set.clear(); // 모두 삭제
		
		
		//데이터 출력
		//1. toString 이용
		System.out.println(set);
		System.out.println(obj[1]);
	}

}
