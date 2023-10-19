package threadClassMethods;

// Real world Example
class TakeAdMisn extends Thread
{
	public void run()
	{
		try {
			System.out.println("Admission Starts");
			Thread.sleep(5000);
			System.out.println("You have taken the admission Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class DepositFee extends Thread
{
	public void run()
	{
		try {
			System.out.println("Depositing Fee");
			Thread.sleep(3000);
			System.out.println("You have deposit the fee successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class TakeRollNo extends Thread
{
	public void run()
	{
		try {
			System.out.println("Take Roll No");
			Thread.sleep(1000);
			System.out.println("Now you can sit in exams--------!!!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class ClgAdmin {
	public static void main(String[] args) throws InterruptedException {
		TakeAdMisn t1=new TakeAdMisn();
		t1.start();
		t1.join();
		
		DepositFee t2=new DepositFee();
		t2.start();
		t2.join();
		
		TakeRollNo t3=new TakeRollNo();
		t3.start();
	}
}
