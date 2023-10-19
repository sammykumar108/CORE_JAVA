package basicPrgrams;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter 1st String");
		String str1=scanner.next();
		
		System.out.println("Enter 2nd String");
		String	str2=scanner.next();
		
//		String str1="keep";
//		String str2="peek";
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Two string are Anagram");
		}
		else {
			System.out.println("Two String are not Anagram");
		}
	}
}
