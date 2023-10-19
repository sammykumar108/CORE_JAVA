package superKeyword;

// super() should always be the first statement in Constructor.
class A4
{
	A4()
	{
		System.out.println("I am A4 Class Constructor");
	}
}
class B4 extends A4
{
	B4()
	{
		System.out.println("I am in B4 class Constructor");
//		super(); //Error->because call to super must be first statement in constructor
		
		
	}
}
public class SuperTest5 {
	public static void main(String[] args) {
		B4 ob=new B4();
	}
}
