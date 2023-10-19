package threadClassMethods;

// Priority Based methods
// getPriority()->this method is used to get the priority of the thread.
// setPriority(int priority)->this method is used to det the priority of the thread.
class MyThread6 extends Thread
{
	public void run()
	{
		System.out.println("Hi:" +Thread.currentThread().getName());
		System.out.println("Child thread priority:" +Thread.currentThread().getPriority());
	}
}
public class Test6 {
	public static void main(String[] args) {
		MyThread6 mt=new MyThread6();
		mt.start();
//		mt.setPriority(8);
//		System.out.println("Child thread Priority:" +mt.getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Hello:" +Thread.currentThread().getName());
		System.out.println("Main thread priority:" +Thread.currentThread().getPriority());
	}
}
