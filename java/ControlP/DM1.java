package ControlP;

import java.util.Scanner;

public class DM1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		if(marks<60) {
			System.out.println("grade c");
		}else if(marks<70){
			System.out.println("grade B");
		}
		else {
			System.out.println("grade A");
		}
	}

}
