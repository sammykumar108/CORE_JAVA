package basicPrgrams;
//WAP to print all the duplicate characters in the string
public class AllDuplicateChars {
	public static void main(String[] args) {
		String string="abdcdbdd";
		string=string.replaceAll("\\s","");
//		System.out.println(string);
		int[] arr=new int[126];
		for(int i=0;i<string.length();i++)
		{
			arr[string.charAt(i)]=arr[string.charAt(i)]+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				System.out.println((char)i +" " +"repeated" +" " +arr[i] +"times");
			}
		}
	}
}
