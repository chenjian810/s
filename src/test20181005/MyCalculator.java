package test20181005;
/**
 * 计算机器
 * @author 陈建
 *
 */
public class MyCalculator {
	/**
	 * 两个数的加法
	 * @param num1  参数1
	 * @param num2  参数2
	 * @return
	 */
public int sum(int num1,int num2) {
	int sum=num1+num2;
	return sum;
}
/**
 * 减法
 * @param num1 参数1
 * @param num2 参数2 
 * @return 
 */
public int jian(int num1,int num2) {
	return num1-num2;
	
}
/**
 * 乘法
 * @param num1 参数1
 * @param num2 参数2
 * @return
 */
public int cheng(int num1,int num2) {
	return num1*num2;
}
/**
 * 除法
 * @param num1 除数
 * @param num2 被除数
 * @return
 */
public double chu(double num1,double num2) {
	return num1/num2;
}
/**
 * 两个数的加法
 * @param num1 参数1
 * @param num2 参数2
 * @param num3 参数3
 * @return
 */
public int sum1(int num1,int num2,int num3) {
	return num1+num2+num3;
}
}
