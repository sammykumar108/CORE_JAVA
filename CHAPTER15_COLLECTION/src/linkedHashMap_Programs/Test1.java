package linkedHashMap_Programs;

import java.util.LinkedHashMap;

public class Test1 {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();           
	    lhm.put(100,"Amit");    
	    lhm.put(101,"Vijay");    
	    lhm.put(102,"Rahul");    
	    //Fetching key  
	    System.out.println("Keys: "+lhm.keySet());  
	    //Fetching value  
	    System.out.println("Values: "+lhm.values());  
	    //Fetching key-value pair  
	    System.out.println("Key-Value pairs: "+lhm.entrySet());
	    
	    System.out.println("Size of the map: "
                + lhm.size());

		// Checking whether Map is empty or not
		System.out.println("Is map empty? "
		                + lhm.isEmpty());
		
		// Using containsKey() method to check for a key
		System.out.println("Contains key 'two'? "
		                + lhm.containsKey(101));
		
		// Using containsKey() method to check for a value
		System.out.println(
		 "Contains value 'practice.geeks"
		 + "forgeeks.org'? "
		 + lhm.containsValue("practice"
		                     + ".geeksforgeeks.org"));
		
		// Removing entry using remove() method
		System.out.println("delete element 'one': "
		                + lhm.remove(100));
		
		// Printing mappings to the console
		System.out.println("Mappings of LinkedHashMap : "
		                + lhm);
	}
}
