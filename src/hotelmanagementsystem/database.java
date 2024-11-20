package hotelmanagementsystem;
import java.sql.*;
public class database {
	Connection cnct;
	Statement stmt;
	ResultSet rst;
	ResultSet rst1;
	void connect()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		try
		{
			cnct=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","muskan");
			stmt=cnct.createStatement();
			rst=stmt.executeQuery("select * from login10");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		database db=new database();
		db.connect();
	}
	}
