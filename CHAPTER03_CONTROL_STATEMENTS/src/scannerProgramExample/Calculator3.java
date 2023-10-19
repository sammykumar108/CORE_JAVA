package scannerProgramExample;

import java.util.Scanner;

public class Calculator3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no1,no2;
		String sym,yn;
		do {
		System.out.println("Enter 1st no");
		no1=s.nextInt();
		System.out.println("Enter 2nd no");
		no2=s.nextInt();
		System.out.println("Enter symbol(+,-,*,/)");
		sym=s.next();
		
		switch(sym)
		{
		case "+":System.out.println("Result is:" +(no1+no2));
		break;
		
		case "-":System.out.println("Result is:" +(no1-no2));
		break;
		
		case "*":System.out.println("Result is:" +(no1*no2));
		break;
		
		case "/":System.out.println("Result is:" +(no1/no2));
		break;
		
		default:System.out.println("Invalid Input");
		break;
		}
		System.out.println("Do you want to continue(Press y for Yes or n for No)");
		yn=s.next();
		System.out.println("-----------------------------------------------------");
		
	}
		while(yn.equals("y") || yn.equals("Y"));
}
}
