package test20181023.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test20181016.Student;
import test20181016.StudentDAO;

/**
 * Servlet implementation class StudentListServlet
 */
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StudentDAO dao=new StudentDAO();
			try {
				//1.根据dao（jdbc）获取到学生列表
				List<Student> stulist=dao.findAll();
				//2.设置请求参数
				request.setAttribute("stulist", stulist);
				
				//3.将请求获取到的数据转发到页面上
				request.getRequestDispatcher("stulist.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	
	}

}
