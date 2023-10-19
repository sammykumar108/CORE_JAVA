package userInputLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserInputLogin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Email Id :");
		String user_email=s.next();
		
		System.out.println("Enter Password :");
		String user_pass=s.next();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spshopping","root","91028");
			PreparedStatement ps=con.prepareStatement("select * from register where email=? and password=?");
			ps.setString(1,user_email);
			ps.setString(2,user_pass);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Login Successfully");
				System.out.println("Welcome :" +rs.getString("name"));
			}
			else
			{
				System.out.println("Invalid Email and PassWord");
			}
			rs.close();
			ps.close();
			con.close();
		}	 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
