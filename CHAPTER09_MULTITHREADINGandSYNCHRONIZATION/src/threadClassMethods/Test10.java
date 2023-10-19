package threadClassMethods;

// join()->
class MyThread10 extends Thread
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
	}
}
public class Test10 {
	public static void main(String[] args) {
		MyThread10 mt=new MyThread10();
		mt.start();
		try {
			mt.join(); //this line will be executed by main thread,thus main thread will wait for another thread(Thread-o-mt) to complete its task.
			
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello:" +i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
		}
	}
}
