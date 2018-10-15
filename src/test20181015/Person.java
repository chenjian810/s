package test20181015;

public	abstract class Person {
	public String name;
	public int age;
	public double salary;
	public abstract void say();
	public static void main(String[] args) {
		Person p=new Man();
		B b=new Man();
		//b.say1();
		//b.say2();
		B b1=new WoMan();
		b1.say1();
		b1.say2();
		//¸´ÓÃ
		
	}
}
