package isArelationship.SingleInheritance;

class A
{
	void show1()
	{
		System.out.println("I am in Class A");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("I am in Class B");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		A ob1=new A();
		ob1.show1();
//		ob1.show2();
		B ob2=new B();
		ob2.show2();
		ob2.show1();
	}	
	

}
