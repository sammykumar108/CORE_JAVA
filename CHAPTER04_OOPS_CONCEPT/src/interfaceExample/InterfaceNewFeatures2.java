package interfaceExample;

interface I4
{
	static void show()
	{
		System.out.println("I am Static method");
	}
}
public class InterfaceNewFeatures2 {
	public static void main(String[] args) {
		I4.show();
	}
}
