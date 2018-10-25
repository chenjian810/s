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
 * Servlet implementation class UpdateStuServlet
 */
public class UpdateStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StudentDAO studao=new StudentDAO();
		try {
		String id=request.getParameter("id");
		System.out.println("id======"+id);
		Student s=studao.findById(Integer.parseInt(id));
		request.setAttribute("stu",s);
		request.getRequestDispatcher("update.jsp").forward(request, response);
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}

}
	}
