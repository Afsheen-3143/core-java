package Arrays;

import java.util.Scanner;
//find the number at that index
public class Array2 {
	public static void main(String[] args) {
		int[]arr= {4,3,22,7,1,9,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int search=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("found the index of the number"+i);
				found=true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("number is not found");
		}
	}

}
