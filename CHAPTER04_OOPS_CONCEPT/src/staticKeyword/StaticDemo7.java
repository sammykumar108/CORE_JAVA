package staticKeyword;

// static block will be executed from top to bottom.
public class StaticDemo7 {
	
	static
	{
		System.out.println("I am in static block");
	}
	public static void main(String[] args) {
		System.out.println("I am in main method");
	}
}
