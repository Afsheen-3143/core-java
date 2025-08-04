package problems;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of hours");
		int hours=sc.nextInt();
		int amount=100;
		if(hours<3 ) {
			amount=hours*20;
		}else {
			amount= (3 * 20) + ((hours - 3) * 10);	
			}
		System.out.println("total parking amount"+amount);
		}
		
	}


