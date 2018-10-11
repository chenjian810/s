package wwwww;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Fff {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
		String sql="update emp "
				+ "set salary=? "
				+ "where name=?";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		String emp=scan.next();
		String[] e=emp.split(",");
		String name=e[0];
		double  salary=Double.parseDouble(e[1]);
		ps.setDouble(1, salary);
		ps.setString(2,name);
		ps.execute();
		System.out.println("ÐÞ¸ÄÍê³É£¡£¡£¡");
		
	}

}
