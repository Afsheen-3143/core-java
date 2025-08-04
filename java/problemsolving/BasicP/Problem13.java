package problems;

import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int evencount = 0;
		int oddcont = 0;
		while(num!=0) {
			int digit=num%10;
			
			if(num%2==0) {
				
				evencount++;
			}else {
				
				oddcont++;
			}
			num=num/10;
		}
		System.out.println("evencount"+evencount);
		System.out.println("oddcount"+oddcont);
	}

}
