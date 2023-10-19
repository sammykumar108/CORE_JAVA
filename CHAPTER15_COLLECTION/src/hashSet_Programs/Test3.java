package hashSet_Programs;

import java.util.HashSet;

public class Test3 {
	public static void main(String[] args) {
		//HashSet hs=new HashSet(5,.80f);
		HashSet hs=new HashSet();
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");
		hs.add("aaa");
		System.out.println(hs);
	}
}
