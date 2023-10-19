package threadClassMethods;

// isInterrupted()->It is used to check the thread interrupt status.
//It will return true if interrupt status is true otherwise it will return false.

class MyThread13 extends Thread
{
	public void run()
	{
		System.out.println("Is thread interrupted(1):" +Thread.currentThread().isInterrupted());
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi:" +i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Is thread interrupted(2):" +Thread.currentThread().isInterrupted());
	}
}
public class Test13 {
	public static void main(String[] args) {
		MyThread13 mt=new MyThread13();
		mt.start();
		mt.interrupt();
	}
}
