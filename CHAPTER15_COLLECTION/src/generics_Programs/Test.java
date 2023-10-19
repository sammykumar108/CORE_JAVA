package generics_Programs;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		String[] strarr=new String[3];
		strarr[0] ="deepak";
		strarr[1] ="amit";
		strarr[2] ="rahul";
		
		String name=strarr[1];
		System.out.println(name);
		
		//------------------------------------------------
		
		ArrayList al=new ArrayList();
		al.add("deepak");
		al.add(101);
		al.add(10.0f);
		
		String name1=(String)al.get(0);
		int aa=(int)al.get(1);
		System.out.println(name1);
		System.out.println(aa);
		
	    //------------------------------------------------
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
//		al1.add("deepak");
//		al1.add("rahul");
//		al1.add("deepesh");
//		String name2=al1.get(0);
	}
}
