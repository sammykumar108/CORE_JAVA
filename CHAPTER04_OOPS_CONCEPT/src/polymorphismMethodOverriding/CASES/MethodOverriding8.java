package polymorphismMethodOverriding.CASES;

// Q.Which method can not Override?
// ->private method can not Override
// ->final method can not be Override
// ->static method can not be Override

class A10
{
	final void show()
	{
		System.out.println("1");
	}
}
class B10 extends A10
{
	public void show()
	{
		System.out.println("2");
	}
}
public class MethodOverriding8 {
	public static void main(String[] args) {
		A10 ob3=new B10();
		ob3.show();
	}
}
