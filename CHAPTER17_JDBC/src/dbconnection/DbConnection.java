package dbconnection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.zip.InflaterOutputStream;


public class DbConnection {
	static Connection con;
	static String driver_class,jdbc_url,username,password;
	public static Connection getConnection()
	{	
		
			try
			{
				Properties p=new Properties();
				//FileInputStream fis=new FileInputStream("D:\\SMART PROGRAMMING\\CHAPTER17_JDBC\\src\\dbconnection\\dbdetails.properties");
				//p.load(fis);
				
				InputStream is=DbConnection.class.getResourceAsStream("dbdetails.properties");
				p.load(is);
				driver_class=p.getProperty("driver_class");
				jdbc_url=p.getProperty("url");
				username=p.getProperty("username");
				password=p.getProperty("password");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
			try 
			{
				Class.forName(driver_class);
				con=DriverManager.getConnection(jdbc_url,username,password);

				
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
			return con;
	    
		
	}	
}
