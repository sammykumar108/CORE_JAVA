package interfaceExample;

interface Vehicle
{
	void start();
	void noOfGears(int a);
}
abstract class Bus implements Vehicle
{
	public void start()
	{
		System.out.println("Bus start with key");
	}
}
class Car implements Vehicle
{
	public void start()
	{
		System.out.println("Car start with Key");
	}

	@Override
	public void noOfGears(int gears) {
		System.out.println("Car has" +gears +"gears");
	}
}
class Scooter implements Vehicle
{
	public void start()
	{
		System.out.println("Scooter starts with Kick");
	}

	@Override
	public void noOfGears(int gears) {
		System.out.println("Scooter has" +gears +"gears");
	}
}
public class VehicleMain {
	public static void main(String[] args) {
//		Vehicle v=new Vehicle(); //we can not create object of an interface
//		Bus b=new Bus();  //we can not create object of an interface
//		b.start();
//		b.noOfGears(6);
	}
}
