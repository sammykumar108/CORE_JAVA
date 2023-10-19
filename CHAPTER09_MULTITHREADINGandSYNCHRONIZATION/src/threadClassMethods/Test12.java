package threadClassMethods;

//<6> Thread Interrupting methods
// interrupt()->It is used to interrupt the thread.
// It will work only when the thread is in sleeping or waiting state otherwise interrupt statement will be of no use.
// It throws an exception "java.lang.InterruptedException".
class MyThread12 extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi :" +i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello :" +i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Test12 {
	public static void main(String[] args) {
		MyThread12 mt=new MyThread12();
		mt.start();
		mt.interrupt();
	}
}
