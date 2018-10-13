package test20181014;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ab {
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
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyÄêMMÔÂdd HH:mm:ss");
	System.out.println(sdf.format(date));
}
}
