package test20181014;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Date ���������ϰ
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
	//new Date ����
	Date date=new Date();
	//���ڸ�ʽת��
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd HH:mm:ss");
	//���
	System.out.println(sdf.format(date));
}
}
