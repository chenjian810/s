package test20181016;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 读取.properties文件测试类
 * @author Administrator
 *
 */
public class ReadPro {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		prop.load(new FileInputStream(new File("F:\\workspace\\s\\db.properties")));
		String name=prop.getProperty("username");
		System.out.println(name);
	}
}
