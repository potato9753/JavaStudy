package com.app5_의존성감소;

import java.util.List;

public class DBService {
	DBDao dao;
	
	public void setDB(DBDao dao) {
		this.dao = dao;
	}
	
	public List<String> list() {
		return dao.list();
	}
}
