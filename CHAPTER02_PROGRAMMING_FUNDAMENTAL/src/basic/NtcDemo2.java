package basic;


public class NtcDemo2 {
	public static void main(String[] args) {
		byte no1 = 10;
		byte no2 = 20;
//		byte res=(byte)no1+no2;//error
//		byte res=(byte)no1+(byte)no2;//error
		byte res = (byte) (no1 + no2);
		System.out.println(res);

		int n1 = 10;
		short n2 = (byte) (short) n1;
		System.out.println(n2);
	}
}
