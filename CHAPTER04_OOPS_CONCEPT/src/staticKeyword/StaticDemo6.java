package staticKeyword;

public class StaticDemo6 {

	static int no=10;
	void m1()
	{
		System.out.println(no);
	}
	public static void main(String[] args) {
//		StaticDemo6.m1(); //error
		StaticDemo6 ob=new StaticDemo6();
		ob.m1();
	}
}
