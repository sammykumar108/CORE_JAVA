package multithreadingCASES;

class Abc1 extends Thread
{
	public void run()
	{
		System.out.println("Hi");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Abc1 ob1=new Abc1();
		ob1.start();
		
	}
}
