package vector_Programs;

import java.util.Vector;

public class Test4 {
	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<10;i++)
		{	
			System.out.println(i);
		}
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.removeElement(5));
		v.removeAllElements();
		System.out.println(v);
	}
}
