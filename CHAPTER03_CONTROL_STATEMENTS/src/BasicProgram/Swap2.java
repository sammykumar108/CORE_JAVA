package BasicProgram;


//WAP to Swap the 2 number without using third variable
public class Swap2 {
	public static void main(String[] args) {
		int no1=10,no2=20;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("no1:" +no1);
		System.out.println("no2:" +no2);
		
	}
}
