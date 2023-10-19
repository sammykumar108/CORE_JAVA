package typesOfSynchronization;

//NOTE:- Whenever we execute multiple threads, all the threads starts their execution  
//and thus the output is not constant.  And due to this data inconsistency problem may occur.

class BookTrainSeat
{
	int total_seats=10;
	public void bookSeat(int seats,String name)
	{
		if(total_seats>=seats)
		{
			System.out.println(name + "booked" +seats +" seats successfully");
			total_seats=total_seats-seats;
			System.out.println("Total seats left:" +total_seats);
		}
		else {
			System.err.println(name +"sorry--! seats not booked" );
			System.err.println("Total seats left:" +total_seats);
		}
	}
}
class MyThread extends Thread
{
	BookTrainSeat bts;
	int seats;
	public MyThread(BookTrainSeat bts,int seats)
	{
		this.bts=bts;
		this.seats=seats;
	}
	public void run()
	{
		bts.bookSeat(seats, Thread.currentThread().getName());
	}
}
public class TrainReservation {
	public static void main(String[] args) {
		BookTrainSeat bts=new BookTrainSeat();
		
		MyThread deepak=new MyThread(bts, 5);
		deepak.setName("Deepak");
		deepak.start();		
		
		MyThread amit=new MyThread(bts, 3);
		amit.setName("amit");
		amit.start();
		
		MyThread rahul=new MyThread(bts, 4);
		rahul.setName("Rahul");
		rahul.start();
	}
}
