package polymorphismMethodOverloadingCASES;

class Test3
{
	void display(int a)
	{
		System.out.println("First method:" +a);
	}
	void display(int... a) //Var args
	{
		for (int i:a) //foreach
		{
			System.out.println(i +" ");
		}
		System.out.println();
	}
}
public class MethodOverloading7 {
	public static void main(String[] args) {
		Test3 test3=new Test3();
		test3.display();
		test3.display(10);
		test3.display(10,30);
	}
}
