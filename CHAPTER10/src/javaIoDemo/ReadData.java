package javaIoDemo;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadData {
	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream("D:\\Java_program\\IfDemo.java");
			int i;
			while((i=fis.read() ) != -1)
			{
				System.out.println((char)i);
			}
			fis.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
