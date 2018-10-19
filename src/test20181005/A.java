package test20181005;

/**
 * 第一个java类
 * @author 陈建
 *
 */
public class A {
	/**
	 * 属性 ：name
	 */
	String name;
	/**
	 * 控制台输出
	 */
	public void aca() {
		System.out.println("aca方法");
	}
	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	public static void main(String[] args) {
	A a=new A();
	System.out.println(a);

		
	}
}
