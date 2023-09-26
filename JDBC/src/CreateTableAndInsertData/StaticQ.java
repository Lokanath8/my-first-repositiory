package CreateTableAndInsertData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class StaticQ {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/jdbc", "root", "root");

	   // String sql = "create table LOKA(sid int,sname varchar(20),saddress varchar(20))";
		
	 //  static query
	  	String sql = "insert into LOKA values(8,'lokanath','odisha')";
		
		java.sql.Statement statement = con.createStatement();
		 
		 statement.execute(sql);
		 System.out.println("Table Created Successfully");
		 statement.close();
		 con.close();
	}
}
