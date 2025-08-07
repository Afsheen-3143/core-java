package IntermediateP;

import java.util.Scanner;


//ATM simulation
class ATM{
	
	int pin=1431432;
	int amount;
	int attempts=3;
	double balance=10000;
	Scanner sc =new Scanner(System.in);
	public void start() {
		
		while(attempts>0) {
			System.out.println("enter PIN number");
			int inputpin=sc.nextInt();
			if(pin==inputpin) {
				System.out.println("correct pin no");
				display();
				return;
			}else {
				attempts--;
				System.out.println("incorrect pin");
			}
		}
		  System.out.println("Maximum attempts reached. Card blocked.");
	}
	public void display() {
		System.out.println("Atm machine");
		System.out.println("1.check balance");
		System.out.println("2.deposite");
		System.out.println("3.withdraw");
		System.out.println("4.exit");
		System.out.println("enter any option");
		int choice=sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			checkbalance();
			display();
			break;
			
		case 2:
			deposite();
			display();
			break;
			
		case 3:
			withdraw();
			display();
			break;
			
		case 4:
			System.out.println("thankyou");
			return;
			
		default:
			System.out.println("something went wrong");
			
		}
	}
	private void withdraw() {
		System.out.println("enter withdraw amount");
		int amount=sc.nextInt();
		if(amount>0&&amount<=balance) {
			balance-=amount;
			System.out.println(balance);
		}
		
	}
	private void deposite() {
		System.out.println("enter deposite amount");
		int amount=sc.nextInt();
		if(amount>0) {
			balance+=amount;
			System.out.println(balance);
		}
		
	}
	private void checkbalance() {
		System.out.println("check balance"+balance);
		
	}
}
	
	public class Problem6{
		public static void main(String[] args) {
			ATM atm=new ATM();
			atm.start();
		}
	}
	
