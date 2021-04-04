package com.app3_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		//데이터 저장
		map.put("1","홍길동");
		map.put("2","길동홍");
		map.put("3","동홍길");
		map.put("3","이순신");
		//데이터 출력
		
		//1. toString() 이용
		System.out.println("1. toString: " + map);
		
		
		//2.key 이용
		System.out.println("2. key 이용:" + map.get("1"));
		System.out.println("2. key 이용:" + map.get("4")); // null
		
		//key 반환
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key+" = "+map.get(key));
		}
		
		//value만 반환
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
	}

}
