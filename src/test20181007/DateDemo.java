package test20181007;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		long time1=System.currentTimeMillis();
		System.out.println(time1);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss:ms");
		Date date=new Date();
		System.out.println(date.getTime());
		System.out.println(date);
		/*for(long i=0;i<5000000000l;i++) {
			System.out.println("²âÊÔ"+i+1);
		}*/
		System.out.println(sdf.format(date));
		long time2=System.currentTimeMillis();
		System.out.println(time2);
		System.out.println(time2-time1);
	}
}
