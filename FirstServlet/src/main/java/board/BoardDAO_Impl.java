package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BoardDAO_Impl implements BoardDAO{

	@Override
	public List<BoardDTO> selectList(Connection conn) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<BoardDTO> res = new ArrayList<BoardDTO>();
		
		try {
			pstm = conn.prepareStatement(selectListSQL);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				BoardDTO tmp = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6));
				res.add(tmp);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public BoardDTO selectOne(Connection conn, int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Connection conn, BoardDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Connection conn, BoardDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Connection conn, int boardNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
