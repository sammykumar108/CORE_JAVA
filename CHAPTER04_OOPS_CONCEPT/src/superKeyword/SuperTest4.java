package superKeyword;

// super keyword is used to invoke parent class constructor 
// -> If we don't provide super() in constructor then compiler provides it implicitly.

class A3
{
	A3()
	{
		System.out.println("I am A3 Class Constructor");
	}
}
class B3 extends A3
{
	B3()
	{
		System.out.println("I am in B3 Class Constructor");
	}
}
public class SuperTest4 {
	public static void main(String[] args) {
		B3 ob=new B3();
		
	}
}
