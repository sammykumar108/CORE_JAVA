package basicPrgrams;

//WAP to Reverse a String
public class RevString {
	public static void main(String[] args) {
		String name="deepak";
		int leng=name.length();
		String rev=" ";
		for(int i=leng-1;i>=0;i--)
		{
//			System.out.println(name.charAt(i));
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}
