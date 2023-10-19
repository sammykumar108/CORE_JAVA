package cursors_programs.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Test3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//ArrayList al1=new ArrayList();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			String element=(String)itr.next();
			if(element.equals("bbb"))
			{
				itr.remove();
				System.out.println("Element removed succesfully");		
			}
		//	else
		//	{
		//		al1.add(element);
		//	}
		}
		System.out.println(al);
	}
}
