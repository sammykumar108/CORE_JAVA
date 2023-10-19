package variables;


public class Test {
	int d=300;
	static int e=500;
	void sum()
	{
		int a=100;//local variable
	}
	void mul()
	{
		int b=200;//local variable
		int c;//local variable
	}
	static void divide()
	{
		int rollno=101;//local variable
//		static int rollno1=101;//error:because static variable can not use in method
	}
}
