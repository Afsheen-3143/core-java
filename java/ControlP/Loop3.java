package ControlP;

public class Loop3 {
	public static void main(String[] args) {
		int num=123;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		while(rev!=0) {
			int d=rev%10;
			
			switch(d) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
			case 8:
				System.out.println("eight");
			case 9:
				System.out.println("nine");
				default:
			}
			rev/=10;
		}
	}

}
