package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BoardServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		//요청받을 변수
		String command = request.getParameter("command");
		BoardBiz biz = new BoardBiz_Impl();
		
		//클라이언트의 요청이 "main"
		if(command.equals("main")) {
			//biz의 selectList 메소드에서 리턴될 값을 받을 변수
			List<BoardDTO> list = biz.selectList();
			request.setAttribute("list", list);
			
			//main.jsp로 이동, forward 방식
			dispatch("main.jsp", request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	//dispatcher -> forward 방식
	//클라이언트 요청에 전송한 데이터 유지
	private void dispatch(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher(url);
		dispatch.forward(request, response);
	}
}
