package thisKeyword;

//this keyword is used to refer the current class instance variable
// this.instance_variable_name
public class ThisDemo2 {
	
	int no=10;
	void m1(int no)
	{
//		System.out.println(no);
		System.out.println(this.no);
	}
	public static void main(String[] args) {
		ThisDemo2 ob=new ThisDemo2();
		ob.m1(20);
		System.out.println(ob.no);
	}
}
