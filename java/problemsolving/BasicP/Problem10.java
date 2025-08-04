package problems;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		

		Scanner sc =new Scanner(System.in);
		System.out.print("enter the Strings");
		String input=sc.nextLine();
		String reversed="";
		for(int i=input.length()-1;i>=0;i--) {
			reversed+=input.charAt(i);
		}
		
		if(input.equals(reversed)) {
			System.out.println("is a palindrome");
		}else {
			System.out.println("is not a palindrome");
		}
		    }
		}

					
			
		