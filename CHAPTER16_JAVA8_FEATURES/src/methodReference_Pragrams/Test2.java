package methodReference_Pragrams;
interface I2
{
	void m1();
}
class A2
{
	static void m2()
	{
		System.out.println("hi");
	}
}
public class Test2 {
	public static void main(String[] args) {
		I2 i=A2 :: m2;
		i.m1();
	}
}
