package javaNestedClassExample;

interface Vehicle2
{
	void start();

}
public class AnonymousInnerClass3 {
	public static void main(String[] args) {
		Vehicle2 v=new Vehicle2() {
			
			@Override
			public void start() {
				System.out.println("Starts with Key");
				
			}
		};
		v.start();
	}
}
