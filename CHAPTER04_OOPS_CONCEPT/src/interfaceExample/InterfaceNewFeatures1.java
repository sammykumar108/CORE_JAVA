package interfaceExample;

interface I3
{
	default void show()
	{
		System.out.println("I am default method");
	}
}
class Test1 implements I3
{
	
}
public class InterfaceNewFeatures1 {
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.show();
	}
}
