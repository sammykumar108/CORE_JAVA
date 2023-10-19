package caseforIF;

// case 3: The syntax of "if(expression){}", then expression should return 
// boolean value. In expression we can provide direct condition or we can
// also provide method calling statement which returns boolean value
public class IfDemo3 {
	public static void main(String[] args) {
		IfDemo3 obj=new IfDemo3();
		if(obj.m1())
		{
			System.out.println("hello");
		}
	}
	boolean m1()
	{
		return true;
	}
}
