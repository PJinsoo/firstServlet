package jdbc_connection;

public class DBMain {

	public static void main(String[] args) {
		//게시판 연결 확인용
		BoardJDBC BDAO = new BoardJDBC();
		
		BDAO.selectOne(1);
	}
}
