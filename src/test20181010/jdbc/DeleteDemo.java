package test20181010.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * emp删除信息
 * 根据id删除emp信息
 * @author 陈建
 *
 */
public class DeleteDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//1.加载mysql驱动
	Class.forName("com.mysql.jdbc.Driver");
	//2.连接数据库
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
	//3.sql语句
	String sql="delete from emp "
			+ "where id=? ";
	//4.执行sql语句
	PreparedStatement ps=con.prepareStatement(sql);
	//5.执行
	Scanner scan=new Scanner(System.in);
	int id=scan.nextInt();
	ps.setInt(1, id);
	ps.execute();
	System.out.println("成功");
	
}
}
