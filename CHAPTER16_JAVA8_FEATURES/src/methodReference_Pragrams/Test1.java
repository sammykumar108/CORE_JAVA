package methodReference_Pragrams;
@FunctionalInterface
interface I1
{
	void m1();
}
class A
{
	public void m2()
	{
		System.out.println("I am m1() method in class A");
	}
}
public class Test1 {
	public static void main(String[] args) {
		A ob=new A();
		I1 i=ob :: m2;
		i.m1();
	}
}
