package streamApi_Tasks;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//wap to print all the number which are greater than 30
//functional interface,lambda expression,Predicate functional interfaces,StreamApi
public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		//al.stream().filter(e->e>30).forEach(e->System.out.println(e));
		
		/*-----------------------------------------
		Stream<Integer> s=al.stream();
		Predicate<Integer> p=(e)->
			{
				return e>30;
			};
		
		Consumer<Integer> c=(e)->
			{
				System.out.println(e);
			};
		
		s.filter(p).forEach(c);	
		-------------------------------------------*/
		Stream<Integer> s=al.stream();
		s.filter(e->e>30).forEach(e->System.out.println(e));
	}
}
