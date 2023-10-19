package continueStatementExample;


//case 2: There should not be any statement after continue statement
public class ContinueDemo2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				System.out.println(i);
				continue;
				System.out.println(i);
			}
		}
	}
}
