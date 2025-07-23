package exceptional;

import java.util.Scanner;

public class Practice4 {
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	try {
		System.out.println("enter numerator");
		int nume=sc.nextInt();
		
		System.out.println("enter denominator");
		int den=sc.nextInt();
		
		int result=nume/den;
		System.out.println("result is"+result);
	}
	catch(ArithmeticException e) {
		System.out.println("cannot divide the number");
	}
	finally {
		System.out.println("this code is executed");
		sc.close();
	}
}
}
