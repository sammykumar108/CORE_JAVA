package polymorphismMethodOverloading;


//TYPE OF PARAMETER
class Test2
{
	void display(String a)
	{
		System.out.println(a);
	}
	void display(int a)
	{
		System.out.println(a);
	}
}
public class MetodOverloading2 {
	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.display(10);
		test2.display("deepak");
	}
}
