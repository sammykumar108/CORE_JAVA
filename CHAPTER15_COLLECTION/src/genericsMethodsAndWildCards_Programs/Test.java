package genericsMethodsAndWildCards_Programs;

import java.util.ArrayList;
class A
{
	void show(ArrayList <?> al)
	{
		System.out.println(al);
	}
}
public class Test {
	public static void main(String[] args) {
		A ob1=new A();
		ArrayList<String> al=new ArrayList<String>();
		ob1.show(al);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ob1.show(al1);
 	}
}
