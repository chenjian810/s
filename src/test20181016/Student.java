package test20181016;
/**
 * 学生类
 * @author 陈建
 *
 */
public class Student {
	private int id;
	private String classname;
	private String name;
	private String xuehao;
	private int age;
	private double score;
	public static void main(String[] args) {
		Student Std=new Student(1,"一班","小王","c1",23,70.1);
		System.out.println(Std);
	}
	public Student() {
		
	}
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
