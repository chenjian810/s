package test20181029;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class WorkssDAO {
	public void add(Workss w) {
		Connection conn=null;
		try {
			conn=DBUtil11.getConn();
			String sql="insert into Workss "
					+ "values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, w.getId());
			ps.setString(2, w.getName());
			ps.setString(3, w.getGh());
			ps.setInt(4, w.getAge());
			ps.setDouble(5, w.getSalary());
			ps.execute();
	}
		catch (Exception e) {
		e.printStackTrace();
	}
		finally {
			try {
				DBUtil11.closeConn(conn);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
	public void del(String name) {
		Connection conn=null;
		try {
			conn=DBUtil11.getConn();
			String sql="delete from Workss "
					+ "where name=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil11.closeConn(conn);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void upd(Workss workss) {
		Connection conn=null;
		try {
			conn=DBUtil11.getConn();
			String sql="update Workss "
					+ "set name=?,gh=?,age=?,salary=? "
					+ "where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,workss.getName());
			ps.setString(2, workss.getGh());
			ps.setInt(3, workss.getAge());
			ps.setDouble(4, workss.getSalary());
			ps.setInt(5, workss.getId());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil11.closeConn(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public Workss findByName(String name) {
		Connection conn=null;
		Workss w=null;
		try {
			conn=DBUtil11.getConn();
			String sql="select * from Workss "
					+ "where name=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			w=new Workss();
			while(rs.next()) {
				w.setId(rs.getInt("id"));
				w.setName(rs.getString("name"));
				w.setGh(rs.getString("gh"));
				w.setAge(rs.getInt("age"));
				w.setSalary(rs.getDouble("salary"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil11.closeConn(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return w;	
	}
	public List<Workss> findAll(){
		Connection conn=null;
		List<Workss> w=null;
		try {
			conn=DBUtil11.getConn();
			String sql="select * from Workss";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			w=new ArrayList<Workss>();
			while(rs.next()) {
			Workss works=new Workss();
			works.setId(rs.getInt("id"));
			works.setName(rs.getString("name"));
			works.setGh(rs.getString("gh"));
			works.setAge(rs.getInt("age"));
			works.setSalary(rs.getDouble("salary"));
			w.add(works);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil11.closeConn(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return w;
	}
	public static void main(String[] args) {
    //Workss work=new Workss(2,"xiaohong","c2",25,4554);
	WorkssDAO dao=new WorkssDAO();
	//dao.add(work);
	//dao.del("xiao");
	//dao.upd(work);
	//System.out.println(dao.findByName("xiaohong"));
	dao.findAll().forEach(System.out::println);
}
}
