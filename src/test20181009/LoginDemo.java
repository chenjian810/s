package test20181009;

import java.util.Scanner;
/**
 * ����̨ģ����ҳ��¼����
 * @author �½�
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
			System.out.println("��¼�ɹ�");
		}
		else {
		System.out.println("�������");
		}
		}
	else if(!username.equals("xiaoming")){
		System.out.println("�˺Ŵ���");
	}
	
	}
}
