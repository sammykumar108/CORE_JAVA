package weakHashMap_Programs;
class A
{
	A()
	{
		System.out.println("Object created");
	}
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Object deleted");
	}
}
public class Test1 {
	public static void main(String[] args) {
		A ob=new A();
		ob=null;
		System.gc();
	}
}
