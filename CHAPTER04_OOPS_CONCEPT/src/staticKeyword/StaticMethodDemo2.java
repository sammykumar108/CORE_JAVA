package staticKeyword;

class A1
{
	void show1()
	{
		System.out.println("1");
	}
	static void show2()
	{
		System.out.println("2");
	}
}
public class StaticMethodDemo2 {
	public static void main(String[] args) {
		A1 ob=new A1();
		ob.show1();
		
		A1.show2();
//		show2();
	}
}
