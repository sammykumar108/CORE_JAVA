package array_Programs;
//wap to find the first duplicate element in an array
public class FirstDuplicateElement {
	public static void main(String[] args) {
		int[] arr= {40,30,70,90,60,10,30,70};
		boolean b=false;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("First Duplicate is :" +arr[i]);
					b=true;
				}
			}
			if(b==true)
			{
				break;
			}
		}
	}
}
