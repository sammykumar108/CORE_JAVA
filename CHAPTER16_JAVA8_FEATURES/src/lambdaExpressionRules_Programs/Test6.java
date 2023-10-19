package lambdaExpressionRules_Programs;
interface I6
{
	int getLength(String name);
}

public class Test6 {
	public static void main(String[] args) {
//		I6 i=(name) ->
//			{
//				int leng=name.length();
//				return leng;
//				
//			};
//		System.out.println(i.getLength("deepak"));
//		int l=i.getLength("deepak");
//		System.out.println("length is : "+l);
		
		I6 i=(name) -> name.length();
		System.out.println(i.getLength("deepesh"));
	}
}
