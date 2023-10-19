package polymorphismMethodOverloadingCASES;

class Test
{
	void display(int a)
	{
		System.out.println(a);
	}
}
public class MethodOverloading4 {
	public static void main(String[] args) {
		Test test=new Test();
		test.display('d');
	}
}
