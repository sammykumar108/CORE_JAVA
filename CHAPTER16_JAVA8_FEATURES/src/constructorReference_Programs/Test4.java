package constructorReference_Programs;
interface I4
{
	void m1();
}
class A4
{
	A4()
	{
		System.out.println("constructor---!!");
	}
}
public class Test4 {
	public static void main(String[] args) {
		//new A4();
		I4 i=A4 :: new;
		i.m1();
	}
}
