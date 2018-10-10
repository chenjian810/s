package test;

public class Acc {
	String name;
	int age;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void a() {
		System.out.println("this is a");
	}
	public void b(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	int c(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Acc a=new Acc();
		a.setAge(12);
		a.a();
		a.b(3, 4);
		System.out.println(a.c(5, 8));
		//System.out.println(a.getAge());
	}

}
