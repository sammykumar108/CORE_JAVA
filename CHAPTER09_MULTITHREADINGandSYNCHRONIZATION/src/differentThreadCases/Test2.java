package differentThreadCases;

//Performing Single Task from Multiple Thread
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("Hi");
	}
}
public class Test2 {
	public static void main(String[] args) {
		MyThread2 mt2=new MyThread2();
		mt2.start();
		
		MyThread2 mt22=new MyThread2();
		mt22.start();
	}
}
