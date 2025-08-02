package problems;

import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int rev=0;
		while(number!=0) {
			int digit=number%10;
			rev=rev*10+digit;
			number/=10;
		}
			System.out.println("reverse of a number is"+rev);
//		

}}
