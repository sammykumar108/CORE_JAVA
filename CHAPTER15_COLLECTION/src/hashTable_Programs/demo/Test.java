package hashTable_Programs.demo;

public class Test {
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.hashCode());
		
		Test t2=new Test();
		System.out.println(t2.hashCode());
		
		Integer i1=new Integer(110);
		System.out.println(i1.hashCode());
		
		String str1=new String("amit");
		System.out.println(str1.hashCode());
	}
}
