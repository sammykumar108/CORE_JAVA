package returnStatementExample;

//case1: In case of void method return type we can 
// use empty return statement.

public class ReturnDemo6 {
	public static void main(String[] args) {
		ReturnDemo6 obj=new ReturnDemo6();
		obj.m1();
	}
	void m1()
	{
		System.out.println("hi");
		return;
	}
}
