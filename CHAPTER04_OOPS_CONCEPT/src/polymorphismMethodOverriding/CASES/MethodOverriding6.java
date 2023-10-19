package polymorphismMethodOverriding.CASES;

//We can provide child class as a return type for Overriding method 
// and this concept is as Covariant return type. 
// Covariant :- 
// -> Before JDK 1.5 version, Covariant return type concept was not there.
//-> But JDK 1.5 version and above version we can provide any child class
// as a return type for Overriding method.
class Parent{
	
}
class Child extends Parent
{
	
}
class Child2 extends Parent
{
	
}
class A7
{
	Parent show()
	{
		System.out.println("1");
		return new Parent();
	}
}
class B7 extends A7
{
	Child show()
	{
		System.out.println("2");
		return new Child();
	}
}
public class MethodOverriding6 {
	public static void main(String[] args) {
		A7  ob3=new B7();
		ob3.show();
	}
}
