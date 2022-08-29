package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SubjectDAO {
	private Connection conn; //DB 커넥션 연결 객체
	private static final String DBID = "root"; //MySQL User ID
	private static final String DBPW = "root"; //MySQL User Password
	private static final String URL = "jdbc:mysql://localhost:3306/testdb";
	
	public SubjectDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, DBID, DBPW);
			System.out.println("드라이버 로딩 성공");
		} catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			try {
				conn.close();
			} catch (SQLException e1) { }
		}
	}
}
