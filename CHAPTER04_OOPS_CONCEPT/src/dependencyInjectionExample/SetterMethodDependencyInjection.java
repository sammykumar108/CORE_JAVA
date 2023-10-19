package dependencyInjectionExample;

//SETTER METHOD DEPENDENCY INJECTION
class A1
{
	
}
class B1
{
	int bb;
	public void setb(A1 a)
	{
		
	}
}
public class SetterMethodDependencyInjection {
	public static void main(String[] args) {
		A1 ob2=new A1();
		B1 ob1=new B1();
		ob1.setb(ob2);
		System.out.println(ob1);
	}
}
