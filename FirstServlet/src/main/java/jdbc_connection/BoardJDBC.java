package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//게시판 DB커넥터
public class BoardJDBC {
	public Connection conn; //DB 커넥션 연결 객체
	public static final String DBID = "root"; //MySQL User ID
	public static final String DBPW = "root"; //MySQL User Password
	public static final String URL = "jdbc:mysql://localhost:3306/boarddb";
	
	//DB 연결
	public BoardJDBC() {
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
	public void selectOne(int boardNO) {
		String sql = "select * from board where boardNO = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNO); //1번째 ?에 boardNO 삽입
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("boardNO: " + rs.getInt("boardNO"));
				System.out.println("title: " + rs.getString("title"));
				System.out.println("content: " + rs.getString("content"));
				System.out.println("writer: " + rs.getString("writer"));
				System.out.println("viewCount: " + rs.getString("viewCount"));
				System.out.println("postTime: " + rs.getString("postTime"));
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
