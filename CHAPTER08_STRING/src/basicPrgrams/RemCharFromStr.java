package basicPrgrams;

//WAP to Remove A given character from the String
import java.util.Scanner;

public class RemCharFromStr {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter any String");
//		String string=scanner.next();
		
		String string="deepak java";
//		System.out.println("Enter a character to remove in String");
//		char rem_ch=scanner.next().charAt(0);
		
		char rem_ch='e';
		char[] ch_arr=string.toCharArray();
		int j=0,count=0;
		for(int i=0;i<string.length();i++)
		{
			if(ch_arr[i]!=rem_ch)
			{
				ch_arr[j]=ch_arr[i];
				j++;
			}
			else {
				count++;
			}
		}
		while(count>0)
		{
			ch_arr[j]=' ';
			j++;
			count--;
			
		}
		System.out.println(ch_arr);
	}
}
