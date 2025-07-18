package Arrays;

import java.util.Arrays;
//sorted array
public class Array3 {
	public static void main(String[] args) {
//		int [] arr= {3,1,5,6,7,7,1};
		
		
//		reverse of array
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
//				boolean s=true;
//		for(int i=1;i<arr.length;i++) {
//		if(arr[i]<arr[i-1]) {
//			s=false;
//			break;
//		}
//		}
//		System.out.println(s);
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
		
		
//		find largest number
		int[] arr1 = {10, 25, 5, 30};
		int max = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
		    if (arr1[i] > max) max = arr1[i];
		}
		System.out.println("Maximum: " + max);
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max)max=arr[i];
//				
//			
//			System.out.println(max);
//		}
		
//		print second largest number
//		int first=Integer.MIN_VALUE;
//		int second=Integer.MIN_VALUE;
//		for(Integer a:arr) {
//			if(a>first) {
//				second=first;
//				first=a;
//				
//			}
//			else if(a>second&&a!=first) {
//				second=a;
//			}
//		}
//		System.out.println("second largest number"+second);
		
//		print no of odd and even counts
//		int oddcount=0;
//		int evencount=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				evencount++;
//			}
//			else {
//				oddcount++;
//			}
//		}
//		// Output the counts
//        System.out.println("Even = " + evencount);
//        System.out.println("Odd = " + oddcount);
//	}
//
//}
//		sorting and removing duplicates
//		int [] arr= {3,1,5,6,7,7,1};
//		Arrays.sort(arr);
//int j=0;
//for(int i=1;i<arr.length;i++) {
//	if(arr[i]!=arr[j]) {
//		j++;
//		arr[j]=arr[i];
//		
//	}
//	}
//	for(int i=0;i<=j;i++) {
//		System.out.println(arr[i]+" ");
}}

