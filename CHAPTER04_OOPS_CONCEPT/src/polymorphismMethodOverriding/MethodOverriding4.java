package polymorphismMethodOverriding;

class A3
{
	void show(int a) {
		System.out.println(a);
	}
}
class B3 extends A3
{
	void show(String a)
	{
		System.out.println(a);
	}
}
public class MethodOverriding4 {
	public static void main(String[] args) {
		A3 ob3=new B3();
		ob3.show(10);
//		ob3.show("deepak"); //error
	}
}
