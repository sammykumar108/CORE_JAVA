package basicPrgrams;

// WAP to print the first repeating character in the String
public class FirstRepeatingChar {
	public static void main(String[] args) {
		String string="this is dmeho";
		string=string.replaceAll("\\s", " ");
		System.out.println(string);
		int[] arr=new int[126];
		for(int i=0;i<string.length();i++)
		{
			arr[string.charAt(i)]=arr[string.charAt(i)]+1;
			
		}
		char c=' ';
		for(int i=0;i<string.length();i++)
		{
			if(arr[string.charAt(i)]>1)
			{
				c=string.charAt(i);
				break;
			}
		}
		System.out.println("First repeated character is:" +c);
	}
	
}
