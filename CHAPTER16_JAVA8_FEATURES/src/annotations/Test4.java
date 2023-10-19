package annotations;

//1. marker interface-> 0 abstract method
//2. functional interface-> only 1 abstract method
//3. normal interface-> more than 1 abstract method

@FunctionalInterface
interface I4
{
	void m1();
}
@FunctionalInterface
interface II4 extends I4
{
	
}
public class Test4 {

}
