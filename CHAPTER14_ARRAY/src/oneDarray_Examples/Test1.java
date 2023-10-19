package oneDarray_Examples;

public class Test1 {
//	int rollno;
//	int[] rollno;
	
	public static void main(String[] args) {
//		int[] a=new int[3];
//		a[0] =10;
//		a[1] =20;
//		a[2] =30;
//		
		int[] a= {10,20,30};
		System.out.println("Array Length :" +a.length);
		System.out.println("--------------------------");
		
		//-----------RETRIEVE--------------------------
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
