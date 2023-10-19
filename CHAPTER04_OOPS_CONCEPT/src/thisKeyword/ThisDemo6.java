package thisKeyword;

public class ThisDemo6 {

public ThisDemo6() {
	this(10);
	System.out.println("1");
//	this(10);
}
ThisDemo6(int no)
{
	System.out.println(no);
}
	public static void main(String[] args) {
		ThisDemo6 ob2=new ThisDemo6();
	}
}
