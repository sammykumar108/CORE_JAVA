package differentThreadCases;

//Performing Multiple Task from Multiple Threads
class MyThread4 extends Thread
{
	public void run()
	{
		System.out.println("Hi");
	}
}
class MyThread44  extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
}
class MyThread444 extends Thread
{
	public void run()
	{
		System.out.println("Hey");
	}
}
 
public class Test4 {
	public static void main(String[] args) {
		MyThread4 mt1=new MyThread4();
		mt1.start();
		
		MyThread44 mt2=new MyThread44();
		mt2.start();
		
		MyThread444 mt3=new MyThread444();
		mt3.start();
	}
}
