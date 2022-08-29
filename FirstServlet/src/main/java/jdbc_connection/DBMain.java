package jdbc_connection;

public class DBMain {

	public static void main(String[] args) {
		SubjectDAO subDAO = new SubjectDAO();
		
		subDAO.selectOne(1);
	}

}
