package constructorReference_Programs;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.stream().filter(e->e>30).forEach(System.out :: println);
	}
}
