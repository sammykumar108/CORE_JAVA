package classAndObjectExample;

public class Animal3 {
	int age=10;
	String color="black";
	void eat()
	{
		System.out.println("I am eating");
	}
	void run()
	{
		System.out.println("I am running");
	}
	public static void main(String[] args) {
		Animal3 buzo=new Animal3();
		System.out.println("Age:" +buzo.age);
		System.out.println("Color:" +buzo.color);
		buzo.eat();
		buzo.run();
		
		Animal3 cat= new Animal3();
		System.out.println("Age:" +buzo.age);
		System.out.println("Color" +buzo.color);
		cat.eat();
		cat.run();
	}
}
