package test20181010.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * emp表查找信息
 * 根据id和姓名查找emp
 * @author 陈建
 *
 */
public class SelectDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
		String sql="select * from emp "
				+ "where id=? and name=?";
		PreparedStatement ps=con.prepareStatement(sql);//预编译执行sql语句
		ps.setInt(1, 1);
		ps.setString(2, "chen1");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println("name="+name+",id="+id);
		}
	/*	int id1=1;
		String name1="chen or 1=1"; 
		String sql="select * from emp where id="+id1+" and name='"+name1+"'";
		//String sql1="select * from emp where id=1 and name='chen' or 2=2";
	//sql注入
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println("name="+name+",id="+id);
		}*/
	}
}
