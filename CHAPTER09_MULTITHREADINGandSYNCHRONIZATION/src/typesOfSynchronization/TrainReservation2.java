package typesOfSynchronization;

//How to achieve Synchronization?
//By Synchronized  block

class BookTrainSeat2{
	int total_seats=10;
	void bookSeat(int seats,String name)
	{
		//1000 lines of code
		
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+ ":" +i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		synchronized (this) {
			if (total_seats>=seats) 
			{
				System.out.println(name +"booked" +seats +"seats successfully");
				total_seats=total_seats-seats;
				System.out.println("Total seats left:" +total_seats );
			}
			else {
				System.out.println(name +"sorry---!! seats not left");
				System.out.println("Total seats left:" +total_seats);
			}
		}
		// 1000 lines of code
	}
	
}
class MyThread2 extends Thread
{
	BookTrainSeat2 bts;
	int seats;
	public MyThread2(BookTrainSeat2 bts, int seats)
	{
		this.bts=bts;
		this.seats=seats;
		
	}
	public void run()
	{
		bts.bookSeat(seats,Thread.currentThread().getName());
	}
}
public class TrainReservation2 {
	public static void main(String[] args) {
		BookTrainSeat2 bts=new BookTrainSeat2();
		
		MyThread2 deepak=new MyThread2(bts, 5);
		deepak.setName("Deepak");
		deepak.start();
		
		MyThread2 amit=new MyThread2(bts, 3);
		amit.setName("Amit");
		amit.start();
		
		MyThread2 rahul=new MyThread2(bts, 4);
		rahul.setName("Rahul");
		rahul.start();
	}
}
