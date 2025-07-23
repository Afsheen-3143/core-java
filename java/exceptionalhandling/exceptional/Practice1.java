package exceptional;

public class Practice1 {
	public static void main(String[] args) {
		try {
			int number=10/5;
		}
		catch(ArithmeticException e) {
			System.out.println("zero cannot be divide by any number");
			
		}
		finally {
			System.out.println("the program is executed");
			throw new RuntimeException ("new exception");
		}
	}

}

