package superKeyword;

// super keyword can be used to refer the immediate parent class instance variable

class A
{
	int no=10;
}
class B extends A
{
	int no=20;
	void show(int no)
	{
//		System.out.println(no);   // 30
//		System.out.println(this.no); // 20
		System.out.println(super.no); //10
	}
}
public class SuperTest1 {
	public static void main(String[] args) {
		B ob=new B();
		ob.show(30);
	}
}
