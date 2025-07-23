package exceptional;


//rethrowing

public class Practice8 {

	public static void riskymethod() {
		try {
			int num=2/0;
		}catch(ArithmeticException e) {
			System.out.println("occured an exception");
		
		throw e;
	}
}
public static void main(String[] args) {
	try {
		riskymethod();
	}
	catch(ArithmeticException e) {
		System.out.println("caught exception in main"+e.getMessage());
	}
}}