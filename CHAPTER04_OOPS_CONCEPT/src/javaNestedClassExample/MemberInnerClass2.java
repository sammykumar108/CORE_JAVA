package javaNestedClassExample;

class Outer1
{
	private int a=10;
	class Inner1
	{
		void show2()
		{
			System.out.println(a);
		}
	}
}
public class MemberInnerClass2 {
	public static void main(String[] args) {
		Outer1 ob1=new Outer1();
		Outer1.Inner1 ob2=ob1.new Inner1();
	}
}
