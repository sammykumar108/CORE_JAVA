package basicPrgrams;

//Wap to count total number of words in the String
public class CountStringWords {
	public static void main(String[] args) {
		String string="this is my first\n demo\t";
		int count=0;
		boolean b=true;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)==' ' || string.charAt(i)=='\t' 
					|| string.charAt(i)=='\n')
			{
				b=true;
			}
			else if(b==true){
				b=false;
				count++;
			}
		}
		System.out.println("Total number of Words:" +count);
	}
}
