package array_Programs;
//wap to find the maximum and minimum element in an array
public class MinMaxElement {
	static void findMinElement(int[] a)
	{
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element is :" +min);
	}
	
	static void findMaxElement(int[] a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximu element is :"+max);
	}
	
	
	public static void main(String[] args) 
	{
		int[] a= {30,70,10,20,60,50,90};
		MinMaxElement.findMinElement(a);
		MinMaxElement.findMaxElement(a);
	}
}
