package basicPrgrams;

// WAP to Remove all the duplicate character from the String
import java.util.Arrays;

public class RemAllDuplicate {
	public static void main(String[] args) {
		String string="deepak java";
		char[] ch=string.toCharArray();
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					break;
				}
			}
			if(i==j)
			{
				ch[count]=ch[i];
				count++;
			}
		}
//		System.out.println(ch);
//		while(count<string.length())
//		{
//			ch[count]=' ';
//			count++; 
//		}
//		System.out.println(ch);
		//By Predefined method
		
		String newString=String.valueOf(Arrays.copyOf(ch, count));
		System.out.println(newString);
	}
}
