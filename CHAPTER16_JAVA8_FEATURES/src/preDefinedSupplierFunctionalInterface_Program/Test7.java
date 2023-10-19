package preDefinedSupplierFunctionalInterface_Program;

import java.util.function.Supplier;

public class Test7 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
//		System.out.println((int)(Math.random()*100));
//		Supplier<Integer> s=()-> (int)(Math.random()*100);
//		System.out.println(s.get());
		
		Supplier<String> s=()-> 
			{
				String[] names= {"deepak","amit","rahul","deepesh","kamal"};
				
				int i=(int)(Math.random()*4);
				return names[i];
			};
		System.out.println(s.get());	
	}
}
