package threadClassMethods;

//<3>  Daemon thread methods
// isDaemon()->this method is used to check weather the thread is daemon thread or not.
// setDaemon(boolean b)->this method is used to create daemon thread.
public class Test4 extends Thread {
	public void run()
	{
		System.out.println("Hi");
		System.out.println("Child thread :" +Thread.currentThread());
		
	}

	public static void main(String[] args) {
		Test4 test4=new Test4();
		test4.setDaemon(true);
		test4.start();
		System.out.println("Main Thread :" +Thread.currentThread().isDaemon());
	}
}
