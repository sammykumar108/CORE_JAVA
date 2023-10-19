package preDefinedPredicateFunctionalInterface_Programs;

import java.util.function.Predicate;

public class Test3 {
	public static void main(String[] args) {
		Predicate<String> p1=pass-> pass.length() >6;
		Predicate<String> p2=pass-> pass.equals("admin@123");
//		System.out.println(p1.test("abc@12345"));
//		System.out.println("deepak@123");
		
//		Predicate p =p1.and(p2);
//		System.out.println(p.test("admin@12")); // false
		
		Predicate p=p1.or(p2);
		System.out.println(p.test("admin@12")); //true
	}
}
