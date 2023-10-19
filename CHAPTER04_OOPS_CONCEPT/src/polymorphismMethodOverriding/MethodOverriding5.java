package polymorphismMethodOverriding;

class A4
{
	void show(int a,String b)
	{
		System.out.println(a);
	}
}
class B4 extends A4
{
	void show(int a, String b)
	{
		System.out.println(a);
	}
}
public class MethodOverriding5 {
	public static void main(String[] args) {
		A4 ob3=new B4();
		ob3.show(10,"deepak");
	}
}
