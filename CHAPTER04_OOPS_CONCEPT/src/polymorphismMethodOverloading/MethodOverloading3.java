package polymorphismMethodOverloading;

//SEQUENCE OF PARAMETER
class Test3
{
	void display(String a,int b)
	{
		System.out.println(a +"," +b);
	}
	void display(int a, String b)
	{
		System.out.println(a +"," +b);
	}
}
public class MethodOverloading3 {
	public static void main(String[] args) {
		Test3 test3=new Test3();
		test3.display(10, "deepak");
		test3.display("deepak", 10);
	}
}
