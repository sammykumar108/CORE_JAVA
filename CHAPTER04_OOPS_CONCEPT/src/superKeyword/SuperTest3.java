package superKeyword;

class A2
{
	void show()
	{
		System.out.println("I am in class A2");
	}
}
class B2 extends A2
{
	void show()
	{
		System.out.println("I am in class B2");
	}
	void m1()
	{
		System.out.println("1");
		super.show();
		System.out.println("2");
	}
}
public class SuperTest3 {
	public static void main(String[] args) {
		B2 ob=new B2();
		ob.m1();
	}
}
