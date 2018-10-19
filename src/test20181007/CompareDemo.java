package test20181007;
/**
 * 做比较
 * @author Administrator
 *
 */
public class CompareDemo {
	/**
	 * 三个数求最大值
	 * @param a 参数1
	 * @param b 参数2
	 * @param c 参数3
	 * @return 最大值
	 */
	public int max(int a,int b,int c) {
		//a,b,c
		if(a>b) {
			if(a>c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	/**
	 * 三个数求最小值
	 *@param a 参数1
	 * @param b 参数2
	 * @param c 参数3
	 * @return 最小值
	 */
	public int min(int a,int b,int c) {
		if(a<b) {
			if(a<c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if(b<c){
			return b;	
		}
		else {
			return c;
		}
	}
	public static void main(String[] args) {
		CompareDemo z=new CompareDemo();
		int a =z.max(54,212 ,141);
		System.out.println(a);
		int b=z.min(123, 234,345);
		System.out.println(b);
	}
	
	
	
}
