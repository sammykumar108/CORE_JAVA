package hascodeHexadecimal;

class Animall
{
	int age;
	int legs;
}
public class AnimalMain {
	public static void main(String[] args) {
		Animall buzo=new Animall();
		System.out.println(buzo);
		System.out.println(buzo.hashCode());
		System.out.println("---------------------------------------");
		Animall cat=new Animall();
		System.out.println(cat);
		System.out.println(cat.hashCode());
				
	}
}
