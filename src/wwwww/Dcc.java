package wwwww;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dcc {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//1.����mysql����
	Class.forName("com.mysql.jdbc.Driver");
	//2.�������ݿ�
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
	//3.sql���
	String sql="delete from emp "
			+ "where id=? ";
	//4.ִ��sql���
	PreparedStatement ps=con.prepareStatement(sql);
	//5.ִ��
	Scanner scan=new Scanner(System.in);
	int id=scan.nextInt();
	ps.setInt(1, id);
	ps.execute();
	System.out.println("�ɹ�");
	
}
}
