package problems;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		double bill;
		int amount=50;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of units");
		int units=sc.nextInt();
		if(units<=100) {
			bill= units*1.5+amount;
			
			System.out.println("total bill for 100 units" +bill);
				
			}
	
		else if(units<=200&&units>=100) {
			bill=units*2.5+amount;
			
			System.out.println("total bill for 200 units"+bill);
		}else if(units>=300) {
			bill=units*4+amount;
			
			System.out.println("total bill for 300 units"+bill);
			
		}
		
	}

}
