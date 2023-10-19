package sam;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
	//		System.out.println("2");
			System.out.println(100/0);
			System.out.println("2");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("3");
		}
		System.out.println("4");
	}
}
