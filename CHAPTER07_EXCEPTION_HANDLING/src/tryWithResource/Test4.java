package tryWithResource;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test4 {
	public static void main(String[] args) {
		try {
			class.forName(" ");
		} catch (Exception e) {
			System.out.println(e);
		}
		try (
			Connection connection=DriverManager.getConnection("","","");
			)
		{
		
		} 
		catch (Exception e) {
			System.out.println(e);
			
		}
	}
}
