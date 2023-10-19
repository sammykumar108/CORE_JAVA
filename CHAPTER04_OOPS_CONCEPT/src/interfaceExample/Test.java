package interfaceExample;

interface A1
{
	void start();
}
interface B1
{
	void start();
}
public class Test implements A1,B1{
	public void start()
	 {
		 System.out.println("1");
	 }
	public static void main(String[] args) {
		Test ob=new Test();
		ob.start();
	}
}
