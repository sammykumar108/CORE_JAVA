package isArelationship.SingleInheritance;

class Animal
{
	void eat()
	{
		// -----1000 lines of code----------
		System.out.println("I am eating");
		// -------------1000 lines of code-------
	}
}
class Humans extends Animal
{
	
}
public class InheritanceMain {
	public static void main(String[] args) {
		Humans sam=new Humans();
		sam.eat();
	}

}
