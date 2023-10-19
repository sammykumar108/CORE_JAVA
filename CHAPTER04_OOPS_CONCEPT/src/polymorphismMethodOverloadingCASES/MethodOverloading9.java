package polymorphismMethodOverloadingCASES;

class Test5
{
	void display(Object a)
	{
		System.out.println("1");
	}
	void display(String a)
	{
		System.out.println("2");
	}
	void display(StringBuilder a)
	{
		System.out.println("3");
	}
}
public class MethodOverloading9 {
	public static void main(String[] args) {
		Test4 test4=new Test4();
//		test4.display(null);
		test4.display("deepak");
		test4.display(new StringBuilder("amit"));
		Object object=new Object();
		test4.display(0);
	}
}
