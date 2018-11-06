package test20181106.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test20181016.Student;
import test20181106.Student3;
import test20181106.Student3DAO;

/**
 * Servlet implementation class Student3Servlet
 */
public class Student3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		Student3DAO dao =new Student3DAO();
		try {
			List<Student3> a=dao.findAll();
			request.setAttribute("stud", a);
			request.getRequestDispatcher("stud.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
