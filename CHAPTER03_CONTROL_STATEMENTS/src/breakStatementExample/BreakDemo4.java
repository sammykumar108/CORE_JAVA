package breakStatementExample;

//case 3: If we want to terminate nested loop according to our needs
// then we can use labeled break statement
public class BreakDemo4 {
	public static void main(String[] args) {
		outer:
			for(int i=1;i<=3;i++)
			{
				System.out.println("i:" +i);
				inner:
					for(int j=1;j<=3;j++)
					{
						System.out.println("j:" +j);
						if(j==2)
						{
							break outer;
						}
					}
			}
	}
}
