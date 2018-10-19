package test20181015.web;
/**
 * 数据库emp表对应的实体类
 * @author 陈建
 *
 */
public class Emp {
	/**
	 * 编号 （主键）
	 */
	private int id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 薪水
	 */
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
	/**
	 * 构造器
	 */
	public Emp() {
		
	}
	
	/**
	 * 带参构造器
	 * @param name 姓名
	 * @param id 编号
	 */
	public Emp(String name, int id) {
		this.id = id;
		this.name = name;
	}
	/**
	 * 带参构造器
	 * @param id 编号
	 * @param name 姓名
	 */
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * 带参构造器
	 * @param id 编号
 	 * @param name 姓名
	 * @param age 年龄
	 * @param salary 薪水
	 */
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
