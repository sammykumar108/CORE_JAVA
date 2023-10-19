package polymorphismMethodOverriding.CASES;

class A9
{
	void show()
	{
		System.out.println("1");
	}
}
class B9 extends A9
{
	protected void show()
	{
		System.out.println("2");
	}
}
public class MethodOverriding7A {
	public static void main(String[] args) {
		A9 ob3=new B9();
		ob3.show();
				
	}
}
