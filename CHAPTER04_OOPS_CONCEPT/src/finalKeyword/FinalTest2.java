package finalKeyword;

// method(method can not be Override)
class A1
{
	final void m1()
	{
		System.out.println("I am in class A1");
	}
}
class B1 extends A1
{
	void m1()
	{
		System.out.println("I am in class B1");
	}
}
public class FinalTest2 {
	public static void main(String[] args) {
		A1 ob=new B1();
		ob.m1();
	}
}
