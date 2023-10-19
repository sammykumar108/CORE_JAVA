package polymorphismMethodOverloadingCASES;

//Constructor Overloading
class Test7
{
	Test7() {
		System.out.println("1");
	}
	Test7(int a)
	{
		System.out.println("2");
	}
}
public class MethodOverloading13 {
	public static void main(String[] args) {
		new Test7();
		Test7 test7=new Test7(10);
	}
}
