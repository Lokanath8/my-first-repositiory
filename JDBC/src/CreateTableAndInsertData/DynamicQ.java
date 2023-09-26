package CreateTableAndInsertData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicQ {
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/jdbc", "root", "root");
	
	//dynamic query
	 
	int sid=Integer.parseInt(args[0]);
	 String sname=args[1];
	 String saddress=args[2];
     String sql="insert into LOKA values('"+sid+"','"+sname+"','"+saddress+"')";
	
	
	 Statement statement = con.createStatement();
	 
	 statement.execute(sql);
	 System.out.println("Table Created Successfully");
	 statement.close();
	 con.close();
	
}
	
}

