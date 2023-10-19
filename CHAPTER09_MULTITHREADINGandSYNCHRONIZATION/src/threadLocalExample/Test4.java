package threadLocalExample;

class ThreadTask4 implements Runnable
{
	ThreadLocal tl;
	public ThreadTask4(ThreadLocal tl)
	{
		this.tl=tl;
		
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +":" +tl.get());
	}
}
public class Test4 {
	public static void main(String[] args) {
		ThreadLocal tl=new ThreadLocal();
		tl.set(100);
		System.out.println(Thread.currentThread().getName() +":" +tl.get());
		ThreadTask4 tt=new ThreadTask4(tl);
		
		Thread t=new Thread(tt);
		t.start();
		
	}
}
