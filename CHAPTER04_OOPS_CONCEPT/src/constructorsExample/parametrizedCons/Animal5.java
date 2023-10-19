package constructorsExample.parametrizedCons;

public class Animal5 {
	int age;
	String color;
	Animal5(int age1,String color1) {
		age=age1;
		color=color1;
	}
	void eat()
	{
		System.out.println("I am eating");
	}
	void run()
	{
		System.out.println("I am running");
	}
	public static void main(String[] args) {
		Animal5 buzoAnimal5=new Animal5(10, "brown");
		System.out.println("Age:" +buzoAnimal5.age);
		System.out.println("Color:" +buzoAnimal5.color);
		buzoAnimal5.eat();
		buzoAnimal5.run();
		System.out.println("-------------------------------------");
		Animal5 catAnimal5=new Animal5(5, "black");
		System.out.println("Age:" +catAnimal5.age);
		System.out.println("Color:" +catAnimal5.color);
		catAnimal5.eat();
		catAnimal5.run();
	}
}
