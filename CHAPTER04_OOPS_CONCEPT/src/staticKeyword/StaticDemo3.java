package staticKeyword;

// We can not create static local variable because main use of static 
// variable is improve share-ability but Local variable have limited 
// share-ability thus it violates rule of static keyword.
public class StaticDemo3 {
	static int no1=10;
	void m1()
	{
		static int no2=20;
	}
	public static void main(String[] args) {
		
	}
	
}
