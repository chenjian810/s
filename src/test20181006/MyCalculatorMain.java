package test20181006;

import test20181005.MyCalculator;
/**
 * ���ü�����
 * @author �½�
 *
 */
public class MyCalculatorMain {

	public static void main(String[] args) {
		//1.new����
		MyCalculator h=new MyCalculator();
		//���üӷ�����������
		System.out.println("sum="+h.sum(1, 2));
		//���ü�������������
		System.out.println("jian="+h.jian(3, 1));
		//���üӷ�����������
		System.out.println("cheng="+h.cheng(2, 3));
		//���ó�������������
		System.out.println("chu="+h.chu(4, 3));

	}

}
