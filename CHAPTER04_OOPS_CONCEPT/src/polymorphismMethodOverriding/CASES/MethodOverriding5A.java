package polymorphismMethodOverriding.CASES;

//If we change the return type in method overriding then it will provide 
//compile error
class A6
{
	void show()
	{
		System.out.println("1");
		return 0;
	}
}
class B6 extends A6
{
	int show()
	{
		System.out.println("2");
	}
}
public class MethodOverriding5A {
	public static void main(String[] args) {
		A6 ob3=new B6();
		ob3.show();
	}
}
