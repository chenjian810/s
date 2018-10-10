package wwwww;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ccc {
	//你自己抄一遍看看
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "123456");
	
	}
}
