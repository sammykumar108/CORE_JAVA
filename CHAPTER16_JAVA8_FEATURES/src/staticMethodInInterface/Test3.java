package staticMethodInInterface;

interface I3
{
	void m1();
	static void m2()
	{
		System.out.println("I am static method ");
	}
}
class A3 implements I3
{
	public void m1()
	{
		
	}
}
public class Test3 
{
	public static void main(String[] args) 
	{
		I3.m2();
	}
}
