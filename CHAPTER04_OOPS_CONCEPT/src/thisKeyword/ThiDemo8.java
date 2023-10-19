package thisKeyword;

// this keyword can be used to pass as an argument in the constructor
class Test1
{
	void m1()
	{
		XYZ ob=new XYZ(this);
	}
}
class XYZ
{
	XYZ(Test1 t)
	{
		System.out.println(t);
	}
}
public class ThiDemo8 {
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1();
	}
}
