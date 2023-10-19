package identityHashMap_Programs;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test2 {
	public static void main(String[] args) {
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		HashMap hm=new HashMap();
		hm.put(i1, "deepak");
		hm.put(i2,"rahul");
		System.out.println(hm);
		
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put(i1, "deepak");
		ihm.put(i2, "rahul");
		System.out.println(ihm);
	}
}
