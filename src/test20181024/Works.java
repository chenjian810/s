package test20181024;

public class Works {
	private int id;
	private String name;
	private String bh;
	private int age;
	private double salary;
	public Works() {
		
	}
	public Works(int id,String name,String bh,int age,double salary) {
		this.id=id;
		this.name=name;
		this.bh=bh;
		this.age=age;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Works work=new Works(1,"Ð¡»Æ","c9527",23,6000);
		System.out.println(work);
		
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
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
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
		return "Works [id=" + id + ", name=" + name + ", bh=" + bh + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
