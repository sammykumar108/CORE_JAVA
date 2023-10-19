package caseForWhileLoop;

//case 2: If while loop is infinite  and we provide 
// any expression after while loop then it will compile time error 
// saying "Unreachable code".
public class WhileDemo4 {
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("hi");
		}
		System.out.println("hello");
	}
}
