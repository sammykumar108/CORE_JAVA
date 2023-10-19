package threadGroupExample;

public class Test {
	public static void main(String[] args, String Parent) {
		String name=Thread.currentThread().getThreadGroup().getName();
		System.out.println("Current thread group name:"+name);
		
		String parent_name=Thread.currentThread().getThreadGroup().getName();
		System.out.println("Parent thread group name:" +parent_name);
	}
}
