package test20181020;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Student1DAO {
	public void add(Student1 stu1) throws SQLException {
		Connection conn=DBUtils1.getConn();
		String sql="insert into Student1 "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,stu1.getId());
		ps.setString(2, stu1.getClassname());
		ps.setString(3, stu1.getName());
		ps.setString(4, stu1.getXuehao());
		ps.setInt(5, stu1.getAge());
		ps.setDouble(6, stu1.getScore());
		ps.execute();
	}
	public void del(int id) throws SQLException {
		Connection conn=DBUtils1.getConn();
		String sql="delete from Student1 "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
	}
	public void upd(Student1 stu1) throws SQLException {
		Connection conn=DBUtils1.getConn();
		String sql="update Student1 "
				+ "set classname=?,name=?,xuehao=?,age=?,score=? "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, stu1.getClassname());
		ps.setString(2, stu1.getName());
		ps.setString(3, stu1.getXuehao());
		ps.setInt(4, stu1.getAge());
		ps.setDouble(5, stu1.getScore());
		ps.setInt(6, stu1.getId());
		ps.execute();
		
	}
	public List<Student1> findAll() throws SQLException{
		Connection conn=DBUtils1.getConn();
		String sql="select * from Student1 ";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Student1> stu1=new ArrayList<Student1>();
		while(rs.next()) {
			Student1 st=new Student1();
			st.setId(rs.getInt("id"));
			st.setClassname(rs.getString("classname"));
			st.setName(rs.getString("name"));
			st.setXuehao(rs.getString("xuehao"));
			st.setAge(rs.getInt("age"));
			st.setScore(rs.getDouble("score"));
			stu1.add(st);
		}
		return stu1;	
	}
	public Student1 findByName(String name,String xuehao) throws SQLException{
		Connection conn=DBUtils1.getConn();
		String sql="select * from Student1 "
				+ "where name=? and xuehao=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, xuehao);
		ResultSet rs=ps.executeQuery();
		Student1 s=null;
		while(rs.next()) {
			s=new Student1();
			s.setId(rs.getInt("id"));
			s.setClassname(rs.getString("classname"));
			s.setName(rs.getString("name"));
			s.setXuehao(rs.getString("xuehao"));
			s.setAge(rs.getInt("age"));
			s.setScore(rs.getDouble("score"));
			
		}
		return s;
	}
	public static void main(String[] args) throws SQLException {
		Student1 stu=new Student1(2,"Ò»°à","Ð¡³Â","C1",23,85);
		Student1DAO stu1dao=new Student1DAO();
		//stu1dao.add(stu);
		//stu1dao.findAll().forEach(System.out::println);
		//System.out.println(stu1dao.findByName("Ð¡³Â","22"));
		
	}

	
}
