package classAndObjectExample;

class Birds
{
	void fly()
	{
		System.out.println("I am Flying");
	}
}
class Animall
{
	void eat()
	{
		System.out.println("I am eating");
	}
}
public class Main {
	public static void main(String[] args) {
		Animall buzo=new Animall();
		buzo.eat();
		Birds crow=new Birds();
		crow.fly();
	}
}
