package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SubjectDAO {
	private Connection conn; //DB 커넥션 연결 객체
	private static final String DBID = "root"; //MySQL User ID
	private static final String DBPW = "root"; //MySQL User Password
	private static final String URL = "jdbc:mysql://localhost:3306/testdb";
	
	//DB 연결
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
	
	//한 행만 Select하는 예제
	public void selectOne(int subjectCode) {
		String sql = "select * from study where subjectCode = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, subjectCode); //1번째 ?에 subCode 삽입
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("subjectCode: " + rs.getInt("subjectCode"));
				System.out.println("subjectName: " + rs.getString("subjectName"));
				System.out.println("subjectContent: " + rs.getString("subjectContent"));
				System.out.println("prof: " + rs.getString("prof"));
			}
		} catch (Exception e) {
			System.out.println("Select 실패");
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(Exception e2) { }
		}
		
	}
}
