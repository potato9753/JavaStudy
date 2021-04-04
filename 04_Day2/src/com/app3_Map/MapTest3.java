package com.app3_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		
		//key/value 쌍으로 저장시 문자열에 최적화된 Map계열이 Properties
		
		Properties prop = new Properties();
		
		prop.setProperty("1","홍길동");
		prop.setProperty("2","고길동");
		prop.setProperty("3","김을동");
		
		//데이터 출력
		System.out.println(prop.getProperty("2"));
		
		//////////////////////////////////////
		// 시스템의 환경변수 출력
		Properties env = System.getProperties();
		Set<String> keys = env.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+" : "+ env.getProperty(key));
		}
	}

}
