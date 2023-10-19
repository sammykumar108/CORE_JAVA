package abstractionExample;

abstract class Vechicle
{
	abstract void start();
}
class Car extends Vechicle
{
	void start()
	{
		System.out.println("Start With Key");
	}
}
class Scooter extends Vechicle
{
	void start()
	{
		System.out.println("Start with Kick");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Car ob=new Car();
		ob.start();
		System.out.println("--------------------------------------");
		
		Scooter  ob2=new Scooter();
		ob2.start();

		}
}
