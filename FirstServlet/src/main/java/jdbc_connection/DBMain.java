package jdbc_connection;

public class DBMain {

	public static void main(String[] args) {
		BoardJDBC jdbcTester = new BoardJDBC();
		
		jdbcTester.selectOne(1);
	}

}
