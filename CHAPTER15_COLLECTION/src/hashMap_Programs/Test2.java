package hashMap_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "deepak");
		hm.put(102, "amit");
		hm.put(103, "rahul");
		hm.put(104, "deepesh");
		hm.put(105, "priya");
		System.out.println(hm);
		
		Set set=hm.entrySet();
		//System.out.println(set);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{	
			System.out.println(itr.next());
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
			System.out.println("----------------------------------------");
		}
	}
}
