package test20181015.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test20181016.StudentDAO;

/**
 * ¼Ì³ÐHttpservletÀà£¬ÍøÂç±à³Ì
 * @author ³Â½¨
 *
 */
@WebServlet("/a")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("aaa", "³Â½¨");
		//EmpDAO dao=new EmpDAO();
		StudentDAO studao=new StudentDAO();
		try {
			request.setAttribute("stulist", studao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("2.jsp").forward(request, response);

	}

}
