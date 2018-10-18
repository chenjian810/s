package web;

public class Emp {
	private int id;
	private String name;
	private int age;
	private double salary;
	public static void main(String[] args) {
		Emp e=new Emp(1,"小明",34,4000);
		System.out.println(e);
		Emp e2=new Emp();
		e2.setAge(23);
		e2.setName("小刚");
		e2.setSalary(1111);
		e2.setId(12);
		System.out.println(e2);
		
		Emp e3=new Emp(3, "小白");
		System.out.println(e3);
		Emp e4=new Emp("小黑", 6);
		System.out.println(e4);
	}
	public Emp() {
		
	}
	

	public Emp(String name, int id) {
		this.id = id;
		this.name = name;
	}
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Emp(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
