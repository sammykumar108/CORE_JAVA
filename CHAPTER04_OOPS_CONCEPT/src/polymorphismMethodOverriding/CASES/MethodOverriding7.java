package polymorphismMethodOverriding.CASES;

//Child class method should have equal or higher access modifiers as 
//Compared to Parent method access modifiers in Method Overriding 

// We can not Override private method,final and static methods.
class A8
{
	private void show()
	{
		System.out.println("'1");
	}
}
class B8 extends A8
{
	public void show()
	{
		System.out.println("2");
	}
}
public class MethodOverriding7 {

	public static void main(String[] args) {
		A8 ob3=new B8();
		ob3.show();
	}
}
