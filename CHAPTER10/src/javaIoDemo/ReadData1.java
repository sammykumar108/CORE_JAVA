package javaIoDemo;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadData1 
{
	public static void main(String[] args) 
	{
			FileInputStream fis=null;
			try
			{
				fis = new FileInputStream("D:\\Java_program\\IfElseDemo.java");
				int i;
				while((i=fis.read()) != -1)
				{
					System.out.println((char) i);
				}
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			finally
			{
				try
				{
						fis.read();
				}
				catch(IOException e)
				{
					System.out.println(e);
				}
			}
		}
}
				
	

