package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test20181015.EmpDAO;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/a")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("aaa", "³Â½¨");

		EmpDAO dao=new EmpDAO();
		
		try {
			request.setAttribute("emplist", dao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("1.jsp").forward(request, response);

	}

}
