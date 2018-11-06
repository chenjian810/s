package test20181106;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Student3DAO {
	public void add(Student3 stu3) {
		Connection conn=null;
		try {
			conn=DBUtils3.getConn();
			String sql="insert into Student3 "
					+ "values(?,?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, stu3.getId());
			ps.setString(2,stu3.getClassname());
			ps.setString(3, stu3.getName());
			ps.setString(4, stu3.getXuehao());
			ps.setString(5, stu3.getSex());
			ps.setInt(6, stu3.getAge());
			ps.setDouble(7, stu3.getScore());
			ps.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtils3.closeConn(conn);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void del(String name) {
	Connection conn=null;
	try {
		conn=DBUtils3.getConn();
		String sql="delete from Student3 "
				+ "where name=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.execute();
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			DBUtils3.closeConn(conn);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
	public void upd(Student3 stu3) {
		Connection conn=null;
		try {
			conn=DBUtils3.getConn();
			String sql="update Student3 "
					+ "set classname=?,name=?,xuehao=?,sex=?,age=?,score=? "
					+ "where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, stu3.getClassname());
			ps.setString(2, stu3.getName());
			ps.setString(3, stu3.getXuehao());
			ps.setString(4, stu3.getSex());
			ps.setInt(5, stu3.getAge());
			ps.setDouble(6, stu3.getScore());
			ps.setInt(7, stu3.getId());
			ps.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtils3.closeConn(conn);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public List<Student3> findAll() {
		Connection conn=null;
		List<Student3> stu3=null;
		try {
			conn=DBUtils3.getConn();
			String sql="select * from Student3";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			stu3=new ArrayList<>();
			while(rs.next()) {
				Student3 s=new Student3();
				s.setId(rs.getInt("id"));
				s.setClassname(rs.getString("classname"));
				s.setName(rs.getString("name"));
				s.setXuehao(rs.getString("xuehao"));
				s.setSex(rs.getString("sex"));
				s.setAge(rs.getInt("age"));
				s.setScore(rs.getDouble("score"));
				stu3.add(s);
			}
			}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtils3.closeConn(conn);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stu3;
		
	}
	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Student3> findByName(String name) {
		Connection conn=null;
		List<Student3> s=new ArrayList<Student3>();//
		try {
			conn=DBUtils3.getConn();
			String sql="select *from Student3 "
					+ "where name=?";//
			PreparedStatement ps=conn.prepareStatement(sql);//
			ps.setString(1, name);//
			ResultSet rs=ps.executeQuery();//
			while(rs.next()) {//
				s.add(//
						//new ....
						new Student3(rs.getInt("id")//
						,rs.getString("classname")//
						,rs.getString("name")//
						,rs.getString("xuehao")//
						,rs.getString("sex")//
						,rs.getInt("age")//
						,rs.getDouble("score")));//
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//
				DBUtils3.closeConn(conn);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return s;
	}
	public static void main(String[] args) {
		//Student3 s=new Student3(5,"1°à","xiaowang","c4","ÄÐ",24,99);
		Student3DAO dao=new Student3DAO();
		//dao.add(s);
		//dao.del("xiaowang");
		//dao.upd(s);
		dao.findByName("xiaowang").forEach(System.out::println);
//System.out.println(dao.findByName("xiaowang"));
	}
}
