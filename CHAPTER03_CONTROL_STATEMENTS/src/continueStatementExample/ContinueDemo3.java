package continueStatementExample;

//case 3:If there are nested for loop and we want to skip the current 
// iteration for outer for loop then we can use labeled continue statement.
public class ContinueDemo3 {
	public static void main(String[] args) {
		outer:
			for(int i=1;i<=3;i++)
			{
				inner:
					for(int j=1;j<=3;j++)
					{
						if(i==2)
						{
							continue outer;
						}
						System.out.println(i);
					}
			}
	}
}
