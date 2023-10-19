package basicPrgrams;

//WAP to check for String Palindrome
public class StringPalindrome {
	public static void main(String[] args) {
		String string="abcba";
		int leng=string.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+string.charAt(i);
		}
		if(string.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}
}
