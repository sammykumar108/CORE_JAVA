package reentrantlockClassExample;

import java.util.concurrent.locks.ReentrantLock;

class BookTicket
{
	ReentrantLock re=new ReentrantLock();
	int total_seats=10;
	void bookTicket (int seats)
	{
		re.lock();
		re.lock();
		re.lock();
		if(total_seats>=seats)
		{
			System.out.println("Success");
			total_seats=total_seats-seats;
			System.out.println("Seat left:" +total_seats);
		}
		else
		{
			System.out.println("fail");
		}
		try {
			System.out.println("---------------------------------------------------");
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		re.unlock();
		m1();
	}
	void m1()
	{
		System.out.println("Hiiiiiii");
		re.unlock();
		re.unlock();
	}
	
}
class MyThread1 extends Thread
{
	BookTicket bt;
	int seats;
	public MyThread1(BookTicket bt,int seats) {
		this.bt=bt;
		this.seats=seats;
		
	}
	public void run()
	{
		bt.bookTicket(seats);
	}
}
class MyThread2 extends Thread
{
	BookTicket bt;
	int seats;
	public MyThread2(BookTicket bt,int seats) {
		this.bt=bt;
		this.seats=seats;
	}
	public void run()
	{
		bt.bookTicket(seats);
	}
}
public class Test1 {
	public static void main(String[] args) {
		BookTicket bt1=new BookTicket();
		MyThread1 t1=new MyThread1(bt1, 7);
		t1.start();
		
		MyThread2 t2=new MyThread2(bt1, 4);
		t2.start();
	}
}
