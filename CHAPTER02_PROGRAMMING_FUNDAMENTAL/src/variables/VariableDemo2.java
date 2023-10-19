package variables;

public class VariableDemo2 {
	int d=300;//local variable
	static int e=500;//static variable
	void sum()
	{
		int a=100;//local variable
	}
	void mul()
	{
		int b=200;//local variable
//		int c=a+b;//error:because we can not use local variable inside mul() method
		int c=d+b;//compile
		int c1=d+b+e;//compile
	}
	static void divide()
	{
		int rollno=101;//local variable
//		int res=d;//error because d is not static variable
	}
}
