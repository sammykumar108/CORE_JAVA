package preDefinedPredicateFunctionalInterface_Programs;

import java.util.function.Predicate;

public class Test1 {
	public static void main(String[] args) {
		Predicate<Integer> ob=no -> no%2==0;
		System.out.println(ob.test(20));
	}
}


//interface I1
//{
//	public boolean test(int no);
//}
//public class Test1
//{
//	public static void main(String[] args) {
//		I1 ob=no -> no%2==0;
//		System.out.println(ob.test(13));
//	} 
//}

//interface I1
//{
//	public boolean test(int no);
//}
//class A implements I1
//{
//	public boolean test(int no)
//	{
//		return no%2==0;
//	}
//}
//public class Test1
//{
//	public static void main(String[] args) {
//		I1 ob=new A();
//		System.out.println(ob.test(14));
//	}
//}