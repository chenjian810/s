package wwwww;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ccc {
	//���Լ���һ�鿴��
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
	
	}
}
