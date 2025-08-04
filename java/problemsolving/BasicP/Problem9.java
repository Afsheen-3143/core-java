package problems;

import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amount=sc.nextInt();
		
		int[]denominations={2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		System.out.println("/n currency denomination breakdown");
		
		for (int denom : denominations) {
			if (amount >= denom) {
                int count = amount / denom; // number of notes/coins
                amount = amount % denom;    // remaining amount
                System.out.println("₹" + denom + " x " + count);
			}
		}
	}

}
