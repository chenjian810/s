package test20181023.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test20181016.StudentDAO;

/**
 * Servlet implementation class DeleteStuServlet
 */
@WebServlet("/delstu")
public class DeleteStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StudentDAO dao=new StudentDAO();
		try {
			
			dao.del(Integer.parseInt(request.getParameter("id")));
			response.sendRedirect("/s/list");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
