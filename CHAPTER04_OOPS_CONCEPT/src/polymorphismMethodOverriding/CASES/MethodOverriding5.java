package polymorphismMethodOverriding.CASES;

//If we change the return type in method overriding then it will provide 
// compile error
class A5
{
	int show()
	{
		System.out.println("1");
		return 0;
	}
}
class B5 extends A5
{
	void show()
	{
		System.out.println("2");
	}
}
public class MethodOverriding5 {
	public static void main(String[] args) {
		A5 ob3=new B5();
		ob3.show();
	}
}
