package test20181015;
/**
 * 人    抽象类
 * @author 陈建
 *
 */
public	abstract class Person {
	/**
	 * 名字
	 */
	public String name;
	/**
	 * 年龄
	 */
	public int age;
	/**
	 * 薪水
	 */
	public double salary;
	/**
	 * 说 方法
	 */
	public abstract void say();
	public static void main(String[] args) {
		Person p=new Man();
		B b=new Man();
		//b.say1();
		//b.say2();
		B b1=new WoMan();
		b1.say1();
		b1.say2();
		//复用
		
	}
}
