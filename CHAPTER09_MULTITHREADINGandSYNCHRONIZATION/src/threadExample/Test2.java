package threadExample;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Child Thread:" +i);
		}
	
	}
}
public class Test2 {
	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			System.out.println("Main Thread:" +i);
		}
		MyThread t1=new MyThread();
		t1.start();
	}
}
