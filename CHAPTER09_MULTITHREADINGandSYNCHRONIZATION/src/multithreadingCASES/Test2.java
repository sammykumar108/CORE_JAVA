package multithreadingCASES;

class Abc2 extends Thread
{
	public void start()
	{
		System.out.println("Hi");
	}
}
public class Test2 {
	public static void main(String[] args) {
		Abc2 ob1=new Abc2();
		ob1.start();
	}
}
