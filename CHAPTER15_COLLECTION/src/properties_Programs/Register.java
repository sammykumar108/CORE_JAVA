package properties_Programs;

import java.io.FileInputStream;
import java.util.Properties;

class Register
{
	public static void main(String[] args) throws Exception
	{
		Properties p=new Properties();

		FileInputStream fis=new FileInputStream("D:\\Xyz.properties");
        	p.load(fis);

		String name="";
		String email="deepak@gmail.com";

		if(name.equals(""))
		{
			System.out.println(p.getProperty("name_validation"));
		}
		else if(email.equals(""))
		{
			System.out.println("email cannot be empty");
		}
		else
		{
			System.out.println("valid");
		}
	}
}