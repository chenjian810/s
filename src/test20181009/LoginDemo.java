package test20181009;

import java.util.Scanner;
/**
 * ¿ØÖÆÌ¨Ä£ÄâÍøÒ³µÇÂ¼¹¦ÄÜ
 * @author ³Â½¨
 *
 */
public class LoginDemo {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String a=scan.next();
	String[] b=a.split(",");
	//String[] str=new String[] {"xiaoming","123456"};
	String username=b[0];
	String password=b[1];
	if(username.equals("xiaoming")) {
		if(password.equals("123456")) {
			System.out.println("µÇÂ¼³É¹¦");
		}
		else {
		System.out.println("ÃÜÂë´íÎó");
		}
		}
	else if(!username.equals("xiaoming")){
		System.out.println("ÕËºÅ´íÎó");
	}
	
	}
}
