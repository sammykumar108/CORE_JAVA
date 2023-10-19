package BasicProgram;

//5-> 1,5  	Factor is 1 and itself
public class PrimeNumber {

	public static void main(String[] args) {
		int no=7;
		boolean b=false;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				b=true;
			}
		}
		if(b==true)
		{
			System.out.println("Not Prime Number");
		}
		else
		{
			System.out.println("No is Prime");
		}
	}
}
