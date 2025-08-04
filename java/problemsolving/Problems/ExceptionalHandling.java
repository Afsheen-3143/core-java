package problemsolving;

public class ExceptionalHandling {
	public static void main(String[] args) {
		try {
			int num=10/0;
		}catch(ArithmeticException e) {
			System.out.println("exception caught"+e.getMessage());
		}try {
			
		
			int[]arr=new int[5];
			System.out.println(arr[10]);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
		}try {
			String name=null;
			name.length();
		}
		
		
		catch(NullPointerException e) {
			System.out.println("exception caught"+e.getMessage());
			e.printStackTrace();
		}

	}

}
		
