package test20181020;


import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import test20181016.DBUtil2;
import test20181016.Student;

public class Student1DAO {


	public void add(Student1 stu1) throws SQLException{
		Connection conn=(Connection) DBUtil2.getConn();
		String sql="insert into Student "
				+ "values(?,?,?,?,?,?)";
		/*PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, stu1.getId());
		ps.setString(2,stu1.getClassname());
		ps.setString(3, stu1.getName());
		ps.setString(4, stu1.getXuehao());
		ps.setInt(5, stu1.getAge());
		ps.setDouble(6,stu1.getScore() );
		ps.execute(); �����һ�в�֪����ô�ᱨ�� */
	}
	public static void main(String[] args) throws SQLException {
		Student1 stu1=new Student1(1,"һ��","С��","c1",23,95);
		Student1DAO stu1dao=new Student1DAO();
		stu1dao.add(stu1);
	}
	
}
