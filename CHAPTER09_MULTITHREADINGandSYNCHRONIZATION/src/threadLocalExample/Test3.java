package threadLocalExample;

class ThreadTask3 implements Runnable
{
	ThreadLocal tl=new ThreadLocal();
	public void run()
	{
		tl.set("deepak");
//		System.out.println("Hi:" +tl.get());
		display();
	}
	void display()
	{
		System.out.println("Hi:" +tl.get());
		tl.remove();
		System.out.println("Hi:" +tl.get());
	}
}
public class Test3 {
	public static void main(String[] args) {
		ThreadTask3 tt=new ThreadTask3();
		Thread t=new Thread(tt);
		t.start();
	}
}
