package test20181007;

import java.util.Scanner;
/**
 * String类api的练习
 * @author 陈建
 *
 */
public class StringDemo {
public static void main(String[] args) {
	//String str=“2@212@2121@as@sasd@asdad@”;
	//new Scanner对象
	Scanner scan=new Scanner(System.in);
	//控制台输入字符串
	String a=scan.nextLine();
	//String的替换方法
	a=a.replace("@", ",");
	//输出
	System.out.println(a);
}
}
