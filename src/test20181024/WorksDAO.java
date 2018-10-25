package test20181024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorksDAO {
	public void add(Works work) throws SQLException {
		Connection conn=DBUtil3.getConn();
		String sql="insert into Works "
				+ "values(?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,work.getId());
		ps.setString(2, work.getName());
		ps.setString(3, work.getBh());
		ps.setInt(4, work.getAge());
		ps.setDouble(5, work.getSalary());
		ps.execute();
	}
	public void del(String name) throws SQLException {
		Connection conn=DBUtil3.getConn();
		String sql="delete from works "
				+ "where name=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.execute();
	}
	public void upd(Works work) throws SQLException {
		Connection conn=DBUtil3.getConn();
		String sql="update works "
				+ "set name=?,bh=?,age=?,salary=? "
				+ "where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, work.getName());
		ps.setString(2, work.getBh());
		ps.setInt(3, work.getAge());
		ps.setDouble(4, work.getSalary());
		ps.setInt(5, work.getId());
		ps.execute();
	}
	public Works findByName(String name) throws SQLException {
		Connection conn=DBUtil3.getConn();
		String sql="select * from Works "
				+ "where name=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		Works w=null;
		while(rs.next()) {
			w=new Works();
			w.setId(rs.getInt("id"));
			w.setName(rs.getString("name"));
			w.setBh(rs.getString("bh"));
			w.setAge(rs.getInt("age"));
			w.setSalary(rs.getDouble("salary"));
		}
		return w;
				
	}
	public List<Works> findAll() throws SQLException{
		Connection conn=DBUtil3.getConn();
		String sql="select *from Works";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Works> work=new ArrayList<>();
		while(rs.next()) {
			Works w=new Works(); 
			w.setId(rs.getInt("id"));
			w.setName(rs.getString("name"));
			w.setBh(rs.getString("bh"));
			w.setAge(rs.getInt("age"));
			w.setSalary(rs.getDouble("salary"));
			work.add(w);
		}
		return work;
		
		
	}
		
	public static void main(String[] args) throws SQLException {
		//Works w=new Works(3,"Ð¡ºì","c9528",24,6900);
		WorksDAO dao=new WorksDAO();
		//dao.add(w);
		//dao.del("Ð¡ºì");
		//dao.upd(w);
		//System.out.println(dao.findByName("Ð¡ºì"));
		//1.
		List<Works> works=dao.findAll();
		for(int i=0;i<works.size();i++) {
			System.out.println(works.get(i));
		}
		for(int i=works.size()-1;i>=0;i--) {
			System.out.println(works.get(i));
		}
		System.out.println("===================");
		//2.
		for(Works w:dao.findAll()) {
			System.out.println(w);
		}
		System.out.println("===================");
		//3.
		dao.findAll().forEach(a->System.out.println(a));
		System.out.println("===================");
		//4.
		dao.findAll().forEach(System.out::println);
		System.out.println("===================");
		
		
	}
}
