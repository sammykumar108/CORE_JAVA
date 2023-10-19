package dependencyInjectionExample;
 class A2
 {
	 B2 b2;   //instance variables
	 public void setB2(B2 b3)
	 {
		 b2=b3;
	 }
 }
 class B2
 {
	 A2 a2;
	 public void set(A2 a3)
	 {
		 a2=a3;
	 }
 }
public class CircularDI {
	public static void main(String[] args) {
		A2 ob1=new A2();
		B2 ob2=new B2();
		ob1.setB2(ob2);
		ob2.set(ob1);
		System.out.println(ob1);
	}
}
