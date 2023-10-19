package checkedExceptionExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
	 public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("E:\\aaa.txt");
			int i=fis.read();
			System.out.println(i);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
