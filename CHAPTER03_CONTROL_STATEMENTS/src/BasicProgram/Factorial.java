package BasicProgram;

import java.util.Scanner;

// 5=5*4*3*2*1
//or 5=1*2*3*4*5
public class Factorial {
	public static void main(String[] args) {
//		int no=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no +"is" +fact);
	}
}
