package differentThreadCases;

// Performing Single Task from Single Thread 
class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("Hi");
	}
}
public class Test1 {
	public static void main(String[] args) {
		MyThread1 mt1=new MyThread1();
		mt1.start();
	}
}
