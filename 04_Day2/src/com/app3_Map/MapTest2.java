package com.app3_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		
		//다형성
		Map<String, String> map = new HashMap<String, String>();
		
		//데이터 저장
		map.put("1","홍길동");
		map.put("2","길동홍");
		map.put("3","동홍길");
		map.put("3","이순신");
		
		//삭제
		map.remove("2");
		//map.clear(); 전체 삭제
		//수정
		map.replace("3", "이재진");
		
		System.out.println("길이(갯수): " + map.size() );
		
		//데이터 출력
		System.out.println("1. toString: " + map);
		
		/*
		 * 	배열과 관련된 유틸리티 클래스 : Arrays
		 * 	컬렉션과 관련된 유틸리티 클래스 : Collections
		 * 
		 */
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		Map<String, ArrayList<String>> map3 = new HashMap<String, ArrayList<String>>();
		List<Map<Integer,Boolean>> xxx = new ArrayList<Map<Integer, Boolean>>();
				
	}

}
