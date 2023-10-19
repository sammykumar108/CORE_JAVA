package scannerProgramExample;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.next();

		System.out.println("Your name is :" +name);
		System.out.println("------------------------------------------");
		System.out.println("Enter Your Pin no");
		int pinNo=s.nextInt();
		System.out.println("Your pin is:" +pinNo);
	}
}
