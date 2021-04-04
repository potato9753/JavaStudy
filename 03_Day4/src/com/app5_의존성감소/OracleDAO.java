package com.app5_의존성감소;

import java.util.Arrays;
import java.util.List;

public class OracleDAO implements DBDao {

	@Override
	public List<String> list() {
		List<String> list =
				Arrays.asList("홍길동","이순신","유관순");
		return list;
	}

}
