package problems;

import java.util.Scanner;

public class Problem6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String line=sc.nextLine();
	String[] words=line.trim().split("\\s+");
	
	if(line.trim().isEmpty()) {
		System.out.println("Word count is 0");
	}else {
		System.out.println("words"+words.length);
	}
}
}
