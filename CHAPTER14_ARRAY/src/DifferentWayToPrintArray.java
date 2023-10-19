import java.util.Iterator;

public class DifferentWayToPrintArray {
	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		//Way1
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------s");
		//iterate the element in backward direction
		for (int i = a.length-1; i >=0; i--) 
		{
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------");
		//Way2(while loop)
		int j=0;
		while(j<a.length)
		{
			System.out.println(a[j]);
			j++;
		}
		System.out.println("-----------------------------");
		//Way3
		for(int v : a)
		{
			System.out.println(v);
		}
		System.out.println("-----------------------------");
		String[] str= {"deepak","amit","deepesh"};
		for(String s: str)
		{
			System.out.println(s);
		}
	}
}
