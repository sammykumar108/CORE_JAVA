package thisKeyword;

//this keyword is used to invoke the current class Constructor
// this();
// this(-,-,-,-);
// this keyword must be the first statement in the constructor call
public class ThisDemo5 {
		public ThisDemo5() {
			System.out.println("1");
		}
		public ThisDemo5(int no)
		{
			this();
			System.out.println("2");
		}
		public static void main(String[] args) {
			ThisDemo5 ob=new ThisDemo5(10);
		}
}
