package staticNestedClass;

class Outer2
{
	private static int a=10;
	int b=20;
	static class Inner2
	{
		void show()
		{
			System.out.println(a);
//			System.out.println(b);
		}
	}
}
public class StaticNestedClass3 {
	public static void main(String[] args) {
		Outer2.Inner2 ob=new Outer2.Inner2();
		ob.show();
}
}
