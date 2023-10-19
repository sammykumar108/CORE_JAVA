package thisKeyword;

// this keyword can be used to pass as an argument in the method
// This case is mainly used in event handling
class Test
{
	void m1()
	{
		System.out.println("1");
		m2(this);
	}
	void m2(Test t)
	{
		System.out.println(t);
	}
}
public class ThisDemo7 {
	public static void main(String[] args) {
		Test test=new Test();
		test.m1();
	}
}
