package insertUpdateDeleteDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertValues1 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name1=s.next();
		System.out.println("Enter Your Email");
		String email1=s.next();
		System.out.println("Enter Your Password");
		String pass1=s.next();
		System.out.println("Enter Your Gender");
		String gender1=s.next();
		System.out.println("Enter Your City");
		String city1=s.next();
			
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spshopping","root","91028");
			
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, name1);
			ps.setString(2, email1);
			ps.setString(3, pass1);
			ps.setString(4, gender1);
			ps.setString(5, city1);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Fail");
			}
			 ps.close();
	         con.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
