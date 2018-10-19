package test20181016;
/**
 * 学生类
 * @author 陈建
 *
 */
public class Student {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 班级
	 */
	private String classname;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 学号
	 */
	private String xuehao;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 成绩
	 */
	private double score;
	public static void main(String[] args) {
		Student Std=new Student(1,"一班","小王","c1",23,70.1);
		System.out.println(Std);
	}
	/**
	 * 构造器
	 */
	public Student() {
		
	}
	/**
	 * 带参构造器
	 * @param id 编号
	 * @param classname 班级
	 * @param name 姓名
	 * @param xuehao 学号
	 * @param age 年龄
	 * @param score 成绩
	 */
	public Student(int id,String classname,String name,String xuehao,int age,double score) {
		this.id=id;
		this.classname=classname;
		this.name=name;
		this.xuehao=xuehao;
		this.age=age;
		this.score=score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", classname=" + classname + ", name=" + name + ", xuehao=" + xuehao + ", age="
				+ age + ", score=" + score + "]";
	}

}
