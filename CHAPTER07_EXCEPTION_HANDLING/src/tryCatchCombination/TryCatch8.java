package tryCatchCombination;

import java.io.FileNotFoundException;

public class TryCatch8 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println(100/0);
			System.out.println("2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3-----");
		}
		catch (FileNotFoundException e) {
			System.out.println("3 !!!!");
		}
	}
}
