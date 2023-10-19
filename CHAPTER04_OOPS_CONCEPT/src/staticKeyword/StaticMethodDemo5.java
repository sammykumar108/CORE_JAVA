package staticKeyword;

class A4
{
	void show1()
	{
		System.out.println("1");
	}
	static void show2()
	{
		this.show1(); // Cannot use this in a static context

		System.out.println("2");
	}
}
public class StaticMethodDemo5 {
	public static void main(String[] args) {
		A4.show2();
	}
}
