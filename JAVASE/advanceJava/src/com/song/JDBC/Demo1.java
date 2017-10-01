package com.song.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args){
		//add(17045,"宋湘","女","1997-11-06","22982389762@qq.com");
		//delete(17045);
		update(17045,"林雪","女","1997-11-06","22982389762@qq.com");
	}
	
	public static void update(int id, String name, String sex,
			String birth, String email) {
		Connection co=null;
		Statement st=null;
		try {
			//1.加载驱动类
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//2.创建连接对象
			String url="jdbc:sqlserver://localhost:1433;database=Stud";
			String user="sa";
			String pwd="sa";
			co=DriverManager.getConnection(url,user,pwd);
			st=co.createStatement();
			String sql="update studentinfo set studentName='"+name+"',sex='"+sex+"',brithday='"+birth+"',email='"+email+"' where studentid="+id;
			int count=st.executeUpdate(sql);
			if(count>0){
				System.out.println("修改成功！");
			}else{
				System.out.println("修改失败！");
			}
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

	public static void delete(int i) {
		Connection co=null;
		Statement st=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://localhost:1433;database=Stud";
			String user="sa";
			String pwd="sa";
			co=DriverManager.getConnection(url,user,pwd);
			st=co.createStatement();
			String sql="delete studentinfo where studentid="+i;
			int count=st.executeUpdate(sql);
			if(count>0)
				System.out.println("删除成功！");
			else
				System.out.println("删除失败！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
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

	public static void add(int studentid,String stuname,String sex,String bir,String email){
		Connection co=null;
		Statement st=null;
		try {
			//2.加载驱动类
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//3.创建连接对象
			String url="jdbc:sqlserver://localhost:1433;database=Stud";
			String user="sa";
			String pwd="sa";
			co=DriverManager.getConnection(url,user,pwd);
			
			//4.创建命令对象
			st=co.createStatement();
			String sql="insert into studentInfo values('"+studentid+"','"+stuname+"','"+sex+"','"+bir+"','"+email+"')";
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
				e.printStackTrace();
			}
		}
	}
	
}
