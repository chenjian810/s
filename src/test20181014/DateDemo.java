package test20181014;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Date 日期类的练习
 * @author Administrator
 *
 */
public class DateDemo {
public static void main(String[] args) throws InterruptedException {
	/*int i=0;
	while(true) {
		System.out.println("hello word!!!");
		Thread.sleep(1000);
		i++;
		if(i==5) {
			break;
		}
	}*/
	//new Date 对象
	Date date=new Date();
	//日期格式转换
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
	//输出
	System.out.println(sdf.format(date));
}
}
