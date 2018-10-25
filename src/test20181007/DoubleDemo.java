package test20181007;

import java.text.DecimalFormat;

public class DoubleDemo {
	public static void main(String[] args) {
		double b=6;
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println(df.format(b));
	}
}
