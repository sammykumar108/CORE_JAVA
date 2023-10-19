package selectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spshopping","root","91028");
			PreparedStatement ps=con.prepareStatement("select * from register");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String name1=rs.getString("name");
				String email1=rs.getString("email");
				String password1=rs.getString("password");
				String gender1=rs.getString("gender");
				String city1=rs.getString("city");
				
				System.out.println("Name :"+name1);
				System.out.println("Email :"+email1);
				System.out.println("Password :"+password1);
				System.out.println("Gender :"+gender1);
				System.out.println("City :"+city1);
				System.out.println("-------------------------------");
				
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}
