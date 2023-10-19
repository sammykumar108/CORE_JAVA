package javaOutputStream;
import java.io.FileOutputStream;

public class WriteData {
	public static void main(String[] args) {
		try
		{
			String data="My Name Is SAMMY KUMAR";
			FileOutputStream fos=new FileOutputStream("d:\\aaa.txt");
			byte[] b=data.getBytes();
			fos.write(b);
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
