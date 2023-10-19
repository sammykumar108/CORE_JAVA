package thisKeyword;

class Test3
{
	public Test3() {
		this(10);
		System.out.println("Default Construtor");
	}
	Test3(int a)
	{
		this("deepak");
		System.out.println(a);
	}
	Test3(String a)
	{
		System.out.println(a);
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Test3 ob1=new Test3();
	}
}
