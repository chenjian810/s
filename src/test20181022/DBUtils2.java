package test20181022;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;


public class DBUtils2 {
	public static BasicDataSource bs;
	static {
		System.out.println("正在连接数据库");
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(new File("F:\\workspace\\s\\db.properties")));
			bs=new BasicDataSource();
			bs.setDriverClassName(prop.getProperty("driverclass"));
			bs.setUsername(prop.getProperty("username"));
			bs.setPassword(prop.getProperty("password"));
			bs.setUrl(prop.getProperty("url"));
			bs.setMaxActive(Integer.parseInt(prop.getProperty("maxActive")));
			System.out.println("数据库已连接");	
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	public static Connection getConn() throws SQLException  {
			return bs.getConnection();
	}
		public static void closeConn(Connection conn) throws SQLException {
				if(conn!=null) {
					conn.close();
				}
		}
}
	
