package cursors_programs.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();	
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		//-----------forward direction----------
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("---------------------------");
		//-----------backward direction--------------
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
	}
}
