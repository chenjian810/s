package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
		request.setAttribute("aaa", "≥¬Ω®");
		List<Emp> emps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
			String sql="select * from emp ";
			PreparedStatement ps=con.prepareStatement(sql);//‘§±‡“Î÷¥––sql”Ôæ‰
			ResultSet rs=ps.executeQuery();
			emps=new ArrayList<Emp>();
			while(rs.next()) {
				Emp e=new Emp();
				e.setId(rs.getInt("id"));
				e.setAge(rs.getInt("age"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getDouble("salary"));
				emps.add(e);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		request.setAttribute("emplist", emps);
		request.getRequestDispatcher("1.jsp").forward(request, response);
		//response.sendRedirect("1.jsp");
	}

}
