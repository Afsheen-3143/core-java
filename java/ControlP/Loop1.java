package ControlP;

public class Loop1 {
	public static void main(String[] args) {
//		int rows=5;
//		
//
//		for (int i = 1; i <= rows; i++) {
//		    for (int j = i; j < rows; j++) {
//		        System.out.print(" ");
//		    }
//		    for (int k = 1; k <= i; k++) {
//		        System.out.print(k + " ");
//		    }
//		    System.out.println();
//		} 
//		int n=4;
//		int num=1;
//		for (int i = 1; i <= n; i++) {
//		    for (int j = 1; j <= i; j++) {
//				System.out.print(num++ + " ");
//			}
//			System.out.println();
//		}
//		
//		printing the number whose sum and divisors are same
		for(int i=1;i<=1000;i++) {
			int sum=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) 
					sum+=j;
				
			}if(sum==i)
			System.out.println(i);
		}
		
	}

}
