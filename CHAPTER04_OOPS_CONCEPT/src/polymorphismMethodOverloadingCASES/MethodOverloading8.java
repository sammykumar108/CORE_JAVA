package polymorphismMethodOverloadingCASES;

class Test4
{
	void display(Object a)
	{
		System.out.println("1");
	}
	void display(String a)
	{
		System.out.println("2");
	}
}
public class MethodOverloading8 {
	public static void main(String[] args) {
		Test4 test4=new Test4();
		test4.display(null);
	}
}
