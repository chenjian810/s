package test20181012;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 查找emp表所有信息
 * @author DELL
 *
 */
public class FindAllEmps {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
		String sql="select * from emp";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int age=rs.getInt("age");
			double salary=rs.getDouble("salary");
			System.out.println("id="+id+",name="+name+",age="+age+",salary="+salary);
		}
	}
}
