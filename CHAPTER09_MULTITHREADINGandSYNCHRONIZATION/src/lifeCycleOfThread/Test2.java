package lifeCycleOfThread;

class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Hi");
	}
}
public class Test2 {
	public static void main(String[] args) {
		MyThread2 mt1=new MyThread2();
		mt1.start();
//		mt1.start(); // It will provide an exception because we can not start one thread 2 times.
	}
}
