package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	public static BasicDataSource bs;
	static {
		System.out.println("正在链接数据库");
		Properties prop=new Properties();//new一个加载.properties配置文件的工具类
		try {
			//加载配置文件
			prop.load(new FileInputStream(new File("F:\\workspace\\s\\db.properties")));
			//new数据库连接池的对象
			bs=new BasicDataSource();
			//配置加载的数据库驱动:根据上面加载的配置文件的Key来获取
			bs.setDriverClassName(prop.getProperty("driverclass"));
			//获取数据库账号
			bs.setUsername(prop.getProperty("username"));
			bs.setPassword(prop.getProperty("password"));
			bs.setUrl(prop.getProperty("url"));
			bs.setMaxActive(Integer.parseInt(prop.getProperty("maxActive")));
			System.out.println("数据库已连接");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
