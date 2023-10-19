package lambda_ActionListener_program;

public class Test8
{
	public static void main(String[] args) {
		Runnable r=()->
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("hi i am in child thread");
				}
			};
		Thread t=new Thread(r);
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("hi i am in main thread");
		}
	}
}





/*
public class Test7 implements Runnable 
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("hi i am in child thread");
		}
	}

	
	public static void main(String[] args) {
		Test7 ob=new Test7();
		Thread t=new Thread(ob);
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi i am main thread");
		}
	}
}
*/