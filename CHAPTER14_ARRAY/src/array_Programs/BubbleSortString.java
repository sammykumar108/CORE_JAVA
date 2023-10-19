package array_Programs;
//Wap to sort an element of an string array
public class BubbleSortString 
{
	static void sortingAlgo(String[] a)
	{
		for (int pass = 0; pass < a.length; pass++) 
		{
			String temp;
			boolean b=false;
			for (int i = 0; i < a.length-1-pass; i++) 
			{
				if(a[i].compareTo(a[i+1])>0)
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					b=true;
				}
			}
			if(b==false)
			{
				break;
			}
		}
		System.out.println("Final List");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		String[] arr= {"deepak","vironika","deepesh","amit","rahul"};
		BubbleSortString.sortingAlgo(arr);
	}
}
