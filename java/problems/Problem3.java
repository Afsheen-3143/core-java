package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		List<Character>vowels=Arrays.asList('a','e','i','o','u');
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		 char ch = sc.next().charAt(0); 

	        System.out.println("You entered: " + ch);
		if(vowels.contains(ch)) {
			System.out.println("is vowel");
			
		}else if(!Character.isLetter(ch)) {
			System.out.println("not a letter");
			
		}
		
		else {
			System.out.println("not vowel");
		}
	}

}
