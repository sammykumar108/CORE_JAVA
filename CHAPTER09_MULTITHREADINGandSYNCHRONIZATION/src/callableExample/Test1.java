package callableExample;

class ThreadTask implements Runnable{
	public void run()
	{
		System.out.println("Hi");
	}
}
public class Test1 {
	public static void main(String[] args) {
		ThreadTask threadTask=new ThreadTask();
		Thread t1=new Thread(threadTask);
		t1.start();
	}
}
