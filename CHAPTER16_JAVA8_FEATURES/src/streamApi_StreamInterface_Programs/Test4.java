package streamApi_StreamInterface_Programs;

import java.util.ArrayList;
import java.util.stream.Stream;

//wap to convert all the names to Uppercase
public class Test4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("deepak");
		al.add("rahul");
		al.add("amit");
		al.add("deepesh");
		al.add("ankit");
		Stream<String> s=al.stream();
		s.map(e->e.toUpperCase()).forEach(e->System.out.println(e));
	}
}
