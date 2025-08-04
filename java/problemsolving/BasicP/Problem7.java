package problems;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		String username="afsheenaffu";
		String password="affu3143";
		
		Scanner sc=new Scanner(System.in);
		int attempts=3;
		while(attempts>0) {
			System.out.println("enter username");
			 String inputUsername=sc.nextLine();
			System.out.println("enter password");
			String inputpassword=sc.nextLine();
			
			if(username.equals(inputUsername)&&password.equals(inputpassword)) {
				System.out.println("login succesfull");
			}else {
				attempts--;
				System.out.println("inavlid credentials");
			}
			
		}
	      System.out.println(" Too many failed attempts.");
	}
}
