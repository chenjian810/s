package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/a")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("aaa", "³Â½¨");
		request.getRequestDispatcher("1.jsp").forward(request, response);
		//response.sendRedirect("1.jsp");
	}

}
