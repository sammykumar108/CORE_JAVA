package staticKeyword;

public class StaticDemo9 {

	static
	{
		System.out.println("I am in static block class StaticDemo1");
	}
	
	public static void main(String[] args) {
		System.out.println("I am in main method");
	}
	static
	{
		System.out.println("I am in static block class StaticDemo2");
	}
}
