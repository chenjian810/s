package test20181007;
/**
 * ���Ƚ�
 * @author Administrator
 *
 */
public class CompareDemo {
	/**
	 * �����������ֵ
	 * @param a ����1
	 * @param b ����2
	 * @param c ����3
	 * @return ���ֵ
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
	 * ����������Сֵ
	 *@param a ����1
	 * @param b ����2
	 * @param c ����3
	 * @return ��Сֵ
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
