package typesOfSynchronization;

//How to achieve Synchronization?
//By  Static Synchronization

class BookTicket
{
	static int total_seats=10;
	static synchronized void bookTicket(int seats)
	{
		if (total_seats>=seats) {
			System.out.println("Success");
			total_seats=total_seats-seats;
			System.out.println("Seats left:" +total_seats);
		}
		else {
			System.out.println("fail");
		}
	}
}
class MyThread3 extends Thread
{
	BookTicket bt;
	int seats;
	public MyThread3(BookTicket bt, int seats) {
		this.bt=bt;
		this.seats=seats;
	}
	public void run()
	{
		bt.bookTicket(seats);
		
	}
}
class MyThread4 extends Thread
{
	BookTicket bt;
	int seats;
	public MyThread4(BookTicket bt, int seats) {
		this.bt=bt;
		this.seats=seats;
	}
	public void run()
	{
		bt.bookTicket(seats);
	}
}
public class TrainBooking {
	public static void main(String[] args) {
		BookTicket bt1=new BookTicket();
		
		MyThread3 t1=new MyThread3(bt1, 7);
		t1.start();
		
		MyThread3 t2=new MyThread3(bt1, 4);
		t2.start();
		
		BookTicket bt2=new BookTicket();
		
		MyThread4 t3=new MyThread4(bt2, 5);
		t3.start();
		
		MyThread4 t4=new MyThread4(bt2, 6);
		t4.start();
	}
}
