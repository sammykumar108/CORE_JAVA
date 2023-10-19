package breakStatementExample;

//case 1: There should not be any statement just after the break statement
public class BreakDemo2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				System.out.println(i);
				break;
				System.out.println("hi");
			}
		}
		System.out.println("hello");
	}
}
