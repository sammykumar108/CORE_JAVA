package hashMap1_Programs;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "deepak"); // 101 % 16=5
		hm.put(105, "kamal"); // 105 % 16=9
		hm.put(104, "deepesh"); //104 & 16=8
		hm.put(102, "rahul"); //102 % 16=6
		hm.put(106, "amit"); //106 % 16=10
		hm.put(116, "aaa"); //116 % 16=4
		hm.put(117, "sammy"); //117 % 16=5
		System.out.println(hm);
	}
}
