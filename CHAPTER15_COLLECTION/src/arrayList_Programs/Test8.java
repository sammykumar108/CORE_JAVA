package arrayList_Programs;

import java.util.ArrayList;

public class Test8 {
 public static void main(String[] args) {
	ArrayList al1=new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add("sammy");
	//System.err.println(al1.size());
	Object[] obj=al1.toArray();
	for(int i=0; i<obj.length; i++)
	{
		System.out.println(obj[i]);
	}

}
}
