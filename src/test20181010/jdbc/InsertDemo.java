package test20181010.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * emp表插入数据
 * 实现控制台输入emp的信息，然后添加到数据库中
 * @author 陈建
 *
 */
public class InsertDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
		String sql="insert into emp "
				+ "values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);//预编译执行sql语句
		Scanner scan=new Scanner(System.in);
		String emp=scan.next();
		String[] e=emp.split(",");
		int id=Integer.parseInt(e[0]);
		String name=e[1];
		int age=Integer.parseInt(e[2]);
		double salary=Double.parseDouble(e[3]);
/*		int id=scan.nextInt();
		String name=scan.next();
		int age=scan.nextInt();
		double salary =scan.nextDouble();*/
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3,age);
		ps.setDouble(4, salary);
		ps.execute();
		System.out.println("添加成功！！！！");
	}
}
