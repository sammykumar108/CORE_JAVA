package navigableSet_Programs;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test8 {
	public static void main(String[] args) {
		NavigableSet ss=new TreeSet();
		ss.add("aaa");
		ss.add("bbb");
		ss.add("ddd");
		ss.add("eee");
		ss.add("fff");
		
//		System.out.println(ss.descendingSet());
//		System.out.println(ss.ceiling("ccc"));
//		System.out.println(ss.higher("ddd"));
//		System.out.println(ss.floor("bbb"));
//		System.out.println(ss.lower("bbb"));
		System.out.println(ss.pollFirst());
		System.out.println(ss.pollLast());
	}
}
