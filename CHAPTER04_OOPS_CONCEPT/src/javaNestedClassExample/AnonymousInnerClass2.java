package javaNestedClassExample;

abstract class Vehicle1
{
	abstract void start();
}
public class AnonymousInnerClass2 {
	public static void main(String[] args) {
		Vehicle1 v=new Vehicle1() {
			
			@Override
			void start() {
				System.out.println("Start with key");
				
			}
		};
		v.start();
	}
}
