package BasicProgram;

// using RECURSION method
public class Factorial2 {
	static int fact=1;
	public static void main(String[] args) {
		int no=5;
		Factorial2 obj=new Factorial2();
		obj.calcFact(no);
		System.out.println("Factorial of " +no +"is" +fact);
	}
	void calcFact(int no) {
		if(no>1)
		{
			fact=fact*no;
			no=no-1;
			calcFact(no);
		}
	}
}
