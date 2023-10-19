package BasicProgram;

public class PrintAllPrimeNumber {
	public static void main(String[] args) {
		for(int no=2;no<=100;no++)
		{
			boolean b=false;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					b=true;
				}
			}
			if(b==false)
			{
				System.out.println(no);
			}
		}
	}
}
