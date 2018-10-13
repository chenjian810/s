package c;

import java.util.Scanner;

public class Has {
public static void main(String[] args) {
	//String str=¡°2@212@2121@as@sasd@asdad@¡±;
	Scanner scan=new Scanner(System.in);
	String a=scan.nextLine();
	a=a.replace("@", ",");
	System.out.println(a);
}
}
