package returnStatementExample;

public class ReturnDemo4 {
	public static void main(String[] args) {
		ReturnDemo4 obj=new ReturnDemo4();
		int s=obj.m1();
		System.out.println(s);
	}
	void m1() {
		int no1=10,no2=20;
		return no1+no2;
	}
}
