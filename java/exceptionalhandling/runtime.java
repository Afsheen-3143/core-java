package unchecked;

public class runtime {
	public static void main (String args[]) {
		int i=9;
		int j=0;
		int k;
		try {
			 k=i/j;
			System.out.println(k);
		}
		catch(ArithmeticException ae)
		{
		System.out.println(ae.toString());
			
		}
		finally {
			System.out.println("program end");
		}
	}

}
