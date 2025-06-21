package encapsulation;

public class ATM {
	private int PIN;
	private double balance;
	public void setvalues(int pin, int bal) {
		PIN=pin;
		balance=bal;
	}
	public int getPIN() {
		return PIN;
	}
	public double getbalance() {
		return balance;
	}
 public void deposite(double amount) {
	 balance= balance + amount;
 }
 public void withdraw(double amount) {
	 balance=balance-amount;
 }
 public class Atmapp{
	 public static void main (String args[]) {
	 ATM atm = new ATM();
	 atm.setvalues(111,50000);
	 atm.deposite(1000);
	 atm.withdraw(10000);
	 System.out.println("\n enter pin no:"+atm.getPIN()+"\n enter amount:"+atm.getbalance());

	 
	 
 }}}

	 


	

