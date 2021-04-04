package com.app4_의존성증대;

import java.util.List;

/*
 * 	DB연동(JDBC)
 * 
 * 	1. 아키텍처
 * 
 * 		main클래스 <---> Service클래스 <---> DAO 클래스 <---> DB(오라클, mysql, ..)
 * 	
 * ex. TestMain <---> DBService <---> OracleDAO <---> OracleDB
 * 
 * 								<---> MySQLDAO <---> MySQL
 * 
 */


public class TestMain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
		service.setDB(new MySQLDAO());
		//service.setDB(new OracleDAO()); DB 변경시 DAO클래스와 Service클래스를 변경해야 사용 가능하다
		List<String> list = service.list();
		System.out.println(list);
		
	}

}
