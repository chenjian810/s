package utils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	public static BasicDataSource bs;
	static {
		System.out.println("�����������ݿ�");
		bs=new BasicDataSource();
		bs.setDriverClassName("com.mysql.jdbc.Driver");
		bs.setUsername("root");
		bs.setPassword("123456");
		bs.setUrl("jdbc:mysql://localhost:3306/text");
		bs.setMaxActive(5);
		System.out.println("���ݿ�������");
	}
	
	public static Connection getConn() throws SQLException {
		return bs.getConnection();
	}
	
	public static void closeConn(Connection conn) throws SQLException {
		if(conn!=null) {
			conn.close();
		}
	}
}
