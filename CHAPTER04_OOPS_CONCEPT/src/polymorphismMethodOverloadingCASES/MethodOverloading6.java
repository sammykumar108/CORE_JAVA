package polymorphismMethodOverloadingCASES;

class Test2
{
	void display(int a)
	{
		System.out.println("1:" +a);
	}
	void display(char c)
	{
		System.out.println("2:" +c);
	}
}
public class MethodOverloading6 {
	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.display('d');
		test2.display(10);
	
	}
}
