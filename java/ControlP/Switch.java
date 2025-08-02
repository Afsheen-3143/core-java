package decisionmaking;
import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);

	        int num1, num2, add;

	        System.out.print("Enter first number: ");
	        num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        num2 = sc.nextInt();

	        System.out.println("Choose an operation:");
	        System.out.println("1. Addition");
	        add = sc.nextInt();

	        switch (add) {
	        case 1:
	        	System.out.println("add two numbers"+(num1+num2));
	        	break;
	        	default:
	        		System.out.println("return");
	        		break;
	        }
	}

}
