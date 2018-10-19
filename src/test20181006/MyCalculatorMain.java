package test20181006;

import test20181005.MyCalculator;
/**
 * 调用计算器
 * @author 陈建
 *
 */
public class MyCalculatorMain {

	public static void main(String[] args) {
		//1.new对象
		MyCalculator h=new MyCalculator();
		//调用加法并且输出结果
		System.out.println("sum="+h.sum(1, 2));
		//调用减法并且输出结果
		System.out.println("jian="+h.jian(3, 1));
		//调用加法并且输出结果
		System.out.println("cheng="+h.cheng(2, 3));
		//调用除法并且输出结果
		System.out.println("chu="+h.chu(4, 3));

	}

}
