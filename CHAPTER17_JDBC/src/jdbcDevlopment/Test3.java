package jdbcDevlopment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbconnection.DbConnection;

public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException 
	{
	
		try (
				Connection con=DbConnection.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from register");
				ResultSet rs=ps.executeQuery();
			)
		{
			while(rs.next())
			{
				System.out.println("Name : "+rs.getString("name"));
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
}
