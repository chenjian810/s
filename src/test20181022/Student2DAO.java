package test20181022;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student2DAO {
	public void add(Student2 stu2) throws SQLException {
		Connection conn=DBUtils2.getConn();
		String sql="insert into Student2 "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, stu2.getId());
		ps.setString(2, stu2.getClassname());
		ps.setString(3, stu2.getName());
		ps.setString(4, stu2.getXuehao());
		ps.setInt(5, stu2.getAge());
		ps.setDouble(6, stu2.getScore());
		ps.execute();
	}
	public void del(int id) throws SQLException {
		Connection conn=DBUtils2.getConn();
		String sql="delete from Student2 "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,id);
		ps.execute();
	}
	public void upd(Student2 stu2) throws SQLException {
		Connection conn=DBUtils2.getConn();
		String sql="update Student2 "
				+ "set classname=?,name=?,xuehao=?,age=?,score=? "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,stu2.getClassname());
		ps.setString(2, stu2.getName());
		ps.setString(3, stu2.getXuehao());
		ps.setInt(4, stu2.getAge());
		ps.setDouble(5, stu2.getScore());
		ps.setInt(6, stu2.getId());
		ps.execute();
	}
	public Student2 findByname(String name,String xuehao) throws SQLException{
		Connection conn=DBUtils2.getConn();
		String sql="select * from Student2 "
				+ "where name=? and xuehao=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, xuehao);
		ResultSet rs=ps.executeQuery();
		Student2 s2=null;
		while(rs.next()) {
			s2=new Student2();
			s2.setId(rs.getInt("id"));
			s2.setClassname(rs.getString("classname"));
			s2.setName(rs.getString("name"));
			s2.setXuehao(rs.getString("xuehao"));
			s2.setAge(rs.getInt("age"));
			s2.setScore(rs.getDouble("score"));	
		}
		return s2;
		
	}
	
	public static void main(String[] args) throws SQLException {
		Student2 s2=new Student2(4, "6°à", "Ð¡q", "A3", 22, 85);
		Student2DAO s2dao=new Student2DAO();
		s2dao.add(s2);
		//s2dao.del(3);
		//s2dao.upd(s2);
		
		
		
	}
}
