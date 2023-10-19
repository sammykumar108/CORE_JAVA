package threadExample;

//How to create threads
// ->By using 'Thread' class  
public class Test extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Test test=new Test();
		test.start();
	}

}
