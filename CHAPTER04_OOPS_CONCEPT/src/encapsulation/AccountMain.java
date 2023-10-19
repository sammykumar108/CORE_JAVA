package encapsulation;
class Account
{
	private int amount;
	private String accNo;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
}
class BankFunctions
{
	void deposit(Account acc,int dptamt)
	{
		int total=acc.getAmount() + dptamt;
		acc.setAmount(total);
	}
	void withraw(Account acc,int wthamt)
	{
		int total=acc.getAmount() - wthamt;
		acc.setAmount(total);
	}
}
public class AccountMain {
	public static void main(String[] args) {
		Account ob1=new Account();
		ob1.setAccNo("1111");
		ob1.setAmount(10000);
		
		BankFunctions bf=new BankFunctions();
		bf.deposit(ob1, 5000);
		bf.withraw(ob1, 3000);
		System.out.println("Full Details:" +ob1.getAccNo() +":" +ob1.getAmount());
	}
}
