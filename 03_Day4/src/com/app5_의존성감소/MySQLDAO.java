package com.app5_의존성감소;

import java.util.Arrays;
import java.util.List;

public class MySQLDAO implements DBDao {

	@Override
	public List<String> list() {
		List<String> list =
				Arrays.asList("홍길동1","이순신1","유관순1");
		return list;
	}

}
