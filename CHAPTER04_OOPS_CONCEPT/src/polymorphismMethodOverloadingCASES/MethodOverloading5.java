package polymorphismMethodOverloadingCASES;

class Test1
{
	void display(int a)
	{
		System.out.println(a);
	}
}
public class MethodOverloading5 {
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.display('d');
		test1.display(10);
	}
}
