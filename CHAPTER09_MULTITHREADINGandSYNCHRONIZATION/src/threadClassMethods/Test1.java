package threadClassMethods;

//<1> Simple Methods
// run() ->this method contains the thread task
// start() ->this method is used to create thread
// currentThread() ->this method returns the reference of current thread.
// isAlive() -> this method is used to check weather the thread is running or not.
public class Test1 extends Thread {
	public void run()
	{
		System.out.println("HI");
		System.out.println("1:" +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
	}
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.start();
		
		System.out.println("2:" +Thread.currentThread().getName());
		System.out.println(test1.isAlive());
	}
}
