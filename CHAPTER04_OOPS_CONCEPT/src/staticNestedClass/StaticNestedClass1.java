package staticNestedClass;

//Static Nested Class can access only static variables of outer class.
class Outer
{
	static class Inner
	{
		void show()
		{
			System.out.println("1");
		}
	}
}
public class StaticNestedClass1 {
	public static void main(String[] args) {
		Outer.Inner ob=new Outer.Inner();
		ob.show();
	}
}
