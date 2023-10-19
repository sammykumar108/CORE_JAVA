package polymorphismMethodOverloadingCASES;

//This program is not Method Overloading because return type is not same
class Test6
{
	void display(int a)
	{
		System.out.println("1");
	}
	int display(String a)
	{
		System.out.println("2");
		return 0;
	}
}
public class MethodOverloading10 {
	public static void main(String[] args) {
		Test6 test5=new Test6();
		test6.display(10);
		test6.display("deepak");
	}
}
