package runnableExample;

// By using 'Runnable' interface

class MyThread1 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Child thread:" +i);
		}
	}
	void show()
	{
		System.out.println("Hi");
	}
}
public class Test {
	public static void main(String[] args) {
		MyThread1 mt1=new MyThread1();
		Thread t=new Thread();
		t.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread:" +i);
		}
		mt1.show();
	}
}
