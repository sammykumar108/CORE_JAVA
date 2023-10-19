package tryCatchFlowExample;

public class Test3 {
	public static void main(String[] args) {
		try {
//			System.out.println(100/0);
			int[] a= {10,20,30,40,50};
			System.out.println(a[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Exception");
		}
		catch (ArithmeticException e) {
			System.out.println("You can not divide by zero");
		}
		System.out.println("Thank You");
	}
}
