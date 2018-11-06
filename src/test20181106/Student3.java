package test20181106;

public class Student3 {
	private int id;
	private String classname;
	private String name;
	private String xuehao;
	private String sex;
	private int age;
	private double score;
	public static void main(String[] args) {
		Student3 stu3=new Student3(1,"Ò»°à","xiaowang","c1","ÄÐ",23,67);
		System.out.println(stu3);
	}
	public Student3(){
		
	}
	public Student3(int id,String classname,String name,String xuehao,String sex,int age,double score) {
		this.id=id;
		this.classname=classname;
		this.name=name;
		this.xuehao=xuehao;
		this.sex=sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
		return "Student3 [id=" + id + ", classname=" + classname + ", name=" + name + ", xuehao=" + xuehao + ", sex="
				+ sex + ", age=" + age + ", score=" + score + "]";
	}
	
}
