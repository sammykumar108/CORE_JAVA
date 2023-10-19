package threadClassMethods;

// yield() method->this method stops the current thread execution and provide the chance to the other thread to execute.
// output is not constant in case of yield() method.
class MyThread9 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +":" +Thread.currentThread().getName());
		}
	}
}
public class Test9 {
	public static void main(String[] args) {
		MyThread9 mt9=new MyThread9();
		mt9.start();
		
		Thread.yield();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +":" +Thread.currentThread().getName());
		}
	}
}
