package isArelationship.MultipleInheritance;

// Java does not support Multiple Inheritance because prevent ambiguity 
class A
{
	void show1()
	{
		System.out.println("1");
	}
}
class B
{
	void show1()
	{
		System.out.println("2");
	}
}
public class C extends A,B{
	public static void main(String[] args) {
		C ob=new C();
		ob.show1();
	}

}
