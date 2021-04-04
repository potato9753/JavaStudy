package com.app4_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		
		//수정 불가
		List<Integer> list = Arrays.asList(10,20,30,40,10);
		System.out.println(list);
		
		Stream<Integer> i = list.stream();
		//distinct 중복제거
		System.out.println(i.distinct().collect(Collectors.toList()));
		
		System.out.println(list.stream().count());
	}//end main

}//end class
