package polymorphismMethodOverriding.CASES;

//We can not Override Main Method

class A11
{
	public static void main(String[] args) {
		System.out.println("1");
	}
}
class B11 extends A11
{
	public static void main(String[] args) {
		System.out.println("2");
	}
}
public class MethodOverriding9 {
	public static void main(String[] args) {
		A11 ob3=new B11();
		String[] str= {"a","b","c"};
		ob3.main(str);
	}
}
