package test20181007;

import java.util.Scanner;
/**
 * String��api����ϰ
 * @author �½�
 *
 */
public class StringDemo {
public static void main(String[] args) {
	//String str=��2@212@2121@as@sasd@asdad@��;
	//new Scanner����
	Scanner scan=new Scanner(System.in);
	//����̨�����ַ���
	String a=scan.nextLine();
	//String���滻����
	a=a.replace("@", ",");
	//���
	System.out.println(a);
}
}
