package streamApi_StreamInterface_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//wap to get all the even number in an Arraylist
//wap to count all the even number in an Arraylist
public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(55);
		//-------------Using Collections and simple logic-------------
		
//		for(int i:al)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//		}
		
		//-------------using stream api(first part)-------------------
//		Stream<Integer> s=al.stream();
//		List l=s.filter(e->e%2==0).collect(Collectors.toList());
//		System.out.println(l);
		
		//--------------using stream api(second part)-----------------
//		Stream<Integer> s=al.stream();
//		s.filter(e->e%2==0).forEach(e->System.out.println(e));
		
		//--------------using stream api(second part)-----------------
//		al.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
        
		//-------------count even numbers-----------------------------
//s		System.out.println(al.stream().filter(e->e%2==0).count());
		
		//method chaining
		String name="deepak";
		String s1=name.concat(name);
		String s2=s1.toUpperCase();
		int l=s2.length();
		int leng=name.concat("Java").toUpperCase().length();
		System.out.println(leng);
	}
}
