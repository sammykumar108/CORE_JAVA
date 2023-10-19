package threadClassMethods;

// By constructor
class MyThread11 extends Thread
{
	Thread t;
	public MyThread11() {
		this.t=t;
	}
	public void run()
	{
		try {
			t.join();
			for(int i=1;i<=5;i++) {
				System.out.println("Hi :" +i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Test11 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		MyThread11 mt=new MyThread11();
		mt.start();
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
