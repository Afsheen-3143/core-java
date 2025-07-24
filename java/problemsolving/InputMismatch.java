package problemsolving;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("enter the number");
		int num=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		finally {
			System.out.println("excute the code");
			sc.close();
		}
	}

}
