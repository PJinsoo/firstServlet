package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloGithub")
public class HelloGithub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloGithub() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
        PrintWriter out=response.getWriter();
        out.println("<html>"+"<body>");
        out.println("<h1>Github에서 import</h1>");
        out.println("<br><h1>sub 브랜치로 commit, push 해보기</h1>");
        out.println("</body>"+"</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
