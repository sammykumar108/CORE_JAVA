package lambdaExpressions;

@FunctionalInterface
interface I2
{
	void m2();
}
public class Test2 {
	public static void main(String[] args) {
//		I2 i=()->
//		{
//			System.out.println("hi i am Lambda function...!!");
//		};
//		i.m2();
//		
		I2 i=()->{System.out.println("Hi I am Lambda function...!!");};
		i.m2();
		
	}
}
