package problems;

import java.util.Scanner;

public class Problem5 {
//	public static void main(String[] args) {
		
//		int Farenheit=(C*9/5)+32;
//		int Celsius=(F-32)*5/9;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter temperature");
//		int C=sc.nextInt();
//		int F=sc.nextInt();
	public void Farenheit(int  C) {
		int Farenheit=(C*9/5)+32;
		System.out.println(Farenheit+ "F");
	}
	public void Celsius(int F) {
		int Celsius=(F-32)*5/9;
System.out.println(Celsius+ "C");
	}
	public static void main(String[] args) {
		Problem5 p=new Problem5();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter temperature");
//		int C=sc.nextInt();
//		int F=sc.nextInt();
		p.Farenheit(56);
		p.Celsius(90);
	}
	}



