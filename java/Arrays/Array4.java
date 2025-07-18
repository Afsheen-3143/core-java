package Arrays;

public class Array4 {
	public static void main(String[] args) {
		int[]arr= {7,1,5,3,6,4};
//		int start=0;
//		int end=arr.length-1;
//		boolean ispalindrome=true;
//		while(start<end) {
//			if(arr[start]!=arr[end]) {
//				ispalindrome=false;
//				break;
//			}
//				start++;
//				end--;
//			
//		}
//		if(ispalindrome) {
//			System.out.println("it is palindrome");
//			
//		}else {
//			System.out.println("it is not palindrome");
		
		int minprice=arr[0];
		int maxprofit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minprice) {
				minprice =arr[i];
			}
			int profit=arr[i]-minprice;
			if(profit>maxprofit) {
				maxprofit=profit;
			}
			
		}
	System.out.println(maxprofit);

}}
