package problems;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("grade A");
		}else if(marks>=80&&marks<=89) {
			System.out.println("grade B");
		}else if(marks>=70&&marks<=79) {
			System.out.println("grade C");
		}else if(marks>=60&&marks<=69) {
			System.out.println("grade D");
		}else {
			System.out.println("Fail");
		}
	}

}
