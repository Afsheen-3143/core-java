package ControlP;

public class Loop2 {
	public static void main(String[] args) {
//		int num=154;
//		int temp=num;
//		int result=0;
//		int n=String.valueOf(num).length();
//		while(temp!=0) {
//			int digit=temp%10;
//			result+=Math.pow( digit, n);
//			temp/=10;
//			
//		}
//		System.out.println(result==num? "armstrong":"not armstrong");
//		
//		palindrome of a number
//		int rev=0;
//		int num = 120;
//		int temp = num;
//		
//		while(temp!=0) {
//			int digit =temp%10;
//			rev=rev*10+digit;
//			temp/=10;
//			
//		}
//		if(num==rev) {
//			System.out.println(num+"ispalindrom");
//		}else {
//			
//			System.out.println("not palindrome");
			
//			prime numbers
			
//		int n=59;
//		boolean isprime=true;
//		if(n<=1) {
//			isprime=false;			
//		}else {
//		for(int i=2;i<=Math.sqrt(n);i++) {
//			if(n%i==0) {
//				isprime=false;
//				break;
//			}}}
//			if(isprime) 
//				System.out.println(n+"isprime");
//			else
//				System.out.println(n+"is notprime");
//		}}
//		for(int i=2;i<=n;i++) {
//			boolean isprime=true;
//			for(int j=2;j<=Math.sqrt(i);j++) {
//				if(i%j==0) {
//					isprime=false;
//					break;
//				}
//				
//			}
//			
//		if(isprime) 
//			System.out.println(" "+i);
//		
//		}}}


//LCM of a number
int a=12,b=15;
int lcm=(a>b)?a:b;
while(true) {
	if (lcm % a == 0 && lcm % b == 0) {
		System.out.println("lcm is "+lcm);
		break;
	}
	lcm++;
}}}
