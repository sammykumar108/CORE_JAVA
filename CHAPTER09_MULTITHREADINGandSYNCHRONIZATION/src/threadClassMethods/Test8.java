package threadClassMethods;

//Prevent thread execution method
// sleep(long mili)->this method is used to pause the current running thread for the provided time period.
class MyThread8 extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(i +":" +Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Test8 {
	public static void main(String[] args) {
		MyThread8 mt3=new MyThread8();
		mt3.start();
		
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(i +":" +Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
