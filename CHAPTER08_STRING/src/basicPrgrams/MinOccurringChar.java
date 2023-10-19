package basicPrgrams;

//WAP to get minimum occurring character in the String

public class MinOccurringChar {
	public static void main(String[] args) {
		String string="abdccbdcddcc";
		int[] arr=new int[126];
		for(int i=0;i<string.length();i++)
		{
			arr[string.charAt(i)]=arr[string.charAt(i)]+1;
		}
		int min=string.length();
		char c=' ';
		for(int i=0;i<string.length();i++)
		{
			if(min>arr[string.charAt(i)])
			{
				min=arr[string.charAt(i)];
				c=string.charAt(i);
			}
		}
		System.out.println("Minimum repeated character is:" +c);
	}
}
