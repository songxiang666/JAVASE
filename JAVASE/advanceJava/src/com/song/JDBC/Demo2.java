package com.song.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args){
		//add(70,"DRLing","HNXT");
		//delete(60);
		//update(10,"liuliu");
		selectAll();
	}

	public static void selectAll() {
		Connection co=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String pwd="tiger";
			co=DriverManager.getConnection(url,user,pwd);
			st=co.createStatement();
			String sql="select * from dept";
			
			rs=st.executeQuery(sql);
			//取出
			while(rs.next()){
				int deptno=rs.getInt("deptno");
				String dname=rs.getString("dname");
				String loc=rs.getString("loc");
				System.out.println(deptno+","+dname+","+loc);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			try {
				co.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public static void add(int deptno,String deptname,String location) {
		Connection co=null;
		Statement st=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String pwd="tiger";
			co=DriverManager.getConnection(url,user,pwd);
			String sql="insert into dept values('"+deptno+"','"+deptname+"','"+location+"')";
			st=co.createStatement();
			int count=st.executeUpdate(sql);
			if(count>0)
				System.out.println("添加成功!");
			else
				System.out.println("添加失败！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				co.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void delete(int deptno){
		Connection co=null;
		Statement st=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String pwd="tiger";
			co=DriverManager.getConnection(url,user,pwd);
			st=co.createStatement();
			String sql="delete dept where deptno="+deptno;
			int count=st.executeUpdate(sql);
			if(count>0)
				System.out.println("删除成功！");
			else
				System.out.println("删除失败！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				co.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void update(int deptno,String deptname){
		Connection co=null;
		Statement st=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String pwd="tiger";
			co=DriverManager.getConnection(url,user,pwd);
			st=co.createStatement();
			String sql="update dept set dname='"+deptname+"' where deptno="+deptno;
			int count=st.executeUpdate(sql);
			if(count>0)
				System.out.println("修改成功！");
			else
				System.out.println("修改失败！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				co.close();
				st.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
