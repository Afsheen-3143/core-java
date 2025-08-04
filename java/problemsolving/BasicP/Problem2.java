package problems;

import java.util.Scanner;

public class Problem2 {
//	public static void main(String[] args) {
		static int amount = 0;
		int balance;
		
			
	
		public void withdraw( int balance) {
			
		if(amount%100==0&&amount>0&&amount<=balance) {
			balance-=amount;
			System.out.println("withdrawl amount"+balance);
		}else {
			System.out.println("incorrect amount");
			
		}
			
		}
				
			public static void main(String[] args) {
				Problem2 p=new Problem2();
				Scanner sc =new Scanner(System.in);
				System.out.println("enter amount");
				amount=sc.nextInt()	;
				p.withdraw(10000);
			}	
				
	}


