package BasicProgram;

import java.util.Scanner;

// 121->121
// 12321->12321
public class PalindromeNumber {
	public static void main(String[] args) {
		int no=12321;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int no=sc.nextInt();
		int temp=no;
		int rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no +"is Palindrome number");
		}
		else
		{
			System.out.println(no +"is not Palindrome number");
		}
	}
}
