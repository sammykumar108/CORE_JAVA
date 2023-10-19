package preDefinedPredicateFunctionalInterface_Programs;

import java.util.function.Predicate;

public class Test2 {
	public static void main(String[] args) {
	
		Predicate<String> p=str ->str.length() > 6;
		System.out.println(p.test("abc"));
		System.out.println("deepak@123");
	}
}
