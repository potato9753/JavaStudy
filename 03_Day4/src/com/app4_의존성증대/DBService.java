package com.app4_의존성증대;

import java.util.List;

public class DBService {
	MySQLDAO dao;
	
	public void setDB(MySQLDAO dao) {
		this.dao = dao;
	}
	
	public List<String> list() {
		return dao.list();
	}
}
