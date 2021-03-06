package test20181016;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * 数据库连接工具类
 * @author 陈建
 *
 */
public class DBUtil2 {
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
			bs.setMaxWait(Long.parseLong(prop.getProperty("maxwait")));
			System.out.println("数据库已连接");
		} catch (Exception e) {
			e.printStackTrace();
		}

/*		bs.setDriverClassName("com.mysql.jdbc.Driver");//驱动
		bs.setUsername("root");//数据库账号
		bs.setPassword("123456");//数据库账号
		bs.setUrl("jdbc:mysql://localhost:3306/text");//url
		bs.setMaxActive(6);//最大连接数
*/	
	}
	/**
	 * 连接数据库
	 * @return Connection 接口
	 * @throws SQLException sql异常
	 */
	public static Connection getConn() throws SQLException  {
		return bs.getConnection();
	}
	/**
	 * 关闭数据库连接
	 * @param conn Connection接口
	 * @throws SQLException sql异常
	 */
	public static void closeConn(Connection conn) throws SQLException {
		if(conn!=null) {
			conn.close();
		}
	}
}
