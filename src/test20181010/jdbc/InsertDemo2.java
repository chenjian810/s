package test20181010.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * emp表插入数据练习
 * @author 陈建
 *
 */
public class InsertDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
		String sql="insert into emp "
				+ "values(?,?,?,?)";
		PreparedStatement  ps=con.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();

	}
}
