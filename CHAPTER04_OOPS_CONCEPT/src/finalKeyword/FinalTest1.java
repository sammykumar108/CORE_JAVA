package finalKeyword;

// Variable(Variable value can not be changed, We can not re-assign final variable value)

class A
{
	void m1() {
		final int a=10;
//		a=a+20; //error
		System.out.println(a+20);
	}
}
public class FinalTest1 {
	public static void main(String[] args) {
		A ob=new A();
		ob.m1();
	}
}
