package threadClassMethods;

//<2> Naming methods
// getName()-> this method is used to get the current running thread name.
// setName()-> this method is used to set the name of current running thread. 
public class Test3  extends Thread{
	public void run()
	{
		System.out.println("Hi");
		System.out.println("Old Child Thread Name:" +Thread.currentThread().getName());
		Thread.currentThread().setName("my_child_thread");
		System.out.println("New Child Thread Name:" +Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("Old main Thread Name:" +Thread.currentThread().getName());
		Thread.currentThread().setName("my_main_thread");
		System.out.println("New main Thread Name:" +Thread.currentThread().getName());
		 Test3 test3=new Test3();
		 test3.start();
	}

}
