package jdbcDevlopment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException 
	{
		//try with resource():-it will automatically close all the resources
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spshopping","root","91028");
				
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
