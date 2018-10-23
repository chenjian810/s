package test20181023.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test20181016.Student;
import test20181016.StudentDAO;

/**
 * Servlet implementation class UpdateServelt
 */
@WebServlet("/up")
public class UpdateServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StudentDAO dao=new StudentDAO();
		try {
			Student stu=new Student();
			stu.setId(Integer.parseInt(request.getParameter("id")));
			stu.setName(request.getParameter("name"));
			stu.setScore(Double.parseDouble(request.getParameter("score")));
			stu.setClassname(request.getParameter("classname"));
			stu.setXuehao(request.getParameter("xuehao"));
			stu.setAge(Integer.parseInt(request.getParameter("age")));
			dao.upd(stu);
			response.sendRedirect("/s/list");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
