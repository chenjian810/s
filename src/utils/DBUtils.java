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
		System.out.println("�����������ݿ�");
		Properties prop=new Properties();//newһ������.properties�����ļ��Ĺ�����
		try {
			//���������ļ�
			prop.load(new FileInputStream(new File("F:\\workspace\\s\\db.properties")));
			//new���ݿ����ӳصĶ���
			bs=new BasicDataSource();
			//���ü��ص����ݿ�����:����������ص������ļ���Key����ȡ
			bs.setDriverClassName(prop.getProperty("driverclass"));
			//��ȡ���ݿ��˺�
			bs.setUsername(prop.getProperty("username"));
			bs.setPassword(prop.getProperty("password"));
			bs.setUrl(prop.getProperty("url"));
			bs.setMaxActive(Integer.parseInt(prop.getProperty("maxActive")));
			System.out.println("���ݿ�������");
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
