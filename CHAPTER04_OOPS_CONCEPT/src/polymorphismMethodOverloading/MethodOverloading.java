package polymorphismMethodOverloading;

//TYPE OF PARAMETER
class Test1{
	void sum(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	void sum(float a,float b)
	{
		float res=a+b;
		System.out.println(res);
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.sum(10, 20);
		test1.sum(10.4f, 20.7f);
	}
}
