package test20181015;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import utils.DBUtils;
import web.Emp;

public class EmpDAO {
	public List<Emp> findAll() throws SQLException {
		Connection conn=DBUtils.getConn();//连接数据库
		String sql="select * from emp";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();//结果集
		List<Emp> emps=new ArrayList<Emp>();
		//=new ArrayList<Emp>()
		while(rs.next()) {
			Emp e=new Emp();
			e.setAge(rs.getInt("age"));
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setSalary(rs.getDouble("salary"));
			emps.add(e);
		}
		return emps;
	}
	public void insertEmp(Emp e) throws SQLException {
		Connection conn=DBUtils.getConn();
		String sql="insert into emp "
				+ "values(?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);//预编译sql
		ps.setInt(1,e.getId());
		ps.setString(2,e.getName());
		ps.setInt(3, e.getAge());
		ps.setDouble(4, e.getSalary());
		ps.execute();
	}
	public void updateEmp(Emp a) throws SQLException {
		Connection conn=DBUtils.getConn();
		String sql="update emp "
				+ "set name=?,age=?,salary=? "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, a.getName());
		ps.setInt(2, a.getAge());
		ps.setDouble(3, a.getSalary());
		ps.setInt(4, a.getId());
		ps.execute();
	}
	
	public void del(int id) throws SQLException {
		Connection conn=DBUtils.getConn();
		String sql="delete from emp "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,id);
		ps.execute();
		
		
	}
	
	public static void main(String[] args) throws SQLException  {
		EmpDAO dao=new EmpDAO();
		/*Emp e=new Emp();
		e.setAge(23);
		e.setId(11);
		e.setName("chen2");
		e.setSalary(4000);
		dao.insertEmp(e);*/
		//dao.del(5);
		/*Emp e=new Emp();
		e.setId(4);
		e.setAge(1000);
		e.setName("dygasubdjknlm");
		e.setSalary(10);
		dao.updateEmp(e);*/
	/*	Emp e=new Emp(12,"小小白",23,6770);
		dao.insertEmp(e);*/
		System.out.println(dao.findAll());
		dao.findAll().forEach(System.out::println);
		//System.out.println(dao.findAll());
	}
}
