package identityHashMap_Programs;

public class Test1 {
	public static void main(String[] args) {
		int i1=10;
		int i2=10;
		System.out.println(i1==i2); //true
		
		Integer i11=new Integer(100);
		Integer i22=new Integer(100);
		System.out.println(i11==i22); //false
		System.out.println(i11.equals(i22)); //true
		
		String str1="deepak";
		String str2="rahul";
		String str3="deepak";
		System.out.println(str1==str2); //false
		System.out.println(str1==str3); //true
		System.out.println(str1.equals(str3)); //true
		System.out.println(str1.equals(str2)); //false
		
		String str11=new String("deepak");
		String str22=new String("deepak");
		String str33=new String("rahul");
		System.out.println(str11==str22); //false
		System.out.println(str11==str33); //false
		System.out.println(str11.equals(str22)); //true
		System.out.println(str11.equals(str33)); //false
		
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		System.out.println(t1==t2); //false
		System.out.println(t1.equals(t2)); //false
	}
}
