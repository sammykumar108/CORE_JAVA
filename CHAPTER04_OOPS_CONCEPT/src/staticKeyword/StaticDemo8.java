package staticKeyword;

class A{
	static
	{
		System.out.println("I am in static block class A");
	}
}
public class StaticDemo8 {

	static 
	{
		System.out.println("I am in static block class StaticDemo8");
	}
	public static void main(String[] args) {
		A ob=new A();
		System.out.println("I am in main method");
	}
}
