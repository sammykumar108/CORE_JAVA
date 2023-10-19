package defaultMethodInInterface;

interface I1
{
	void m1();
	default void m2()
	{
		System.out.println("hi");
	}
}
class A implements I1
{
	public void m1()
	{
		
	}
	public void m2()
	{
		System.out.println("hello");
	}
	
}

public class Test1 
{

}
