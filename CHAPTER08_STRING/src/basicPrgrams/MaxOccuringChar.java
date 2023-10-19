package basicPrgrams;

//WAP to get maximum occurring character in the String 
public class MaxOccuringChar {
	public static void main(String[] args) {
		String string="this is demo";
		string=string.replace("\\s"," ");
		System.out.println(string);
		int[] arr=new int[126];
		for(int i=0;i<string.length();i++)
		{
			arr[string.charAt(i)]=arr[string.charAt(i)]+1;
		}
		int max=-1;
		char c=' ';
		for(int i=0;i<string.length();i++)
		{
			if(max<arr[string.charAt(i)])
			{
				max=arr[string.charAt(i)];
				c=string.charAt(i);
			}
		}
		System.out.println("Maximum repeated character is:" +c);
	}
}
