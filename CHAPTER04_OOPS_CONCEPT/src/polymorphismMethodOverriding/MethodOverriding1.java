package polymorphismMethodOverriding;

//It is not Method Overriding because Method name is not same  
class A
{
	void show1()
	{
		System.out.println("1");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("2");
	}
}
public class MethodOverriding1 {
	public static void main(String[] args) {
		A ob1=new A();
		ob1.show1();
		
		B ob2=new B();
		ob2.show2();
		
		A ob3=new A();
		ob3.show1();
//		ob3.show2();  //not possible
	}
}
