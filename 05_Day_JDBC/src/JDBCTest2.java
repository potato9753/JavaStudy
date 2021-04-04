import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 	JDBC( Java Database Connectivity)
 * 
 * 	1. 자바언어와 DB 연동시 사용되는 인터페이스 활용한 라이브러리
 * 		==> 모든 환경에서 일관되게 사용 가능 (웹 환경, 비웹 환경 등....)
 * 
 *  2. 전체적인 아키텍처
 *  
 *  	가. 비웹 환경(main 메서드 이용)
 *  	=> Main <---> Service <---> DAO <---> DB
 *  		=> ojdbc6_g.jar 등록방법은 build path 한다.
 *  
 *  	나. JSP/Servlet(web 환경)
 *  	=> Servlet <---> Service <---> DAO <---> DB
 * 
 * 		다. Sprint MVC (web 환경)
 * 		=> Controller <---> Service <---> DAO <---> DB
 * 
 * 	3. 드라이버(DB 회사에서 제공해준 클래스 파일들의 압축파일)
 * 		==> 벤더홈페이지 다운 또는 설치시 오컬에 설치됨
 * 
 * 	4. DB 접속하기 위한 4가지 정보 - DB마다 다르다. 
 * 		String driver = "oracle.jdbc.driver.OracleDriver";
 * 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 * 		String userid = "SCOTT";
 * 		String passwd = "TIGER";
 * 
 */
public class JDBCTest2 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";
		
		try {
			Class.forName( driver );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection( url, userid , passwd );
			
			String query = "insert into dept (deptno, dname, loc) values ( ?, ?, ?)";
			
			pstmt = con.prepareStatement( query );
			pstmt.setInt(1, 99); // 첫번째 ?에 99 설정
			pstmt.setString(2, "개발");
			pstmt.setString(3, "수원");
			
			int n = pstmt.executeUpdate( ); // DML 요청 , 자동으로 commit
			//rs = pstmt.executeQuery( ); //select 요청
			
			System.out.println("저장 갯수: " + n);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			//if( rs !=null) rs.close(); // ResultSet을 사용한 경우
			if( pstmt !=null) pstmt.close();
			if( con !=null) con.close();
			}catch(Exception e) {}
		}

		
		
		
	}//end main

}//end class
