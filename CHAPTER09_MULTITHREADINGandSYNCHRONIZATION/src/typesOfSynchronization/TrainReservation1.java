package typesOfSynchronization;

// How to achieve Synchronization?
// By Synchronized  Method
class BookTrainSeat1
{
	int total_seats=10;
	synchronized void bookSeat(int seats,String name)
	{
		if (total_seats>=seats) {
			System.out.println(name +" " +"booked" +" " +seats +" " +"seats successfully");
			total_seats=total_seats-seats;
			System.out.println("Total seats left:" + total_seats);
		}
		else {
			System.err.println(name +" " +"sorry---!!! seats not left");
			System.err.println("Total seats left:" +total_seats);
		}
	}
}
class MyThread1 extends Thread{
	BookTrainSeat1 bts;
	int seats;
	public MyThread1(BookTrainSeat1 bts,int seats)
	{
		this.bts=bts;
		this.seats=seats;
	}
	public void run()
	{
		bts.bookSeat(seats,Thread.currentThread().getName());
	}
}
public class TrainReservation1 {

	public static void main(String[] args) {
		BookTrainSeat1 bts=new BookTrainSeat1();
		
		MyThread1 deepak=new MyThread1(bts, 5);
		deepak.setName("Deepak");
		deepak.start();
		
		MyThread1 amit=new MyThread1(bts, 3);
		amit.setName("Amit");
		amit.start();
		
		MyThread1 rahul=new MyThread1(bts, 4);
		rahul.setName("Rahul");
		rahul.start();
	}
}
