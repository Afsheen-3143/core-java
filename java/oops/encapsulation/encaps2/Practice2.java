package encaps2;
class bank
 {
	private double balance=10000;
	public double getbalance() {
		return balance;
	}
public void deposit(int amount) {
	
	if(amount>0) {
		balance+=amount;
	}
	System.out.println("deposit amount");
}
public void withdraw(double amount) {
	if(amount>0&&amount<=balance) {
		balance-=amount;
	}
	System.out.println("withdrawl amount");
}
}
 public class Practice2{
	 public static void main(String[] args) {
		bank b=new bank();
		b.deposit(5000);
		b.withdraw(10000);
		System.out.println(b.getbalance());
	}
 }