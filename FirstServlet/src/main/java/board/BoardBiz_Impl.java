package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import board.JDBCTemplate;

public class BoardBiz_Impl implements BoardBiz{
	private BoardDAO dao = new BoardDAO_Impl();
	
	//수정필요
	JDBCTemplate jdbc = new JDBCTemplate();
	
	@Override
	public List<BoardDTO> selectList() {
		
		//수정 필요
		Connection conn = jdbc.getConnection();
		List<BoardDTO> res = dao.selectList(conn);
		return res;
	}

	@Override
	public BoardDTO selectOne(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(BoardDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(BoardDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int boardNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
