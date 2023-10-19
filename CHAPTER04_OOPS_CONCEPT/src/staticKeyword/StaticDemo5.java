package staticKeyword;

// We can not use instance variable inside static method but we can 
// use static variable inside instance method.
public class StaticDemo5 {
	static int no=10;
	
	public static void main(String[] args) {
//		StaticDemo5 ob=new StaticDemo5();
//		System.out.println(ob.no);
		System.out.println(no);
	}
}
