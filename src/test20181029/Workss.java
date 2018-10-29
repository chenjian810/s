package test20181029;

public class Workss {
	private int id;
	private String name;
	private String gh;
	private int age;
	private double salary;
	public Workss() {
		
	}
	public Workss(int id,String name,String gh,int age,double salary) {
		this.id=id;
		this.name=name;
		this.gh=gh;
		this.age=age;
		this.salary=salary;
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
	public String getGh() {
		return gh;
	}
	public void setGh(String gh) {
		this.gh = gh;
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
		return "Workss [id=" + id + ", name=" + name + ", gh=" + gh + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
