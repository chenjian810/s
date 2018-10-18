package test20181016;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 学生表的增删查改
 * @author 陈建
 *
 */
public class StudentDAO {
	/**
	 * 添加学生
	 * @param stu 一个学生对象
	 * @throws SQLException sql异常
	 */
	public void add(Student stu) throws SQLException{
		Connection conn=DBUtil2.getConn();
		String sql="insert into Student "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, stu.getId());
		ps.setString(2,stu.getClassname());
		ps.setString(3, stu.getName());
		ps.setString(4, stu.getXuehao());
		ps.setInt(5, stu.getAge());
		ps.setDouble(6,stu.getScore() );
		ps.execute();
		//System.out.println("egh");
	}
	/**
	 * 删除学生
	 * @param name 学生姓名
	 * @param classname 学生班级
	 * @throws SQLException sql异常
	 */
	public void del(String name,String classname) throws SQLException {
		Connection conn=DBUtil2.getConn();
		String sql="delete from Student "
				+ "where name=? and classname=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, classname);
		ps.execute();
	}
	/**
	 * 更新学生
	 * @param stu 学生对象
	 * @throws SQLException sql异常
	 */
	public void upd(Student stu) throws SQLException {
		Connection conn=DBUtil2.getConn();
		String sql="update student "
				+ "set classname=?,name=?,xuehao=?,age=?,score=? "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, stu.getClassname());
		ps.setString(2, stu.getName());
		ps.setString(3, stu.getXuehao());
		ps.setInt(4, stu.getAge());
		ps.setDouble(5, stu.getScore());
		ps.setInt(6, stu.getId());
		ps.execute();
	}
	/**
	 * 查找所有的学生
	 * @return 学生信息集合
	 * @throws SQLException sql异常
	 */
	public List<Student> findAll() throws SQLException{
		Connection conn=DBUtil2.getConn();
		String sql="select * from Student";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Student> stu=new ArrayList<Student>();
		while(rs.next()) {
			Student s=new Student();
			s.setId(rs.getInt("id"));
			s.setClassname(rs.getString("classname"));
			s.setName(rs.getString("name"));
			s.setXuehao(rs.getString("xuehao"));
			s.setAge(rs.getInt("age"));
			s.setScore(rs.getDouble("score"));
			stu.add(s);
		}
		return stu;
	}
	public static void main(String[] args) throws SQLException {
	//Student student=new Student(3, "2班", "小王", "c2", 13, 65.1);
	//System.out.println(s);
	StudentDAO studentdao=new StudentDAO();
	//studentdao.add(student);
	//studentdao.del("小明","2班");
	//studentdao.upd(student);
	List<Student> s=studentdao.findAll();
	for(int i=0;i<s.size();i++) {
		Student a=s.get(i);
		System.out.println(a);
	}
	//s.forEach(System.out::println);
	}
}
